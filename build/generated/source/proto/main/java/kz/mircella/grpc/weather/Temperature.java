// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: weather/weather.proto

package kz.mircella.grpc.weather;

/**
 * Protobuf type {@code weather.Temperature}
 */
public final class Temperature extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:weather.Temperature)
    TemperatureOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Temperature.newBuilder() to construct.
  private Temperature(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Temperature() {
    unit_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Temperature();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Temperature(
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
          case 9: {

            degree_ = input.readDouble();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            unit_ = rawValue;
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
    return kz.mircella.grpc.weather.Weather.internal_static_weather_Temperature_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kz.mircella.grpc.weather.Weather.internal_static_weather_Temperature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kz.mircella.grpc.weather.Temperature.class, kz.mircella.grpc.weather.Temperature.Builder.class);
  }

  /**
   * Protobuf enum {@code weather.Temperature.Unit}
   */
  public enum Unit
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CELSIUS = 0;</code>
     */
    CELSIUS(0),
    /**
     * <code>FAHRENHEIT = 1;</code>
     */
    FAHRENHEIT(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CELSIUS = 0;</code>
     */
    public static final int CELSIUS_VALUE = 0;
    /**
     * <code>FAHRENHEIT = 1;</code>
     */
    public static final int FAHRENHEIT_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Unit valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Unit forNumber(int value) {
      switch (value) {
        case 0: return CELSIUS;
        case 1: return FAHRENHEIT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Unit>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Unit> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Unit>() {
            public Unit findValueByNumber(int number) {
              return Unit.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return kz.mircella.grpc.weather.Temperature.getDescriptor().getEnumTypes().get(0);
    }

    private static final Unit[] VALUES = values();

    public static Unit valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Unit(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:weather.Temperature.Unit)
  }

  public static final int DEGREE_FIELD_NUMBER = 1;
  private double degree_;
  /**
   * <code>double degree = 1;</code>
   * @return The degree.
   */
  @java.lang.Override
  public double getDegree() {
    return degree_;
  }

  public static final int UNIT_FIELD_NUMBER = 2;
  private int unit_;
  /**
   * <code>.weather.Temperature.Unit unit = 2;</code>
   * @return The enum numeric value on the wire for unit.
   */
  @java.lang.Override public int getUnitValue() {
    return unit_;
  }
  /**
   * <code>.weather.Temperature.Unit unit = 2;</code>
   * @return The unit.
   */
  @java.lang.Override public kz.mircella.grpc.weather.Temperature.Unit getUnit() {
    @SuppressWarnings("deprecation")
    kz.mircella.grpc.weather.Temperature.Unit result = kz.mircella.grpc.weather.Temperature.Unit.valueOf(unit_);
    return result == null ? kz.mircella.grpc.weather.Temperature.Unit.UNRECOGNIZED : result;
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
    if (degree_ != 0D) {
      output.writeDouble(1, degree_);
    }
    if (unit_ != kz.mircella.grpc.weather.Temperature.Unit.CELSIUS.getNumber()) {
      output.writeEnum(2, unit_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (degree_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, degree_);
    }
    if (unit_ != kz.mircella.grpc.weather.Temperature.Unit.CELSIUS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, unit_);
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
    if (!(obj instanceof kz.mircella.grpc.weather.Temperature)) {
      return super.equals(obj);
    }
    kz.mircella.grpc.weather.Temperature other = (kz.mircella.grpc.weather.Temperature) obj;

    if (java.lang.Double.doubleToLongBits(getDegree())
        != java.lang.Double.doubleToLongBits(
            other.getDegree())) return false;
    if (unit_ != other.unit_) return false;
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
    hash = (37 * hash) + DEGREE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDegree()));
    hash = (37 * hash) + UNIT_FIELD_NUMBER;
    hash = (53 * hash) + unit_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static kz.mircella.grpc.weather.Temperature parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kz.mircella.grpc.weather.Temperature parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kz.mircella.grpc.weather.Temperature parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kz.mircella.grpc.weather.Temperature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kz.mircella.grpc.weather.Temperature parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kz.mircella.grpc.weather.Temperature parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kz.mircella.grpc.weather.Temperature parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kz.mircella.grpc.weather.Temperature parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static kz.mircella.grpc.weather.Temperature parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static kz.mircella.grpc.weather.Temperature parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static kz.mircella.grpc.weather.Temperature parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kz.mircella.grpc.weather.Temperature parseFrom(
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
  public static Builder newBuilder(kz.mircella.grpc.weather.Temperature prototype) {
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
   * Protobuf type {@code weather.Temperature}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:weather.Temperature)
      kz.mircella.grpc.weather.TemperatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kz.mircella.grpc.weather.Weather.internal_static_weather_Temperature_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kz.mircella.grpc.weather.Weather.internal_static_weather_Temperature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kz.mircella.grpc.weather.Temperature.class, kz.mircella.grpc.weather.Temperature.Builder.class);
    }

    // Construct using kz.mircella.grpc.weather.Temperature.newBuilder()
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
      degree_ = 0D;

      unit_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kz.mircella.grpc.weather.Weather.internal_static_weather_Temperature_descriptor;
    }

    @java.lang.Override
    public kz.mircella.grpc.weather.Temperature getDefaultInstanceForType() {
      return kz.mircella.grpc.weather.Temperature.getDefaultInstance();
    }

    @java.lang.Override
    public kz.mircella.grpc.weather.Temperature build() {
      kz.mircella.grpc.weather.Temperature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public kz.mircella.grpc.weather.Temperature buildPartial() {
      kz.mircella.grpc.weather.Temperature result = new kz.mircella.grpc.weather.Temperature(this);
      result.degree_ = degree_;
      result.unit_ = unit_;
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
      if (other instanceof kz.mircella.grpc.weather.Temperature) {
        return mergeFrom((kz.mircella.grpc.weather.Temperature)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kz.mircella.grpc.weather.Temperature other) {
      if (other == kz.mircella.grpc.weather.Temperature.getDefaultInstance()) return this;
      if (other.getDegree() != 0D) {
        setDegree(other.getDegree());
      }
      if (other.unit_ != 0) {
        setUnitValue(other.getUnitValue());
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
      kz.mircella.grpc.weather.Temperature parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kz.mircella.grpc.weather.Temperature) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double degree_ ;
    /**
     * <code>double degree = 1;</code>
     * @return The degree.
     */
    @java.lang.Override
    public double getDegree() {
      return degree_;
    }
    /**
     * <code>double degree = 1;</code>
     * @param value The degree to set.
     * @return This builder for chaining.
     */
    public Builder setDegree(double value) {
      
      degree_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double degree = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDegree() {
      
      degree_ = 0D;
      onChanged();
      return this;
    }

    private int unit_ = 0;
    /**
     * <code>.weather.Temperature.Unit unit = 2;</code>
     * @return The enum numeric value on the wire for unit.
     */
    @java.lang.Override public int getUnitValue() {
      return unit_;
    }
    /**
     * <code>.weather.Temperature.Unit unit = 2;</code>
     * @param value The enum numeric value on the wire for unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnitValue(int value) {
      
      unit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.weather.Temperature.Unit unit = 2;</code>
     * @return The unit.
     */
    @java.lang.Override
    public kz.mircella.grpc.weather.Temperature.Unit getUnit() {
      @SuppressWarnings("deprecation")
      kz.mircella.grpc.weather.Temperature.Unit result = kz.mircella.grpc.weather.Temperature.Unit.valueOf(unit_);
      return result == null ? kz.mircella.grpc.weather.Temperature.Unit.UNRECOGNIZED : result;
    }
    /**
     * <code>.weather.Temperature.Unit unit = 2;</code>
     * @param value The unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnit(kz.mircella.grpc.weather.Temperature.Unit value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      unit_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.weather.Temperature.Unit unit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnit() {
      
      unit_ = 0;
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


    // @@protoc_insertion_point(builder_scope:weather.Temperature)
  }

  // @@protoc_insertion_point(class_scope:weather.Temperature)
  private static final kz.mircella.grpc.weather.Temperature DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kz.mircella.grpc.weather.Temperature();
  }

  public static kz.mircella.grpc.weather.Temperature getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Temperature>
      PARSER = new com.google.protobuf.AbstractParser<Temperature>() {
    @java.lang.Override
    public Temperature parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Temperature(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Temperature> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Temperature> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public kz.mircella.grpc.weather.Temperature getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

