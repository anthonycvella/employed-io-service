// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/user.proto

package io.employed.proto;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_employed_io_Users_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_employed_io_Users_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_employed_io_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_employed_io_User_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\023protocol/user.proto\022\013employed.io\032\037goog" +
      "le/protobuf/timestamp.proto\"(\n\005Users\022\037\n\004" +
      "user\030\001 \003(\0132\021.employed.io.User\"\263\001\n\004User\022\017" +
      "\n\007user_id\030\001 \001(\t\0221\n\rcreation_date\030\002 \001(\0132\032" +
      ".google.protobuf.Timestamp\022\016\n\006handle\030\003 \001" +
      "(\t\022\022\n\nfirst_name\030\004 \001(\t\022\021\n\tlast_name\030\005 \001(" +
      "\t\022\013\n\003bio\030\006 \001(\t\022\r\n\005email\030\007 \001(\t\022\024\n\014phone_n" +
      "umber\030\010 \001(\tB \n\021io.employed.protoB\tUserPr" +
      "otoP\001b\006proto3"
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
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_employed_io_Users_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_employed_io_Users_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_employed_io_Users_descriptor,
        new String[] { "User", });
    internal_static_employed_io_User_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_employed_io_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_employed_io_User_descriptor,
        new String[] { "UserId", "CreationDate", "Handle", "FirstName", "LastName", "Bio", "Email", "PhoneNumber", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
