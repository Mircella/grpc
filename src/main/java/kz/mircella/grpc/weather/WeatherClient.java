package kz.mircella.grpc.weather;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.apache.commons.lang3.RandomUtils;

import java.util.Iterator;
import java.util.function.Consumer;

public class WeatherClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
        WeatherServiceGrpc.WeatherServiceBlockingStub asyncClient = WeatherServiceGrpc.newBlockingStub(channel);

        WeatherRequest request = WeatherRequest.newBuilder()
                .setLatitude(RandomUtils.nextInt())
                .setLongitude(RandomUtils.nextInt())
                .build();
        Iterator<WeatherResponse> weatherResponsesStream = asyncClient.getWeather(request);
        weatherResponsesStream.forEachRemaining(new Consumer<WeatherResponse>() {
            @Override
            public void accept(WeatherResponse weatherResponse) {
                System.out.println("WeatherResponse:" + weatherResponse.toString());
            }
        });

        // shutdown the channel
        System.out.println("Shutting down the channel...");
        channel.shutdown();
    }
}
