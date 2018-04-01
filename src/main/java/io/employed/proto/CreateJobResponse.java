// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/job/job_request.proto

package io.employed.proto;

/**
 * Protobuf type {@code employed.io.CreateJobResponse}
 */
public  final class CreateJobResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:employed.io.CreateJobResponse)
    CreateJobResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateJobResponse.newBuilder() to construct.
  private CreateJobResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateJobResponse() {
    status_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateJobResponse(
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
          case 8: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 18: {
            io.employed.proto.Job.Builder subBuilder = null;
            if (job_ != null) {
              subBuilder = job_.toBuilder();
            }
            job_ = input.readMessage(io.employed.proto.Job.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(job_);
              job_ = subBuilder.buildPartial();
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
    return io.employed.proto.JobRequestProto.internal_static_employed_io_CreateJobResponse_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.employed.proto.JobRequestProto.internal_static_employed_io_CreateJobResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            CreateJobResponse.class, Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.employed.io.Status status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.employed.io.Status status = 1;</code>
   */
  public io.employed.proto.Status getStatus() {
    io.employed.proto.Status result = io.employed.proto.Status.valueOf(status_);
    return result == null ? io.employed.proto.Status.UNRECOGNIZED : result;
  }

  public static final int JOB_FIELD_NUMBER = 2;
  private io.employed.proto.Job job_;
  /**
   * <code>.employed.io.Job job = 2;</code>
   */
  public boolean hasJob() {
    return job_ != null;
  }
  /**
   * <code>.employed.io.Job job = 2;</code>
   */
  public io.employed.proto.Job getJob() {
    return job_ == null ? io.employed.proto.Job.getDefaultInstance() : job_;
  }
  /**
   * <code>.employed.io.Job job = 2;</code>
   */
  public io.employed.proto.JobOrBuilder getJobOrBuilder() {
    return getJob();
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
    if (status_ != io.employed.proto.Status.FAILURE.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (job_ != null) {
      output.writeMessage(2, getJob());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != io.employed.proto.Status.FAILURE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (job_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getJob());
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
    if (!(obj instanceof CreateJobResponse)) {
      return super.equals(obj);
    }
    CreateJobResponse other = (CreateJobResponse) obj;

    boolean result = true;
    result = result && status_ == other.status_;
    result = result && (hasJob() == other.hasJob());
    if (hasJob()) {
      result = result && getJob()
          .equals(other.getJob());
    }
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (hasJob()) {
      hash = (37 * hash) + JOB_FIELD_NUMBER;
      hash = (53 * hash) + getJob().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static CreateJobResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CreateJobResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CreateJobResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CreateJobResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CreateJobResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CreateJobResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CreateJobResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CreateJobResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static CreateJobResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static CreateJobResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static CreateJobResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CreateJobResponse parseFrom(
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
  public static Builder newBuilder(CreateJobResponse prototype) {
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
   * Protobuf type {@code employed.io.CreateJobResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:employed.io.CreateJobResponse)
      io.employed.proto.CreateJobResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.employed.proto.JobRequestProto.internal_static_employed_io_CreateJobResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.employed.proto.JobRequestProto.internal_static_employed_io_CreateJobResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CreateJobResponse.class, Builder.class);
    }

    // Construct using io.employed.proto.CreateJobResponse.newBuilder()
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
      status_ = 0;

      if (jobBuilder_ == null) {
        job_ = null;
      } else {
        job_ = null;
        jobBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.employed.proto.JobRequestProto.internal_static_employed_io_CreateJobResponse_descriptor;
    }

    public CreateJobResponse getDefaultInstanceForType() {
      return CreateJobResponse.getDefaultInstance();
    }

    public CreateJobResponse build() {
      CreateJobResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public CreateJobResponse buildPartial() {
      CreateJobResponse result = new CreateJobResponse(this);
      result.status_ = status_;
      if (jobBuilder_ == null) {
        result.job_ = job_;
      } else {
        result.job_ = jobBuilder_.build();
      }
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
      if (other instanceof CreateJobResponse) {
        return mergeFrom((CreateJobResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(CreateJobResponse other) {
      if (other == CreateJobResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasJob()) {
        mergeJob(other.getJob());
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
      CreateJobResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (CreateJobResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.employed.io.Status status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.employed.io.Status status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.employed.io.Status status = 1;</code>
     */
    public io.employed.proto.Status getStatus() {
      io.employed.proto.Status result = io.employed.proto.Status.valueOf(status_);
      return result == null ? io.employed.proto.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.employed.io.Status status = 1;</code>
     */
    public Builder setStatus(io.employed.proto.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.employed.io.Status status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private io.employed.proto.Job job_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.employed.proto.Job, io.employed.proto.Job.Builder, io.employed.proto.JobOrBuilder> jobBuilder_;
    /**
     * <code>.employed.io.Job job = 2;</code>
     */
    public boolean hasJob() {
      return jobBuilder_ != null || job_ != null;
    }
    /**
     * <code>.employed.io.Job job = 2;</code>
     */
    public io.employed.proto.Job getJob() {
      if (jobBuilder_ == null) {
        return job_ == null ? io.employed.proto.Job.getDefaultInstance() : job_;
      } else {
        return jobBuilder_.getMessage();
      }
    }
    /**
     * <code>.employed.io.Job job = 2;</code>
     */
    public Builder setJob(io.employed.proto.Job value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        job_ = value;
        onChanged();
      } else {
        jobBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.employed.io.Job job = 2;</code>
     */
    public Builder setJob(
        io.employed.proto.Job.Builder builderForValue) {
      if (jobBuilder_ == null) {
        job_ = builderForValue.build();
        onChanged();
      } else {
        jobBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.employed.io.Job job = 2;</code>
     */
    public Builder mergeJob(io.employed.proto.Job value) {
      if (jobBuilder_ == null) {
        if (job_ != null) {
          job_ =
            io.employed.proto.Job.newBuilder(job_).mergeFrom(value).buildPartial();
        } else {
          job_ = value;
        }
        onChanged();
      } else {
        jobBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.employed.io.Job job = 2;</code>
     */
    public Builder clearJob() {
      if (jobBuilder_ == null) {
        job_ = null;
        onChanged();
      } else {
        job_ = null;
        jobBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.employed.io.Job job = 2;</code>
     */
    public io.employed.proto.Job.Builder getJobBuilder() {
      
      onChanged();
      return getJobFieldBuilder().getBuilder();
    }
    /**
     * <code>.employed.io.Job job = 2;</code>
     */
    public io.employed.proto.JobOrBuilder getJobOrBuilder() {
      if (jobBuilder_ != null) {
        return jobBuilder_.getMessageOrBuilder();
      } else {
        return job_ == null ?
            io.employed.proto.Job.getDefaultInstance() : job_;
      }
    }
    /**
     * <code>.employed.io.Job job = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.employed.proto.Job, io.employed.proto.Job.Builder, io.employed.proto.JobOrBuilder> 
        getJobFieldBuilder() {
      if (jobBuilder_ == null) {
        jobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.employed.proto.Job, io.employed.proto.Job.Builder, io.employed.proto.JobOrBuilder>(
                getJob(),
                getParentForChildren(),
                isClean());
        job_ = null;
      }
      return jobBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:employed.io.CreateJobResponse)
  }

  // @@protoc_insertion_point(class_scope:employed.io.CreateJobResponse)
  private static final CreateJobResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CreateJobResponse();
  }

  public static CreateJobResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateJobResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateJobResponse>() {
    public CreateJobResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateJobResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateJobResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<CreateJobResponse> getParserForType() {
    return PARSER;
  }

  public CreateJobResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

