// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/job-seeker/job_seeker_request.proto

package io.employed.proto;

/**
 * Protobuf type {@code employed.io.JobSeekersByTagsRequest}
 */
public  final class JobSeekersByTagsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:employed.io.JobSeekersByTagsRequest)
    JobSeekersByTagsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobSeekersByTagsRequest.newBuilder() to construct.
  private JobSeekersByTagsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobSeekersByTagsRequest() {
    tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JobSeekersByTagsRequest(
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
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              tags_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            tags_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        tags_ = tags_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return JobSeekerRequestProto.internal_static_employed_io_JobSeekersByTagsRequest_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return JobSeekerRequestProto.internal_static_employed_io_JobSeekersByTagsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            JobSeekersByTagsRequest.class, Builder.class);
  }

  public static final int TAGS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList tags_;
  /**
   * <code>repeated string tags = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getTagsList() {
    return tags_;
  }
  /**
   * <code>repeated string tags = 1;</code>
   */
  public int getTagsCount() {
    return tags_.size();
  }
  /**
   * <code>repeated string tags = 1;</code>
   */
  public String getTags(int index) {
    return tags_.get(index);
  }
  /**
   * <code>repeated string tags = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTagsBytes(int index) {
    return tags_.getByteString(index);
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
    for (int i = 0; i < tags_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tags_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < tags_.size(); i++) {
        dataSize += computeStringSizeNoTag(tags_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTagsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof JobSeekersByTagsRequest)) {
      return super.equals(obj);
    }
    JobSeekersByTagsRequest other = (JobSeekersByTagsRequest) obj;

    boolean result = true;
    result = result && getTagsList()
        .equals(other.getTagsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getTagsCount() > 0) {
      hash = (37 * hash) + TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getTagsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static JobSeekersByTagsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static JobSeekersByTagsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static JobSeekersByTagsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static JobSeekersByTagsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static JobSeekersByTagsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static JobSeekersByTagsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static JobSeekersByTagsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static JobSeekersByTagsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static JobSeekersByTagsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static JobSeekersByTagsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static JobSeekersByTagsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static JobSeekersByTagsRequest parseFrom(
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
  public static Builder newBuilder(JobSeekersByTagsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code employed.io.JobSeekersByTagsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:employed.io.JobSeekersByTagsRequest)
      io.employed.proto.JobSeekersByTagsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return JobSeekerRequestProto.internal_static_employed_io_JobSeekersByTagsRequest_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return JobSeekerRequestProto.internal_static_employed_io_JobSeekersByTagsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              JobSeekersByTagsRequest.class, Builder.class);
    }

    // Construct using io.employed.proto.JobSeekersByTagsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
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
      tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return JobSeekerRequestProto.internal_static_employed_io_JobSeekersByTagsRequest_descriptor;
    }

    public JobSeekersByTagsRequest getDefaultInstanceForType() {
      return JobSeekersByTagsRequest.getDefaultInstance();
    }

    public JobSeekersByTagsRequest build() {
      JobSeekersByTagsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public JobSeekersByTagsRequest buildPartial() {
      JobSeekersByTagsRequest result = new JobSeekersByTagsRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        tags_ = tags_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.tags_ = tags_;
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
      if (other instanceof JobSeekersByTagsRequest) {
        return mergeFrom((JobSeekersByTagsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(JobSeekersByTagsRequest other) {
      if (other == JobSeekersByTagsRequest.getDefaultInstance()) return this;
      if (!other.tags_.isEmpty()) {
        if (tags_.isEmpty()) {
          tags_ = other.tags_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTagsIsMutable();
          tags_.addAll(other.tags_);
        }
        onChanged();
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
      JobSeekersByTagsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (JobSeekersByTagsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTagsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        tags_ = new com.google.protobuf.LazyStringArrayList(tags_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string tags = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getTagsList() {
      return tags_.getUnmodifiableView();
    }
    /**
     * <code>repeated string tags = 1;</code>
     */
    public int getTagsCount() {
      return tags_.size();
    }
    /**
     * <code>repeated string tags = 1;</code>
     */
    public String getTags(int index) {
      return tags_.get(index);
    }
    /**
     * <code>repeated string tags = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTagsBytes(int index) {
      return tags_.getByteString(index);
    }
    /**
     * <code>repeated string tags = 1;</code>
     */
    public Builder setTags(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTagsIsMutable();
      tags_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 1;</code>
     */
    public Builder addTags(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTagsIsMutable();
      tags_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 1;</code>
     */
    public Builder addAllTags(
        Iterable<String> values) {
      ensureTagsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tags_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 1;</code>
     */
    public Builder clearTags() {
      tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 1;</code>
     */
    public Builder addTagsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTagsIsMutable();
      tags_.add(value);
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


    // @@protoc_insertion_point(builder_scope:employed.io.JobSeekersByTagsRequest)
  }

  // @@protoc_insertion_point(class_scope:employed.io.JobSeekersByTagsRequest)
  private static final JobSeekersByTagsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new JobSeekersByTagsRequest();
  }

  public static JobSeekersByTagsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobSeekersByTagsRequest>
      PARSER = new com.google.protobuf.AbstractParser<JobSeekersByTagsRequest>() {
    public JobSeekersByTagsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new JobSeekersByTagsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobSeekersByTagsRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<JobSeekersByTagsRequest> getParserForType() {
    return PARSER;
  }

  public JobSeekersByTagsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

