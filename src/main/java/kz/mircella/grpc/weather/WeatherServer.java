package kz.mircella.grpc.weather;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;

import java.io.File;
import java.io.IOException;

public class WeatherServer {

    public static void main(String[] args) {
        // plaintext not secure server
//        Server server = ServerBuilder.forPort(50053)
//                .addService(new WeatherServiceImpl())
//                .build();

        // ssl secure server
        Server secureServer = ServerBuilder.forPort(50053)
                .addService(new WeatherServiceImpl())
                // enabling reflection on server, reflects all services added before
                .addService(ProtoReflectionService.newInstance())
//                .useTransportSecurity(new File("ssl/server.crt"), new File("ssl/server.pem"))
                .build();

        try {
            secureServer.start();
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("Received shutdown request");
                secureServer.shutdown();
                System.out.println("Server was stopped");
            }));
            secureServer.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
