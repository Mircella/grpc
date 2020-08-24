package kz.mircella.grpc.blog;

import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContext;
import org.apache.commons.lang3.RandomUtils;

import javax.net.ssl.SSLException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BlogClient {

    ManagedChannel secureChannel;

    public void run() {

        try {
            //
            SslContext sslContext = GrpcSslContexts.forClient().trustManager(new File("ssl/ca.crt")).build();

            // secure channel with TLS
            secureChannel = NettyChannelBuilder
                    .forAddress("localhost", 50054)
                    .sslContext(sslContext)
                    .build();
        } catch (SSLException e) {
            e.printStackTrace();
        }
        BlogServiceGrpc.BlogServiceBlockingStub syncClient = BlogServiceGrpc.newBlockingStub(secureChannel);

        // request to server with secure channel
        List<String> blogs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String blogId = saveNewBlog(syncClient, secureChannel);
            blogs.add(blogId);
        }

        for (int i = 0; i < 5; i++) {
            updateBlog(syncClient, blogs.get(i*2));
        }

        getBlog(syncClient, blogs.get(2));
        getBlog(syncClient, blogs.get(3));
        getAllBlogs(syncClient);

        // shutdown the channel
        System.out.println("Shutting down the channel...");
        secureChannel.shutdown();
    }

    private String saveNewBlog(BlogServiceGrpc.BlogServiceBlockingStub syncClient, ManagedChannel channel) {
        System.out.println("Saving new blog...");
        CreateBlogRequest request = CreateBlogRequest.newBuilder().setBlog(randomBlog()).build();
        CreateBlogResponse response = syncClient.createBlog(request);
        System.out.println("Response is " + response);
        return response.getBlog().getId();
    }

    private void getBlog(BlogServiceGrpc.BlogServiceBlockingStub blogClient, String blogId) {
        System.out.println("Reading blog....");
        ReadBlogResponse readBlogResponse = blogClient.readBlog(ReadBlogRequest.newBuilder()
                .setBlogId(blogId)
                .build());
        System.out.println(readBlogResponse.toString());
    }

    private void updateBlog(BlogServiceGrpc.BlogServiceBlockingStub blogClient, String blogId) {
        Blog randomBlog = randomBlog();
        Blog newBlog = Blog.newBuilder()
                .setId(blogId)
                .setAuthorId(randomBlog.getAuthorId().replace("V1", "V2"))
                .setTitle(randomBlog.getTitle().replace("V1", "V2"))
                .setContent(randomBlog.getContent().replace("V1", "V2"))
                .build();

        System.out.println("Updating blog...");
        UpdateBlogResponse updateBlogResponse = blogClient.updateBlog(
                UpdateBlogRequest.newBuilder().setBlog(newBlog).build());

        System.out.println("Updated blog");
        System.out.println(updateBlogResponse.toString());
    }

    private void deleteBlog(BlogServiceGrpc.BlogServiceBlockingStub blogClient, String blogId) {
        System.out.println("Deleting blog");
        DeleteBlogResponse deleteBlogResponse = blogClient.deleteBlog(
                DeleteBlogRequest.newBuilder().setBlogId(blogId).build()
        );
        System.out.println("Deleted blog:" + deleteBlogResponse.getBlogId());
    }

    private void getAllBlogs(BlogServiceGrpc.BlogServiceBlockingStub blogClient) {
        System.out.println("Listing all blogs");
        blogClient.listBlog(ListBlogRequest.newBuilder().build()).forEachRemaining(
                listBlogResponse -> System.out.println(listBlogResponse.getBlog().toString())
        );
    }

    private Blog randomBlog() {
        String blogTitle = "V1:Harry Potter:" + RandomUtils.nextInt(0, 7);
        String content = "V1:" + blogTitle + " is great book";
        String authorId = "V1:Author:" + RandomUtils.nextInt(0, 100);
        return Blog.newBuilder().setTitle(blogTitle).setContent(content).setAuthorId(authorId).build();
    }

    public static void main(String[] args) {
        BlogClient client = new BlogClient();
        client.run();
    }
}
