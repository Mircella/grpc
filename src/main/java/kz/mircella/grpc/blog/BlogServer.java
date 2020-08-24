package kz.mircella.grpc.blog;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;

import java.io.File;
import java.io.IOException;

public class BlogServer {
    public static void main(String[] args) {

        Server server = ServerBuilder.forPort(50054)
                .addService(new BlogServiceImpl())
                .addService(ProtoReflectionService.newInstance())
                .useTransportSecurity(new File("ssl/server.crt"), new File("ssl/server.pem"))
                .build();

        try {
            server.start();
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("Received shutdown request");
                server.shutdown();
                System.out.println("Server was stopped");
            }));
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
