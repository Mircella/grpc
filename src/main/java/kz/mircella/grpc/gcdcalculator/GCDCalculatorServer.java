package kz.mircella.grpc.gcdcalculator;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GCDCalculatorServer {
    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(50052)
                .addService(new GCDCalculatorImpl())
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
