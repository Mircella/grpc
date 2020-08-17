// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gcdcalculator/gcdcalculator.proto

package kz.mircella.grpc.gcdcalculator;

/**
 * Protobuf type {@code gcdcalculator.CalculateGCDRequest}
 */
public final class CalculateGCDRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gcdcalculator.CalculateGCDRequest)
    CalculateGCDRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalculateGCDRequest.newBuilder() to construct.
  private CalculateGCDRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalculateGCDRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CalculateGCDRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CalculateGCDRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            firstNumber_ = input.readInt32();
            break;
          }
          case 16: {

            secondNumber_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return kz.mircella.grpc.gcdcalculator.Gcdcalculator.internal_static_gcdcalculator_CalculateGCDRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kz.mircella.grpc.gcdcalculator.Gcdcalculator.internal_static_gcdcalculator_CalculateGCDRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kz.mircella.grpc.gcdcalculator.CalculateGCDRequest.class, kz.mircella.grpc.gcdcalculator.CalculateGCDRequest.Builder.class);
  }

  public static final int FIRST_NUMBER_FIELD_NUMBER = 1;
  private int firstNumber_;
  /**
   * <code>int32 first_number = 1;</code>
   * @return The firstNumber.
   */
  @java.lang.Override
  public int getFirstNumber() {
    return firstNumber_;
  }

  public static final int SECOND_NUMBER_FIELD_NUMBER = 2;
  private int secondNumber_;
  /**
   * <code>int32 second_number = 2;</code>
   * @return The secondNumber.
   */
  @java.lang.Override
  public int getSecondNumber() {
    return secondNumber_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (firstNumber_ != 0) {
      output.writeInt32(1, firstNumber_);
    }
    if (secondNumber_ != 0) {
      output.writeInt32(2, secondNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (firstNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, firstNumber_);
    }
    if (secondNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, secondNumber_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof kz.mircella.grpc.gcdcalculator.CalculateGCDRequest)) {
      return super.equals(obj);
    }
    kz.mircella.grpc.gcdcalculator.CalculateGCDRequest other = (kz.mircella.grpc.gcdcalculator.CalculateGCDRequest) obj;

    if (getFirstNumber()
        != other.getFirstNumber()) return false;
    if (getSecondNumber()
        != other.getSecondNumber()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FIRST_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getFirstNumber();
    hash = (37 * hash) + SECOND_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getSecondNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static kz.mircella.grpc.gcdcalculator.CalculateGCDRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kz.mircella.grpc.gcdcalculator.CalculateGCDRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kz.mircella.grpc.gcdcalculator.CalculateGCDRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kz.mircella.grpc.gcdcalculator.CalculateGCDRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kz.mircella.grpc.gcdcalculator.CalculateGCDRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kz.mircella.grpc.gcdcalculator.CalculateGCDRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kz.mircella.grpc.gcdcalculator.CalculateGCDRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kz.mircella.grpc.gcdcalculator.CalculateGCDRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static kz.mircella.grpc.gcdcalculator.CalculateGCDRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static kz.mircella.grpc.gcdcalculator.CalculateGCDRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static kz.mircella.grpc.gcdcalculator.CalculateGCDRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kz.mircella.grpc.gcdcalculator.CalculateGCDRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(kz.mircella.grpc.gcdcalculator.CalculateGCDRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code gcdcalculator.CalculateGCDRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gcdcalculator.CalculateGCDRequest)
      kz.mircella.grpc.gcdcalculator.CalculateGCDRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kz.mircella.grpc.gcdcalculator.Gcdcalculator.internal_static_gcdcalculator_CalculateGCDRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kz.mircella.grpc.gcdcalculator.Gcdcalculator.internal_static_gcdcalculator_CalculateGCDRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kz.mircella.grpc.gcdcalculator.CalculateGCDRequest.class, kz.mircella.grpc.gcdcalculator.CalculateGCDRequest.Builder.class);
    }

    // Construct using kz.mircella.grpc.gcdcalculator.CalculateGCDRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      firstNumber_ = 0;

      secondNumber_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kz.mircella.grpc.gcdcalculator.Gcdcalculator.internal_static_gcdcalculator_CalculateGCDRequest_descriptor;
    }

    @java.lang.Override
    public kz.mircella.grpc.gcdcalculator.CalculateGCDRequest getDefaultInstanceForType() {
      return kz.mircella.grpc.gcdcalculator.CalculateGCDRequest.getDefaultInstance();
    }

    @java.lang.Override
    public kz.mircella.grpc.gcdcalculator.CalculateGCDRequest build() {
      kz.mircella.grpc.gcdcalculator.CalculateGCDRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public kz.mircella.grpc.gcdcalculator.CalculateGCDRequest buildPartial() {
      kz.mircella.grpc.gcdcalculator.CalculateGCDRequest result = new kz.mircella.grpc.gcdcalculator.CalculateGCDRequest(this);
      result.firstNumber_ = firstNumber_;
      result.secondNumber_ = secondNumber_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof kz.mircella.grpc.gcdcalculator.CalculateGCDRequest) {
        return mergeFrom((kz.mircella.grpc.gcdcalculator.CalculateGCDRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kz.mircella.grpc.gcdcalculator.CalculateGCDRequest other) {
      if (other == kz.mircella.grpc.gcdcalculator.CalculateGCDRequest.getDefaultInstance()) return this;
      if (other.getFirstNumber() != 0) {
        setFirstNumber(other.getFirstNumber());
      }
      if (other.getSecondNumber() != 0) {
        setSecondNumber(other.getSecondNumber());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      kz.mircella.grpc.gcdcalculator.CalculateGCDRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kz.mircella.grpc.gcdcalculator.CalculateGCDRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int firstNumber_ ;
    /**
     * <code>int32 first_number = 1;</code>
     * @return The firstNumber.
     */
    @java.lang.Override
    public int getFirstNumber() {
      return firstNumber_;
    }
    /**
     * <code>int32 first_number = 1;</code>
     * @param value The firstNumber to set.
     * @return This builder for chaining.
     */
    public Builder setFirstNumber(int value) {
      
      firstNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 first_number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstNumber() {
      
      firstNumber_ = 0;
      onChanged();
      return this;
    }

    private int secondNumber_ ;
    /**
     * <code>int32 second_number = 2;</code>
     * @return The secondNumber.
     */
    @java.lang.Override
    public int getSecondNumber() {
      return secondNumber_;
    }
    /**
     * <code>int32 second_number = 2;</code>
     * @param value The secondNumber to set.
     * @return This builder for chaining.
     */
    public Builder setSecondNumber(int value) {
      
      secondNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 second_number = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecondNumber() {
      
      secondNumber_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:gcdcalculator.CalculateGCDRequest)
  }

  // @@protoc_insertion_point(class_scope:gcdcalculator.CalculateGCDRequest)
  private static final kz.mircella.grpc.gcdcalculator.CalculateGCDRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kz.mircella.grpc.gcdcalculator.CalculateGCDRequest();
  }

  public static kz.mircella.grpc.gcdcalculator.CalculateGCDRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalculateGCDRequest>
      PARSER = new com.google.protobuf.AbstractParser<CalculateGCDRequest>() {
    @java.lang.Override
    public CalculateGCDRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CalculateGCDRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CalculateGCDRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalculateGCDRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public kz.mircella.grpc.gcdcalculator.CalculateGCDRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

