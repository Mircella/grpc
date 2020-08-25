package kz.mircella.grpc.demo;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.1)",
    comments = "Source: authentication/demo.proto")
public final class DemoServiceGrpc {

  private DemoServiceGrpc() {}

  public static final String SERVICE_NAME = "authentication.DemoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kz.mircella.grpc.demo.FibonacciRequest,
      kz.mircella.grpc.demo.FibonacciResponse> getFibonacciMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Fibonacci",
      requestType = kz.mircella.grpc.demo.FibonacciRequest.class,
      responseType = kz.mircella.grpc.demo.FibonacciResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kz.mircella.grpc.demo.FibonacciRequest,
      kz.mircella.grpc.demo.FibonacciResponse> getFibonacciMethod() {
    io.grpc.MethodDescriptor<kz.mircella.grpc.demo.FibonacciRequest, kz.mircella.grpc.demo.FibonacciResponse> getFibonacciMethod;
    if ((getFibonacciMethod = DemoServiceGrpc.getFibonacciMethod) == null) {
      synchronized (DemoServiceGrpc.class) {
        if ((getFibonacciMethod = DemoServiceGrpc.getFibonacciMethod) == null) {
          DemoServiceGrpc.getFibonacciMethod = getFibonacciMethod =
              io.grpc.MethodDescriptor.<kz.mircella.grpc.demo.FibonacciRequest, kz.mircella.grpc.demo.FibonacciResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Fibonacci"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kz.mircella.grpc.demo.FibonacciRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kz.mircella.grpc.demo.FibonacciResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DemoServiceMethodDescriptorSupplier("Fibonacci"))
              .build();
        }
      }
    }
    return getFibonacciMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kz.mircella.grpc.demo.FactorialRequest,
      kz.mircella.grpc.demo.FactorialResponse> getFactorialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Factorial",
      requestType = kz.mircella.grpc.demo.FactorialRequest.class,
      responseType = kz.mircella.grpc.demo.FactorialResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kz.mircella.grpc.demo.FactorialRequest,
      kz.mircella.grpc.demo.FactorialResponse> getFactorialMethod() {
    io.grpc.MethodDescriptor<kz.mircella.grpc.demo.FactorialRequest, kz.mircella.grpc.demo.FactorialResponse> getFactorialMethod;
    if ((getFactorialMethod = DemoServiceGrpc.getFactorialMethod) == null) {
      synchronized (DemoServiceGrpc.class) {
        if ((getFactorialMethod = DemoServiceGrpc.getFactorialMethod) == null) {
          DemoServiceGrpc.getFactorialMethod = getFactorialMethod =
              io.grpc.MethodDescriptor.<kz.mircella.grpc.demo.FactorialRequest, kz.mircella.grpc.demo.FactorialResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Factorial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kz.mircella.grpc.demo.FactorialRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kz.mircella.grpc.demo.FactorialResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DemoServiceMethodDescriptorSupplier("Factorial"))
              .build();
        }
      }
    }
    return getFactorialMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DemoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoServiceStub>() {
        @java.lang.Override
        public DemoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoServiceStub(channel, callOptions);
        }
      };
    return DemoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DemoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoServiceBlockingStub>() {
        @java.lang.Override
        public DemoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoServiceBlockingStub(channel, callOptions);
        }
      };
    return DemoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DemoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoServiceFutureStub>() {
        @java.lang.Override
        public DemoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoServiceFutureStub(channel, callOptions);
        }
      };
    return DemoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DemoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void fibonacci(kz.mircella.grpc.demo.FibonacciRequest request,
        io.grpc.stub.StreamObserver<kz.mircella.grpc.demo.FibonacciResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFibonacciMethod(), responseObserver);
    }

    /**
     */
    public void factorial(kz.mircella.grpc.demo.FactorialRequest request,
        io.grpc.stub.StreamObserver<kz.mircella.grpc.demo.FactorialResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFactorialMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFibonacciMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kz.mircella.grpc.demo.FibonacciRequest,
                kz.mircella.grpc.demo.FibonacciResponse>(
                  this, METHODID_FIBONACCI)))
          .addMethod(
            getFactorialMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kz.mircella.grpc.demo.FactorialRequest,
                kz.mircella.grpc.demo.FactorialResponse>(
                  this, METHODID_FACTORIAL)))
          .build();
    }
  }

  /**
   */
  public static final class DemoServiceStub extends io.grpc.stub.AbstractAsyncStub<DemoServiceStub> {
    private DemoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoServiceStub(channel, callOptions);
    }

    /**
     */
    public void fibonacci(kz.mircella.grpc.demo.FibonacciRequest request,
        io.grpc.stub.StreamObserver<kz.mircella.grpc.demo.FibonacciResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFibonacciMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void factorial(kz.mircella.grpc.demo.FactorialRequest request,
        io.grpc.stub.StreamObserver<kz.mircella.grpc.demo.FactorialResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFactorialMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DemoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DemoServiceBlockingStub> {
    private DemoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kz.mircella.grpc.demo.FibonacciResponse fibonacci(kz.mircella.grpc.demo.FibonacciRequest request) {
      return blockingUnaryCall(
          getChannel(), getFibonacciMethod(), getCallOptions(), request);
    }

    /**
     */
    public kz.mircella.grpc.demo.FactorialResponse factorial(kz.mircella.grpc.demo.FactorialRequest request) {
      return blockingUnaryCall(
          getChannel(), getFactorialMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DemoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DemoServiceFutureStub> {
    private DemoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kz.mircella.grpc.demo.FibonacciResponse> fibonacci(
        kz.mircella.grpc.demo.FibonacciRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFibonacciMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kz.mircella.grpc.demo.FactorialResponse> factorial(
        kz.mircella.grpc.demo.FactorialRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFactorialMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIBONACCI = 0;
  private static final int METHODID_FACTORIAL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DemoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DemoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIBONACCI:
          serviceImpl.fibonacci((kz.mircella.grpc.demo.FibonacciRequest) request,
              (io.grpc.stub.StreamObserver<kz.mircella.grpc.demo.FibonacciResponse>) responseObserver);
          break;
        case METHODID_FACTORIAL:
          serviceImpl.factorial((kz.mircella.grpc.demo.FactorialRequest) request,
              (io.grpc.stub.StreamObserver<kz.mircella.grpc.demo.FactorialResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DemoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DemoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kz.mircella.grpc.demo.Demo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DemoService");
    }
  }

  private static final class DemoServiceFileDescriptorSupplier
      extends DemoServiceBaseDescriptorSupplier {
    DemoServiceFileDescriptorSupplier() {}
  }

  private static final class DemoServiceMethodDescriptorSupplier
      extends DemoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DemoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DemoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DemoServiceFileDescriptorSupplier())
              .addMethod(getFibonacciMethod())
              .addMethod(getFactorialMethod())
              .build();
        }
      }
    }
    return result;
  }
}
