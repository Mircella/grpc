package kz.mircella.grpc.gcdcalculator;

import io.grpc.stub.StreamObserver;

public class GCDCalculatorImpl extends GCDCalculatorGrpc.GCDCalculatorImplBase {
    @Override
    public void calculateGCD(CalculateGCDRequest request, StreamObserver<GCDResponse> responseObserver) {
        int first = request.getFirstNumber();
        int second = request.getSecondNumber();
        if (first!=0 && second!=0){
            responseObserver.onNext(GCDResponse.newBuilder().setGcd(calculateGCD(first, second)).build());
            responseObserver.onCompleted();
        } else {
            responseObserver.onError(new RuntimeException("Invalid first or second number"));
            responseObserver.onCompleted();
        }
    }

    private int calculateGCD(int first, int second){
        int remainder = first % second;
        if(remainder == 0){
            return second;
        }
        return calculateGCD(second, remainder);
    }
}
