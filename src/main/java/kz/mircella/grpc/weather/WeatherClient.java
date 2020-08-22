package kz.mircella.grpc.weather;

import io.grpc.*;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContext;
import io.grpc.stub.StreamObserver;
import org.apache.commons.lang3.RandomUtils;

import javax.net.ssl.SSLException;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class WeatherClient {

    ManagedChannel channel;
    ManagedChannel secureChannel;

    public void run() {

        // unsecure channel without TLS
        channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();

        try {
            //
            SslContext sslContext = GrpcSslContexts.forClient().trustManager(new File("ssl/ca.crt")).build();

            // secure channel with TLS
            secureChannel = NettyChannelBuilder.forAddress("localhost", 50053)
                    .sslContext(sslContext).build();
        } catch (SSLException e) {
            e.printStackTrace();
        }
        // request to server with secure channel
        unaryCallWithDeadline(secureChannel);
//        serverStreamingCall(channel);
//        clientStreamingCall(channel);
//        biDiStreamingCall(channel);
//        unaryCallWithDeadline(channel);

        // shutdown the channel
        System.out.println("Shutting down the channel...");
        channel.shutdown();
    }

    private void unaryCallWithDeadline(ManagedChannel channel) {
        System.out.println("UnaryCall with Deadline...");
        // creating client (stub), must be asynchronous
        WeatherServiceGrpc.WeatherServiceBlockingStub syncClient = WeatherServiceGrpc.newBlockingStub(channel);
        WeatherRequest request = WeatherRequest.newBuilder().setLatitude(0).setLongitude(0).build();
        // setting deadline to rpc call
        try {
            WeatherResponse response = syncClient.withDeadline(Deadline.after(2, TimeUnit.SECONDS)).getWeatherWithDeadline(request);
            System.out.println("Response received:" + response);
        } catch (StatusRuntimeException e) {
            if (e.getStatus() == Status.DEADLINE_EXCEEDED) {
                System.out.println("Deadline exceeded");
            } else {
                e.printStackTrace();
            }
        }

        try {
            WeatherResponse response = syncClient.withDeadline(Deadline.after(4, TimeUnit.SECONDS)).getWeatherWithDeadline(request);
            System.out.println("Response received:" + response);
        } catch (StatusRuntimeException e) {
            if (e.getStatus() == Status.DEADLINE_EXCEEDED) {
                System.out.println("Deadline exceeded");
            } else {
                e.printStackTrace();
            }
        }

    }

    private void biDiStreamingCall(ManagedChannel channel) {
        System.out.println("BiDiStreaming...");
        // creating client (stub), must be asynchronous
        WeatherServiceGrpc.WeatherServiceStub asyncClient = WeatherServiceGrpc.newStub(channel);

        // if method is async -> to make function wait till server responds otherwise requests are sent without waiting until server terminates
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<WeatherRequest> weatherRequestObserver = asyncClient.generateWeathers(new StreamObserver<WeatherResponse>() {
            @Override
            public void onNext(WeatherResponse weatherResponse) {
                // next response from server
                // in case of client streaming onNext() is called once
                System.out.printf(
                        "Weather:t=%s %s,humidity=%s%n",
                        weatherResponse.getTemperature().getDegree(),
                        weatherResponse.getTemperature().getUnit(),
                        weatherResponse.getHumidity().getPercentage()
                );
            }

            @Override
            public void onError(Throwable t) {
                // error occurred
                System.out.println("Error occurred: " + t.getLocalizedMessage());
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                // server is done sending data
                // in case of client streaming onCompleted() is returned right after onNext()
                System.out.println("Server is done");

                // allows method to finish, as countDownLatch releases when value reaches zero
                latch.countDown();
            }
        });
        // passing data to request observer to send to server
        IntStream.range(0, 50).forEach(it -> {
            System.out.println("Sending request " + it);
            weatherRequestObserver.onNext(
                    WeatherRequest.newBuilder()
                            .setLongitude(RandomUtils.nextInt(0, 1000) + it)
                            .setLatitude(RandomUtils.nextInt(0, 1000) - it)
                            .build());
            try {
                Thread.sleep(RandomUtils.nextLong(0, 3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        weatherRequestObserver.onCompleted();
        try {
            latch.await(); // makes method to keep running and await until smth will release it
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void clientStreamingCall(ManagedChannel channel) {
        System.out.println("ClientStreaming...");
        // creating client (stub), for client streaming client must be asynchronous
        WeatherServiceGrpc.WeatherServiceStub asyncClient = WeatherServiceGrpc.newStub(channel);

        // to make function wait till server responds otherwise requests are sent without waiting until server terminates
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<WeatherRequest> requestStreamObserver = asyncClient.getWeather(new StreamObserver<WeatherResponse>() { // handling stream of WeatherResponses from server
            @Override
            public void onNext(WeatherResponse weatherResponse) {
                // next response from server
                // in case of client streaming onNext() is called once
                System.out.printf(
                        "Average weather:t=%s%s,humidity=%s%n",
                        weatherResponse.getTemperature().getDegree(),
                        weatherResponse.getTemperature().getUnit(),
                        weatherResponse.getHumidity().getPercentage()
                );
            }

            @Override
            public void onError(Throwable t) {
                // error handling
                System.out.println("Error occurred: " + t.getLocalizedMessage());
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                // server is done sending data
                // in case of client streaming onCompleted() is returned right after onNext()
                System.out.println("Server is done");

                // allows method to finish, as countDownLatch releases when value reaches zero
                latch.countDown();
            }
        });

        // passing data to request observer to send to server
        IntStream.range(0, 10).forEach(it -> {
            System.out.println("Sending request " + it);
            requestStreamObserver.onNext(
                    WeatherRequest.newBuilder()
                            .setLongitude(RandomUtils.nextInt(0, 500) + it)
                            .setLatitude(RandomUtils.nextInt(0, 500) - it)
                            .build());
        });
        requestStreamObserver.onCompleted();
        try {
            latch.await(); // makes method to keep running and await until smth will release it
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void serverStreamingCall(ManagedChannel channel) {
        System.out.println("ServerStreaming...");
        WeatherServiceGrpc.WeatherServiceBlockingStub syncClient = WeatherServiceGrpc.newBlockingStub(channel);
        WeatherRequest request = WeatherRequest.newBuilder()
                .setLatitude(RandomUtils.nextInt())
                .setLongitude(RandomUtils.nextInt())
                .build();
        Iterator<WeatherResponse> weatherResponsesStream = syncClient.getWeatherStream(request);

        weatherResponsesStream.forEachRemaining(new Consumer<WeatherResponse>() {
            @Override
            public void accept(WeatherResponse weatherResponse) {
                System.out.println("WeatherResponse:" + weatherResponse.toString());
            }
        });
    }

    public static void main(String[] args) {
        WeatherClient client = new WeatherClient();
        client.run();
    }
}
