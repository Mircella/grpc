package kz.mircella.grpc.gcdcalculator;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GCDCalculatorClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
        GCDCalculatorGrpc.GCDCalculatorBlockingStub syncClient = GCDCalculatorGrpc.newBlockingStub(channel);

        CalculateGCDRequest request = CalculateGCDRequest.newBuilder().setFirstNumber(270).setSecondNumber(192).build();
        GCDResponse gcdResponse = syncClient.calculateGCD(request);
        System.out.println("GCD:" + gcdResponse.getGcd());

        // shutdown the channel
        System.out.println("Shutting down the channel...");
        channel.shutdown();
    }
}
