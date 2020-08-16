package kz.mircella.grpc.greeting.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GreetingServer {

    public static void main(String[] args) {

        Server server = ServerBuilder.forPort(50051).build();
        try {
            server.start();

            // for handling shutdown properly, if application receives shutdown request
            Runtime.getRuntime().addShutdownHook(
                    new Thread(() -> {
                        System.out.println("Received shutdown request");
                        server.shutdown();
                        System.out.println("Server was successfully stopped");
                    })
            );

            // make sure server is awaiting termination
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
