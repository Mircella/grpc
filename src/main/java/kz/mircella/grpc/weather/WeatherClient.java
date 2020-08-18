package kz.mircella.grpc.weather;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.apache.commons.lang3.RandomUtils;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class WeatherClient {

    ManagedChannel channel;

    public void run() {
        channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
        serverStreamingCall(channel);
        clientStreamingCall(channel);

        // shutdown the channel
        System.out.println("Shutting down the channel...");
        channel.shutdown();
    }

    private void clientStreamingCall(ManagedChannel channel) {
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
                            .setLongitude(RandomUtils.nextInt(0, 1000) + it)
                            .setLatitude(RandomUtils.nextInt(0, 1000) - it)
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
