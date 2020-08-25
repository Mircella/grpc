package kz.mircella.grpc.greeting;

import io.grpc.stub.StreamObserver;
import kz.mircella.grpc.greet.GreetRequest;
import kz.mircella.grpc.greet.GreetResponse;
import kz.mircella.grpc.greet.GreetServiceGrpc;
import kz.mircella.grpc.greet.Greeting;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {

    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        // parsing request
        Greeting greeting = request.getGreeting();
        String firstName = greeting.getFirstName();
        String lastName = greeting.getLastName();
        String result = "Hello, " + firstName + " " + lastName;

        // building response
        GreetResponse response = GreetResponse.newBuilder().setResult(result).build();

        // send response back to client
        responseObserver.onNext(response);

        // complete RPC call
        responseObserver.onCompleted();
    }
}
