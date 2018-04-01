// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/common/location.proto

package io.employed.proto;

/**
 * Protobuf type {@code employed.io.Location}
 */
public  final class Location extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:employed.io.Location)
    LocationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Location.newBuilder() to construct.
  private Location(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Location() {
    latitude_ = 0D;
    longitude_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Location(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            io.employed.proto.Address.Builder subBuilder = null;
            if (address_ != null) {
              subBuilder = address_.toBuilder();
            }
            address_ = input.readMessage(io.employed.proto.Address.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(address_);
              address_ = subBuilder.buildPartial();
            }

            break;
          }
          case 17: {

            latitude_ = input.readDouble();
            break;
          }
          case 25: {

            longitude_ = input.readDouble();
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
    return io.employed.proto.LocationProto.internal_static_employed_io_Location_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.employed.proto.LocationProto.internal_static_employed_io_Location_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.employed.proto.Location.class, io.employed.proto.Location.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  private io.employed.proto.Address address_;
  /**
   * <code>.employed.io.Address address = 1;</code>
   */
  public boolean hasAddress() {
    return address_ != null;
  }
  /**
   * <code>.employed.io.Address address = 1;</code>
   */
  public io.employed.proto.Address getAddress() {
    return address_ == null ? io.employed.proto.Address.getDefaultInstance() : address_;
  }
  /**
   * <code>.employed.io.Address address = 1;</code>
   */
  public io.employed.proto.AddressOrBuilder getAddressOrBuilder() {
    return getAddress();
  }

  public static final int LATITUDE_FIELD_NUMBER = 2;
  private double latitude_;
  /**
   * <code>double latitude = 2;</code>
   */
  public double getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 3;
  private double longitude_;
  /**
   * <code>double longitude = 3;</code>
   */
  public double getLongitude() {
    return longitude_;
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
    if (address_ != null) {
      output.writeMessage(1, getAddress());
    }
    if (latitude_ != 0D) {
      output.writeDouble(2, latitude_);
    }
    if (longitude_ != 0D) {
      output.writeDouble(3, longitude_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (address_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAddress());
    }
    if (latitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, latitude_);
    }
    if (longitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, longitude_);
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
    if (!(obj instanceof io.employed.proto.Location)) {
      return super.equals(obj);
    }
    io.employed.proto.Location other = (io.employed.proto.Location) obj;

    boolean result = true;
    result = result && (hasAddress() == other.hasAddress());
    if (hasAddress()) {
      result = result && getAddress()
          .equals(other.getAddress());
    }
    result = result && (
        java.lang.Double.doubleToLongBits(getLatitude())
        == java.lang.Double.doubleToLongBits(
            other.getLatitude()));
    result = result && (
        java.lang.Double.doubleToLongBits(getLongitude())
        == java.lang.Double.doubleToLongBits(
            other.getLongitude()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAddress()) {
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
    }
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLatitude()));
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLongitude()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.employed.proto.Location parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.employed.proto.Location parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.employed.proto.Location parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.employed.proto.Location parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.employed.proto.Location parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.employed.proto.Location parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.employed.proto.Location parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.employed.proto.Location parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.employed.proto.Location parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.employed.proto.Location parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.employed.proto.Location parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.employed.proto.Location parseFrom(
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
  public static Builder newBuilder(io.employed.proto.Location prototype) {
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
   * Protobuf type {@code employed.io.Location}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:employed.io.Location)
      io.employed.proto.LocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.employed.proto.LocationProto.internal_static_employed_io_Location_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.employed.proto.LocationProto.internal_static_employed_io_Location_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.employed.proto.Location.class, io.employed.proto.Location.Builder.class);
    }

    // Construct using io.employed.proto.Location.newBuilder()
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
      if (addressBuilder_ == null) {
        address_ = null;
      } else {
        address_ = null;
        addressBuilder_ = null;
      }
      latitude_ = 0D;

      longitude_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.employed.proto.LocationProto.internal_static_employed_io_Location_descriptor;
    }

    public io.employed.proto.Location getDefaultInstanceForType() {
      return io.employed.proto.Location.getDefaultInstance();
    }

    public io.employed.proto.Location build() {
      io.employed.proto.Location result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.employed.proto.Location buildPartial() {
      io.employed.proto.Location result = new io.employed.proto.Location(this);
      if (addressBuilder_ == null) {
        result.address_ = address_;
      } else {
        result.address_ = addressBuilder_.build();
      }
      result.latitude_ = latitude_;
      result.longitude_ = longitude_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.employed.proto.Location) {
        return mergeFrom((io.employed.proto.Location)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.employed.proto.Location other) {
      if (other == io.employed.proto.Location.getDefaultInstance()) return this;
      if (other.hasAddress()) {
        mergeAddress(other.getAddress());
      }
      if (other.getLatitude() != 0D) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0D) {
        setLongitude(other.getLongitude());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      io.employed.proto.Location parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.employed.proto.Location) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.employed.proto.Address address_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.employed.proto.Address, io.employed.proto.Address.Builder, io.employed.proto.AddressOrBuilder> addressBuilder_;
    /**
     * <code>.employed.io.Address address = 1;</code>
     */
    public boolean hasAddress() {
      return addressBuilder_ != null || address_ != null;
    }
    /**
     * <code>.employed.io.Address address = 1;</code>
     */
    public io.employed.proto.Address getAddress() {
      if (addressBuilder_ == null) {
        return address_ == null ? io.employed.proto.Address.getDefaultInstance() : address_;
      } else {
        return addressBuilder_.getMessage();
      }
    }
    /**
     * <code>.employed.io.Address address = 1;</code>
     */
    public Builder setAddress(io.employed.proto.Address value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        address_ = value;
        onChanged();
      } else {
        addressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.employed.io.Address address = 1;</code>
     */
    public Builder setAddress(
        io.employed.proto.Address.Builder builderForValue) {
      if (addressBuilder_ == null) {
        address_ = builderForValue.build();
        onChanged();
      } else {
        addressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.employed.io.Address address = 1;</code>
     */
    public Builder mergeAddress(io.employed.proto.Address value) {
      if (addressBuilder_ == null) {
        if (address_ != null) {
          address_ =
            io.employed.proto.Address.newBuilder(address_).mergeFrom(value).buildPartial();
        } else {
          address_ = value;
        }
        onChanged();
      } else {
        addressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.employed.io.Address address = 1;</code>
     */
    public Builder clearAddress() {
      if (addressBuilder_ == null) {
        address_ = null;
        onChanged();
      } else {
        address_ = null;
        addressBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.employed.io.Address address = 1;</code>
     */
    public io.employed.proto.Address.Builder getAddressBuilder() {
      
      onChanged();
      return getAddressFieldBuilder().getBuilder();
    }
    /**
     * <code>.employed.io.Address address = 1;</code>
     */
    public io.employed.proto.AddressOrBuilder getAddressOrBuilder() {
      if (addressBuilder_ != null) {
        return addressBuilder_.getMessageOrBuilder();
      } else {
        return address_ == null ?
            io.employed.proto.Address.getDefaultInstance() : address_;
      }
    }
    /**
     * <code>.employed.io.Address address = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.employed.proto.Address, io.employed.proto.Address.Builder, io.employed.proto.AddressOrBuilder> 
        getAddressFieldBuilder() {
      if (addressBuilder_ == null) {
        addressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.employed.proto.Address, io.employed.proto.Address.Builder, io.employed.proto.AddressOrBuilder>(
                getAddress(),
                getParentForChildren(),
                isClean());
        address_ = null;
      }
      return addressBuilder_;
    }

    private double latitude_ ;
    /**
     * <code>double latitude = 2;</code>
     */
    public double getLatitude() {
      return latitude_;
    }
    /**
     * <code>double latitude = 2;</code>
     */
    public Builder setLatitude(double value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double latitude = 2;</code>
     */
    public Builder clearLatitude() {
      
      latitude_ = 0D;
      onChanged();
      return this;
    }

    private double longitude_ ;
    /**
     * <code>double longitude = 3;</code>
     */
    public double getLongitude() {
      return longitude_;
    }
    /**
     * <code>double longitude = 3;</code>
     */
    public Builder setLongitude(double value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double longitude = 3;</code>
     */
    public Builder clearLongitude() {
      
      longitude_ = 0D;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:employed.io.Location)
  }

  // @@protoc_insertion_point(class_scope:employed.io.Location)
  private static final io.employed.proto.Location DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.employed.proto.Location();
  }

  public static io.employed.proto.Location getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Location>
      PARSER = new com.google.protobuf.AbstractParser<Location>() {
    public Location parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Location(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Location> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Location> getParserForType() {
    return PARSER;
  }

  public io.employed.proto.Location getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

