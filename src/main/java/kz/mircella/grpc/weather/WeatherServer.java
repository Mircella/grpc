package kz.mircella.grpc.weather;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class WeatherServer {

    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(50053)
                .addService(new WeatherServiceImpl())
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
