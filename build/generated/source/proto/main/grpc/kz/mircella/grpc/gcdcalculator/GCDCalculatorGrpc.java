package kz.mircella.grpc.gcdcalculator;

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
    comments = "Source: gcdcalculator/gcdcalculator.proto")
public final class GCDCalculatorGrpc {

  private GCDCalculatorGrpc() {}

  public static final String SERVICE_NAME = "gcdcalculator.GCDCalculator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kz.mircella.grpc.gcdcalculator.CalculateGCDRequest,
      kz.mircella.grpc.gcdcalculator.GCDResponse> getCalculateGCDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculateGCD",
      requestType = kz.mircella.grpc.gcdcalculator.CalculateGCDRequest.class,
      responseType = kz.mircella.grpc.gcdcalculator.GCDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kz.mircella.grpc.gcdcalculator.CalculateGCDRequest,
      kz.mircella.grpc.gcdcalculator.GCDResponse> getCalculateGCDMethod() {
    io.grpc.MethodDescriptor<kz.mircella.grpc.gcdcalculator.CalculateGCDRequest, kz.mircella.grpc.gcdcalculator.GCDResponse> getCalculateGCDMethod;
    if ((getCalculateGCDMethod = GCDCalculatorGrpc.getCalculateGCDMethod) == null) {
      synchronized (GCDCalculatorGrpc.class) {
        if ((getCalculateGCDMethod = GCDCalculatorGrpc.getCalculateGCDMethod) == null) {
          GCDCalculatorGrpc.getCalculateGCDMethod = getCalculateGCDMethod =
              io.grpc.MethodDescriptor.<kz.mircella.grpc.gcdcalculator.CalculateGCDRequest, kz.mircella.grpc.gcdcalculator.GCDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "calculateGCD"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kz.mircella.grpc.gcdcalculator.CalculateGCDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kz.mircella.grpc.gcdcalculator.GCDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GCDCalculatorMethodDescriptorSupplier("calculateGCD"))
              .build();
        }
      }
    }
    return getCalculateGCDMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GCDCalculatorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GCDCalculatorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GCDCalculatorStub>() {
        @java.lang.Override
        public GCDCalculatorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GCDCalculatorStub(channel, callOptions);
        }
      };
    return GCDCalculatorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GCDCalculatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GCDCalculatorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GCDCalculatorBlockingStub>() {
        @java.lang.Override
        public GCDCalculatorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GCDCalculatorBlockingStub(channel, callOptions);
        }
      };
    return GCDCalculatorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GCDCalculatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GCDCalculatorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GCDCalculatorFutureStub>() {
        @java.lang.Override
        public GCDCalculatorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GCDCalculatorFutureStub(channel, callOptions);
        }
      };
    return GCDCalculatorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GCDCalculatorImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculateGCD(kz.mircella.grpc.gcdcalculator.CalculateGCDRequest request,
        io.grpc.stub.StreamObserver<kz.mircella.grpc.gcdcalculator.GCDResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculateGCDMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateGCDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kz.mircella.grpc.gcdcalculator.CalculateGCDRequest,
                kz.mircella.grpc.gcdcalculator.GCDResponse>(
                  this, METHODID_CALCULATE_GCD)))
          .build();
    }
  }

  /**
   */
  public static final class GCDCalculatorStub extends io.grpc.stub.AbstractAsyncStub<GCDCalculatorStub> {
    private GCDCalculatorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GCDCalculatorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GCDCalculatorStub(channel, callOptions);
    }

    /**
     */
    public void calculateGCD(kz.mircella.grpc.gcdcalculator.CalculateGCDRequest request,
        io.grpc.stub.StreamObserver<kz.mircella.grpc.gcdcalculator.GCDResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculateGCDMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GCDCalculatorBlockingStub extends io.grpc.stub.AbstractBlockingStub<GCDCalculatorBlockingStub> {
    private GCDCalculatorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GCDCalculatorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GCDCalculatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public kz.mircella.grpc.gcdcalculator.GCDResponse calculateGCD(kz.mircella.grpc.gcdcalculator.CalculateGCDRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculateGCDMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GCDCalculatorFutureStub extends io.grpc.stub.AbstractFutureStub<GCDCalculatorFutureStub> {
    private GCDCalculatorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GCDCalculatorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GCDCalculatorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kz.mircella.grpc.gcdcalculator.GCDResponse> calculateGCD(
        kz.mircella.grpc.gcdcalculator.CalculateGCDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculateGCDMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE_GCD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GCDCalculatorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GCDCalculatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE_GCD:
          serviceImpl.calculateGCD((kz.mircella.grpc.gcdcalculator.CalculateGCDRequest) request,
              (io.grpc.stub.StreamObserver<kz.mircella.grpc.gcdcalculator.GCDResponse>) responseObserver);
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

  private static abstract class GCDCalculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GCDCalculatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kz.mircella.grpc.gcdcalculator.Gcdcalculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GCDCalculator");
    }
  }

  private static final class GCDCalculatorFileDescriptorSupplier
      extends GCDCalculatorBaseDescriptorSupplier {
    GCDCalculatorFileDescriptorSupplier() {}
  }

  private static final class GCDCalculatorMethodDescriptorSupplier
      extends GCDCalculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GCDCalculatorMethodDescriptorSupplier(String methodName) {
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
      synchronized (GCDCalculatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GCDCalculatorFileDescriptorSupplier())
              .addMethod(getCalculateGCDMethod())
              .build();
        }
      }
    }
    return result;
  }
}
