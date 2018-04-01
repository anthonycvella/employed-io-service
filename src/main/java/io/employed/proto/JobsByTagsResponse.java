// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/job/job_request.proto

package io.employed.proto;

/**
 * Protobuf type {@code employed.io.JobsByTagsResponse}
 */
public  final class JobsByTagsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:employed.io.JobsByTagsResponse)
    JobsByTagsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobsByTagsResponse.newBuilder() to construct.
  private JobsByTagsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobsByTagsResponse() {
    jobs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JobsByTagsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              jobs_ = new java.util.ArrayList<io.employed.proto.Job>();
              mutable_bitField0_ |= 0x00000001;
            }
            jobs_.add(
                input.readMessage(io.employed.proto.Job.parser(), extensionRegistry));
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
        jobs_ = java.util.Collections.unmodifiableList(jobs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.employed.proto.JobRequestProto.internal_static_employed_io_JobsByTagsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.employed.proto.JobRequestProto.internal_static_employed_io_JobsByTagsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.employed.proto.JobsByTagsResponse.class, io.employed.proto.JobsByTagsResponse.Builder.class);
  }

  public static final int JOBS_FIELD_NUMBER = 1;
  private java.util.List<io.employed.proto.Job> jobs_;
  /**
   * <code>repeated .employed.io.Job jobs = 1;</code>
   */
  public java.util.List<io.employed.proto.Job> getJobsList() {
    return jobs_;
  }
  /**
   * <code>repeated .employed.io.Job jobs = 1;</code>
   */
  public java.util.List<? extends io.employed.proto.JobOrBuilder> 
      getJobsOrBuilderList() {
    return jobs_;
  }
  /**
   * <code>repeated .employed.io.Job jobs = 1;</code>
   */
  public int getJobsCount() {
    return jobs_.size();
  }
  /**
   * <code>repeated .employed.io.Job jobs = 1;</code>
   */
  public io.employed.proto.Job getJobs(int index) {
    return jobs_.get(index);
  }
  /**
   * <code>repeated .employed.io.Job jobs = 1;</code>
   */
  public io.employed.proto.JobOrBuilder getJobsOrBuilder(
      int index) {
    return jobs_.get(index);
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
    for (int i = 0; i < jobs_.size(); i++) {
      output.writeMessage(1, jobs_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < jobs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, jobs_.get(i));
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
    if (!(obj instanceof io.employed.proto.JobsByTagsResponse)) {
      return super.equals(obj);
    }
    io.employed.proto.JobsByTagsResponse other = (io.employed.proto.JobsByTagsResponse) obj;

    boolean result = true;
    result = result && getJobsList()
        .equals(other.getJobsList());
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
    if (getJobsCount() > 0) {
      hash = (37 * hash) + JOBS_FIELD_NUMBER;
      hash = (53 * hash) + getJobsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.employed.proto.JobsByTagsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.employed.proto.JobsByTagsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.employed.proto.JobsByTagsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.employed.proto.JobsByTagsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.employed.proto.JobsByTagsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.employed.proto.JobsByTagsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.employed.proto.JobsByTagsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.employed.proto.JobsByTagsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.employed.proto.JobsByTagsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.employed.proto.JobsByTagsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.employed.proto.JobsByTagsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.employed.proto.JobsByTagsResponse parseFrom(
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
  public static Builder newBuilder(io.employed.proto.JobsByTagsResponse prototype) {
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
   * Protobuf type {@code employed.io.JobsByTagsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:employed.io.JobsByTagsResponse)
      io.employed.proto.JobsByTagsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.employed.proto.JobRequestProto.internal_static_employed_io_JobsByTagsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.employed.proto.JobRequestProto.internal_static_employed_io_JobsByTagsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.employed.proto.JobsByTagsResponse.class, io.employed.proto.JobsByTagsResponse.Builder.class);
    }

    // Construct using io.employed.proto.JobsByTagsResponse.newBuilder()
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
        getJobsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (jobsBuilder_ == null) {
        jobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        jobsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.employed.proto.JobRequestProto.internal_static_employed_io_JobsByTagsResponse_descriptor;
    }

    public io.employed.proto.JobsByTagsResponse getDefaultInstanceForType() {
      return io.employed.proto.JobsByTagsResponse.getDefaultInstance();
    }

    public io.employed.proto.JobsByTagsResponse build() {
      io.employed.proto.JobsByTagsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.employed.proto.JobsByTagsResponse buildPartial() {
      io.employed.proto.JobsByTagsResponse result = new io.employed.proto.JobsByTagsResponse(this);
      int from_bitField0_ = bitField0_;
      if (jobsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          jobs_ = java.util.Collections.unmodifiableList(jobs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jobs_ = jobs_;
      } else {
        result.jobs_ = jobsBuilder_.build();
      }
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
      if (other instanceof io.employed.proto.JobsByTagsResponse) {
        return mergeFrom((io.employed.proto.JobsByTagsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.employed.proto.JobsByTagsResponse other) {
      if (other == io.employed.proto.JobsByTagsResponse.getDefaultInstance()) return this;
      if (jobsBuilder_ == null) {
        if (!other.jobs_.isEmpty()) {
          if (jobs_.isEmpty()) {
            jobs_ = other.jobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJobsIsMutable();
            jobs_.addAll(other.jobs_);
          }
          onChanged();
        }
      } else {
        if (!other.jobs_.isEmpty()) {
          if (jobsBuilder_.isEmpty()) {
            jobsBuilder_.dispose();
            jobsBuilder_ = null;
            jobs_ = other.jobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            jobsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getJobsFieldBuilder() : null;
          } else {
            jobsBuilder_.addAllMessages(other.jobs_);
          }
        }
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
      io.employed.proto.JobsByTagsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.employed.proto.JobsByTagsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.employed.proto.Job> jobs_ =
      java.util.Collections.emptyList();
    private void ensureJobsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        jobs_ = new java.util.ArrayList<io.employed.proto.Job>(jobs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.employed.proto.Job, io.employed.proto.Job.Builder, io.employed.proto.JobOrBuilder> jobsBuilder_;

    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public java.util.List<io.employed.proto.Job> getJobsList() {
      if (jobsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jobs_);
      } else {
        return jobsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public int getJobsCount() {
      if (jobsBuilder_ == null) {
        return jobs_.size();
      } else {
        return jobsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public io.employed.proto.Job getJobs(int index) {
      if (jobsBuilder_ == null) {
        return jobs_.get(index);
      } else {
        return jobsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public Builder setJobs(
        int index, io.employed.proto.Job value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.set(index, value);
        onChanged();
      } else {
        jobsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public Builder setJobs(
        int index, io.employed.proto.Job.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.set(index, builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public Builder addJobs(io.employed.proto.Job value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.add(value);
        onChanged();
      } else {
        jobsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public Builder addJobs(
        int index, io.employed.proto.Job value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.add(index, value);
        onChanged();
      } else {
        jobsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public Builder addJobs(
        io.employed.proto.Job.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.add(builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public Builder addJobs(
        int index, io.employed.proto.Job.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.add(index, builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public Builder addAllJobs(
        java.lang.Iterable<? extends io.employed.proto.Job> values) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jobs_);
        onChanged();
      } else {
        jobsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public Builder clearJobs() {
      if (jobsBuilder_ == null) {
        jobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        jobsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public Builder removeJobs(int index) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.remove(index);
        onChanged();
      } else {
        jobsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public io.employed.proto.Job.Builder getJobsBuilder(
        int index) {
      return getJobsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public io.employed.proto.JobOrBuilder getJobsOrBuilder(
        int index) {
      if (jobsBuilder_ == null) {
        return jobs_.get(index);  } else {
        return jobsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public java.util.List<? extends io.employed.proto.JobOrBuilder> 
         getJobsOrBuilderList() {
      if (jobsBuilder_ != null) {
        return jobsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jobs_);
      }
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public io.employed.proto.Job.Builder addJobsBuilder() {
      return getJobsFieldBuilder().addBuilder(
          io.employed.proto.Job.getDefaultInstance());
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public io.employed.proto.Job.Builder addJobsBuilder(
        int index) {
      return getJobsFieldBuilder().addBuilder(
          index, io.employed.proto.Job.getDefaultInstance());
    }
    /**
     * <code>repeated .employed.io.Job jobs = 1;</code>
     */
    public java.util.List<io.employed.proto.Job.Builder> 
         getJobsBuilderList() {
      return getJobsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.employed.proto.Job, io.employed.proto.Job.Builder, io.employed.proto.JobOrBuilder> 
        getJobsFieldBuilder() {
      if (jobsBuilder_ == null) {
        jobsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.employed.proto.Job, io.employed.proto.Job.Builder, io.employed.proto.JobOrBuilder>(
                jobs_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        jobs_ = null;
      }
      return jobsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:employed.io.JobsByTagsResponse)
  }

  // @@protoc_insertion_point(class_scope:employed.io.JobsByTagsResponse)
  private static final io.employed.proto.JobsByTagsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.employed.proto.JobsByTagsResponse();
  }

  public static io.employed.proto.JobsByTagsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobsByTagsResponse>
      PARSER = new com.google.protobuf.AbstractParser<JobsByTagsResponse>() {
    public JobsByTagsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new JobsByTagsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobsByTagsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobsByTagsResponse> getParserForType() {
    return PARSER;
  }

  public io.employed.proto.JobsByTagsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

