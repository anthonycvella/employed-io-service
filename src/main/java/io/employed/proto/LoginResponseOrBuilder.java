// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/login/login_request.proto

package io.employed.proto;

public interface LoginResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:employed.io.LoginResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.employed.io.Status status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>.employed.io.Status status = 1;</code>
   */
  Status getStatus();

  /**
   * <code>.employed.io.User user = 2;</code>
   */
  boolean hasUser();
  /**
   * <code>.employed.io.User user = 2;</code>
   */
  User getUser();
  /**
   * <code>.employed.io.User user = 2;</code>
   */
  UserOrBuilder getUserOrBuilder();

  /**
   * <code>.employed.io.JobSeeker job_seeker = 3;</code>
   */
  boolean hasJobSeeker();
  /**
   * <code>.employed.io.JobSeeker job_seeker = 3;</code>
   */
  JobSeeker getJobSeeker();
  /**
   * <code>.employed.io.JobSeeker job_seeker = 3;</code>
   */
  JobSeekerOrBuilder getJobSeekerOrBuilder();

  /**
   * <code>.employed.io.Recruiter recruiter = 4;</code>
   */
  boolean hasRecruiter();
  /**
   * <code>.employed.io.Recruiter recruiter = 4;</code>
   */
  Recruiter getRecruiter();
  /**
   * <code>.employed.io.Recruiter recruiter = 4;</code>
   */
  RecruiterOrBuilder getRecruiterOrBuilder();

  public LoginResponse.UserTypeCase getUserTypeCase();
}
