// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/calculator.proto

package kz.mircella.grpc.calculator;

/**
 * Protobuf type {@code calculator.PrimeNumberDecompositionRequest}
 */
public  final class PrimeNumberDecompositionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:calculator.PrimeNumberDecompositionRequest)
    PrimeNumberDecompositionRequestOrBuilder {
  // Use PrimeNumberDecompositionRequest.newBuilder() to construct.
  private PrimeNumberDecompositionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrimeNumberDecompositionRequest() {
    number_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PrimeNumberDecompositionRequest(
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

            number_ = input.readInt64();
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
    return kz.mircella.grpc.calculator.Calculator.internal_static_calculator_PrimeNumberDecompositionRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kz.mircella.grpc.calculator.Calculator.internal_static_calculator_PrimeNumberDecompositionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest.class, kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest.Builder.class);
  }

  public static final int NUMBER_FIELD_NUMBER = 1;
  private long number_;
  /**
   * <code>int64 number = 1;</code>
   */
  public long getNumber() {
    return number_;
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
    if (number_ != 0L) {
      output.writeInt64(1, number_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (number_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, number_);
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
    if (!(obj instanceof kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest)) {
      return super.equals(obj);
    }
    kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest other = (kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest) obj;

    boolean result = true;
    result = result && (getNumber()
        == other.getNumber());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumber());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest parseFrom(
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
  public static Builder newBuilder(kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest prototype) {
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
   * Protobuf type {@code calculator.PrimeNumberDecompositionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:calculator.PrimeNumberDecompositionRequest)
      kz.mircella.grpc.calculator.PrimeNumberDecompositionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kz.mircella.grpc.calculator.Calculator.internal_static_calculator_PrimeNumberDecompositionRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kz.mircella.grpc.calculator.Calculator.internal_static_calculator_PrimeNumberDecompositionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest.class, kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest.Builder.class);
    }

    // Construct using kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest.newBuilder()
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
      number_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kz.mircella.grpc.calculator.Calculator.internal_static_calculator_PrimeNumberDecompositionRequest_descriptor;
    }

    public kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest getDefaultInstanceForType() {
      return kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest.getDefaultInstance();
    }

    public kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest build() {
      kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest buildPartial() {
      kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest result = new kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest(this);
      result.number_ = number_;
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
      if (other instanceof kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest) {
        return mergeFrom((kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest other) {
      if (other == kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest.getDefaultInstance()) return this;
      if (other.getNumber() != 0L) {
        setNumber(other.getNumber());
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
      kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long number_ ;
    /**
     * <code>int64 number = 1;</code>
     */
    public long getNumber() {
      return number_;
    }
    /**
     * <code>int64 number = 1;</code>
     */
    public Builder setNumber(long value) {
      
      number_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 number = 1;</code>
     */
    public Builder clearNumber() {
      
      number_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:calculator.PrimeNumberDecompositionRequest)
  }

  // @@protoc_insertion_point(class_scope:calculator.PrimeNumberDecompositionRequest)
  private static final kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest();
  }

  public static kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrimeNumberDecompositionRequest>
      PARSER = new com.google.protobuf.AbstractParser<PrimeNumberDecompositionRequest>() {
    public PrimeNumberDecompositionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PrimeNumberDecompositionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PrimeNumberDecompositionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrimeNumberDecompositionRequest> getParserForType() {
    return PARSER;
  }

  public kz.mircella.grpc.calculator.PrimeNumberDecompositionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
