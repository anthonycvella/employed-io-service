// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/job/job_request.proto

package io.employed.proto;

public interface JobsByTagsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:employed.io.JobsByTagsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .employed.io.Job jobs = 1;</code>
   */
  java.util.List<io.employed.proto.Job> 
      getJobsList();
  /**
   * <code>repeated .employed.io.Job jobs = 1;</code>
   */
  io.employed.proto.Job getJobs(int index);
  /**
   * <code>repeated .employed.io.Job jobs = 1;</code>
   */
  int getJobsCount();
  /**
   * <code>repeated .employed.io.Job jobs = 1;</code>
   */
  java.util.List<? extends io.employed.proto.JobOrBuilder> 
      getJobsOrBuilderList();
  /**
   * <code>repeated .employed.io.Job jobs = 1;</code>
   */
  io.employed.proto.JobOrBuilder getJobsOrBuilder(
      int index);
}
