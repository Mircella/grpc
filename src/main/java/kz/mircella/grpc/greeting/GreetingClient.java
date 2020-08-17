package kz.mircella.grpc.greeting;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import kz.mircella.grpc.greet.GreetRequest;
import kz.mircella.grpc.greet.GreetResponse;
import kz.mircella.grpc.greet.GreetServiceGrpc;
import kz.mircella.grpc.greet.Greeting;

public class GreetingClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        System.out.println("Creating stub...");
        // usage of synchronous client to greet service stub
        GreetServiceGrpc.GreetServiceBlockingStub syncGreetClient = GreetServiceGrpc.newBlockingStub(channel);

        // actions on client
        // creating protocol buffer greeting message
        Greeting greeting = Greeting.newBuilder()
                .setFirstName("Jane")
                .setLastName("Li")
                .build();

        // creating greet request
        GreetRequest request = GreetRequest.newBuilder().setGreeting(greeting).build();

        // call & get response back
        GreetResponse response = syncGreetClient.greet(request);

        System.out.println(response.getResult());

        // shutdown the channel
        System.out.println("Shutting down the channel...");
        channel.shutdown();
    }
}
