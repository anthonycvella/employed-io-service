// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/employed_io_service.proto

package io.employed.proto;

public final class EmployedIOProto {
  private EmployedIOProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_employed_io_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_employed_io_Status_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_employed_io_ConnectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_employed_io_ConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_employed_io_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_employed_io_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\"protocol/employed_io_service.proto\022\013em" +
      "ployed.io\"\010\n\006Status\"\023\n\021ConnectionRequest" +
      "\"<\n\007Message\022\021\n\tmessageId\030\001 \001(\t\022\020\n\010timeZo" +
      "ne\030\002 \001(\t\022\014\n\004text\030\003 \001(\t2\224\001\n\021EmployedIOSer" +
      "vice\022C\n\007connect\022\036.employed.io.Connection" +
      "Request\032\024.employed.io.Message\"\0000\001\022:\n\013sen" +
      "dMessage\022\024.employed.io.Message\032\023.employe" +
      "d.io.Status\"\000B&\n\021io.employed.protoB\017Empl" +
      "oyedIOProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_employed_io_Status_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_employed_io_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_employed_io_Status_descriptor,
        new String[] { });
    internal_static_employed_io_ConnectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_employed_io_ConnectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_employed_io_ConnectionRequest_descriptor,
        new String[] { });
    internal_static_employed_io_Message_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_employed_io_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_employed_io_Message_descriptor,
        new String[] { "MessageId", "TimeZone", "Text", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
