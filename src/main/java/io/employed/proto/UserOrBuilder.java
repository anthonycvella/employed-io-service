// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/user.proto

package io.employed.proto;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:employed.io.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string uuid = 1;</code>
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 1;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>string email = 2;</code>
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 2;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string password = 3;</code>
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 3;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>repeated .employed.io.User.PhoneNumber phoneNumber = 4;</code>
   */
  java.util.List<io.employed.proto.User.PhoneNumber> 
      getPhoneNumberList();
  /**
   * <code>repeated .employed.io.User.PhoneNumber phoneNumber = 4;</code>
   */
  io.employed.proto.User.PhoneNumber getPhoneNumber(int index);
  /**
   * <code>repeated .employed.io.User.PhoneNumber phoneNumber = 4;</code>
   */
  int getPhoneNumberCount();
  /**
   * <code>repeated .employed.io.User.PhoneNumber phoneNumber = 4;</code>
   */
  java.util.List<? extends io.employed.proto.User.PhoneNumberOrBuilder> 
      getPhoneNumberOrBuilderList();
  /**
   * <code>repeated .employed.io.User.PhoneNumber phoneNumber = 4;</code>
   */
  io.employed.proto.User.PhoneNumberOrBuilder getPhoneNumberOrBuilder(
      int index);

  /**
   * <code>.employed.io.User.Birthday birthday = 5;</code>
   */
  boolean hasBirthday();
  /**
   * <code>.employed.io.User.Birthday birthday = 5;</code>
   */
  io.employed.proto.User.Birthday getBirthday();
  /**
   * <code>.employed.io.User.Birthday birthday = 5;</code>
   */
  io.employed.proto.User.BirthdayOrBuilder getBirthdayOrBuilder();

  /**
   * <code>.employed.io.User.Name name = 6;</code>
   */
  boolean hasName();
  /**
   * <code>.employed.io.User.Name name = 6;</code>
   */
  io.employed.proto.User.Name getName();
  /**
   * <code>.employed.io.User.Name name = 6;</code>
   */
  io.employed.proto.User.NameOrBuilder getNameOrBuilder();

  /**
   * <code>.employed.io.User.Address address = 7;</code>
   */
  boolean hasAddress();
  /**
   * <code>.employed.io.User.Address address = 7;</code>
   */
  io.employed.proto.User.Address getAddress();
  /**
   * <code>.employed.io.User.Address address = 7;</code>
   */
  io.employed.proto.User.AddressOrBuilder getAddressOrBuilder();

  /**
   * <code>.employed.io.User.SexType sexType = 8;</code>
   */
  int getSexTypeValue();
  /**
   * <code>.employed.io.User.SexType sexType = 8;</code>
   */
  io.employed.proto.User.SexType getSexType();
}