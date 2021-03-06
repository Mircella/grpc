// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/calculator.proto

package kz.mircella.grpc.calculator;

/**
 * Protobuf type {@code calculator.PrimeNumberDecompositionResponse}
 */
public  final class PrimeNumberDecompositionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:calculator.PrimeNumberDecompositionResponse)
    PrimeNumberDecompositionResponseOrBuilder {
  // Use PrimeNumberDecompositionResponse.newBuilder() to construct.
  private PrimeNumberDecompositionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrimeNumberDecompositionResponse() {
    primeFactor_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PrimeNumberDecompositionResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            primeFactor_ = input.readInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return kz.mircella.grpc.calculator.Calculator.internal_static_calculator_PrimeNumberDecompositionResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kz.mircella.grpc.calculator.Calculator.internal_static_calculator_PrimeNumberDecompositionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse.class, kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse.Builder.class);
  }

  public static final int PRIME_FACTOR_FIELD_NUMBER = 1;
  private long primeFactor_;
  /**
   * <code>int64 prime_factor = 1;</code>
   */
  public long getPrimeFactor() {
    return primeFactor_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (primeFactor_ != 0L) {
      output.writeInt64(1, primeFactor_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (primeFactor_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, primeFactor_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse)) {
      return super.equals(obj);
    }
    kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse other = (kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse) obj;

    boolean result = true;
    result = result && (getPrimeFactor()
        == other.getPrimeFactor());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PRIME_FACTOR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPrimeFactor());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code calculator.PrimeNumberDecompositionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:calculator.PrimeNumberDecompositionResponse)
      kz.mircella.grpc.calculator.PrimeNumberDecompositionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kz.mircella.grpc.calculator.Calculator.internal_static_calculator_PrimeNumberDecompositionResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kz.mircella.grpc.calculator.Calculator.internal_static_calculator_PrimeNumberDecompositionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse.class, kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse.Builder.class);
    }

    // Construct using kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      primeFactor_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kz.mircella.grpc.calculator.Calculator.internal_static_calculator_PrimeNumberDecompositionResponse_descriptor;
    }

    public kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse getDefaultInstanceForType() {
      return kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse.getDefaultInstance();
    }

    public kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse build() {
      kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse buildPartial() {
      kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse result = new kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse(this);
      result.primeFactor_ = primeFactor_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse) {
        return mergeFrom((kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse other) {
      if (other == kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse.getDefaultInstance()) return this;
      if (other.getPrimeFactor() != 0L) {
        setPrimeFactor(other.getPrimeFactor());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long primeFactor_ ;
    /**
     * <code>int64 prime_factor = 1;</code>
     */
    public long getPrimeFactor() {
      return primeFactor_;
    }
    /**
     * <code>int64 prime_factor = 1;</code>
     */
    public Builder setPrimeFactor(long value) {
      
      primeFactor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 prime_factor = 1;</code>
     */
    public Builder clearPrimeFactor() {
      
      primeFactor_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:calculator.PrimeNumberDecompositionResponse)
  }

  // @@protoc_insertion_point(class_scope:calculator.PrimeNumberDecompositionResponse)
  private static final kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse();
  }

  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrimeNumberDecompositionResponse>
      PARSER = new com.google.protobuf.AbstractParser<PrimeNumberDecompositionResponse>() {
    public PrimeNumberDecompositionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PrimeNumberDecompositionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PrimeNumberDecompositionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrimeNumberDecompositionResponse> getParserForType() {
    return PARSER;
  }

  public kz.mircella.grpc.calculator.PrimeNumberDecompositionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

