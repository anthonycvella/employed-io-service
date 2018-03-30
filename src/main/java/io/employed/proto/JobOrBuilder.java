// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/job.proto

package io.employed.proto;

public interface JobOrBuilder extends
    // @@protoc_insertion_point(interface_extends:employed.io.Job)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string job_id = 1;</code>
   */
  String getJobId();
  /**
   * <code>string job_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getJobIdBytes();

  /**
   * <code>string title = 3;</code>
   */
  String getTitle();
  /**
   * <code>string title = 3;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 4;</code>
   */
  String getDescription();
  /**
   * <code>string description = 4;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string short_description = 5;</code>
   */
  String getShortDescription();
  /**
   * <code>string short_description = 5;</code>
   */
  com.google.protobuf.ByteString
      getShortDescriptionBytes();

  /**
   * <code>.employed.io.Company company = 6;</code>
   */
  boolean hasCompany();
  /**
   * <code>.employed.io.Company company = 6;</code>
   */
  Company getCompany();
  /**
   * <code>.employed.io.Company company = 6;</code>
   */
  CompanyOrBuilder getCompanyOrBuilder();

  /**
   * <code>.employed.io.Job.Recruiter recruiter = 7;</code>
   */
  boolean hasRecruiter();
  /**
   * <code>.employed.io.Job.Recruiter recruiter = 7;</code>
   */
  Job.Recruiter getRecruiter();
  /**
   * <code>.employed.io.Job.Recruiter recruiter = 7;</code>
   */
  Job.RecruiterOrBuilder getRecruiterOrBuilder();

  /**
   * <code>.employed.io.Job.CatergoryType catergory_type = 8;</code>
   */
  int getCatergoryTypeValue();
  /**
   * <code>.employed.io.Job.CatergoryType catergory_type = 8;</code>
   */
  Job.CatergoryType getCatergoryType();

  /**
   * <code>.employed.io.Job.EmploymentType employment_type = 9;</code>
   */
  int getEmploymentTypeValue();
  /**
   * <code>.employed.io.Job.EmploymentType employment_type = 9;</code>
   */
  Job.EmploymentType getEmploymentType();

  /**
   * <code>int32 salary = 10;</code>
   */
  int getSalary();

  /**
   * <code>.employed.io.Job.SalaryRange salary_range = 11;</code>
   */
  boolean hasSalaryRange();
  /**
   * <code>.employed.io.Job.SalaryRange salary_range = 11;</code>
   */
  Job.SalaryRange getSalaryRange();
  /**
   * <code>.employed.io.Job.SalaryRange salary_range = 11;</code>
   */
  Job.SalaryRangeOrBuilder getSalaryRangeOrBuilder();

  /**
   * <code>.employed.io.Location location = 12;</code>
   */
  boolean hasLocation();
  /**
   * <code>.employed.io.Location location = 12;</code>
   */
  io.employed.proto.Location getLocation();
  /**
   * <code>.employed.io.Location location = 12;</code>
   */
  io.employed.proto.LocationOrBuilder getLocationOrBuilder();

  /**
   * <code>int32 number_of_hires = 13;</code>
   */
  int getNumberOfHires();

  /**
   * <code>string required_experience = 14;</code>
   */
  String getRequiredExperience();
  /**
   * <code>string required_experience = 14;</code>
   */
  com.google.protobuf.ByteString
      getRequiredExperienceBytes();

  /**
   * <code>string preferred_experience = 15;</code>
   */
  String getPreferredExperience();
  /**
   * <code>string preferred_experience = 15;</code>
   */
  com.google.protobuf.ByteString
      getPreferredExperienceBytes();

  /**
   * <code>repeated string skills = 16;</code>
   */
  java.util.List<String>
      getSkillsList();
  /**
   * <code>repeated string skills = 16;</code>
   */
  int getSkillsCount();
  /**
   * <code>repeated string skills = 16;</code>
   */
  String getSkills(int index);
  /**
   * <code>repeated string skills = 16;</code>
   */
  com.google.protobuf.ByteString
      getSkillsBytes(int index);

  /**
   * <code>string responsibilities = 17;</code>
   */
  String getResponsibilities();
  /**
   * <code>string responsibilities = 17;</code>
   */
  com.google.protobuf.ByteString
      getResponsibilitiesBytes();

  /**
   * <code>int32 experience = 18;</code>
   */
  int getExperience();

  /**
   * <code>repeated .employed.io.Job.EducationLevel education_level = 19;</code>
   */
  java.util.List<Job.EducationLevel> getEducationLevelList();
  /**
   * <code>repeated .employed.io.Job.EducationLevel education_level = 19;</code>
   */
  int getEducationLevelCount();
  /**
   * <code>repeated .employed.io.Job.EducationLevel education_level = 19;</code>
   */
  Job.EducationLevel getEducationLevel(int index);
  /**
   * <code>repeated .employed.io.Job.EducationLevel education_level = 19;</code>
   */
  java.util.List<Integer>
  getEducationLevelValueList();
  /**
   * <code>repeated .employed.io.Job.EducationLevel education_level = 19;</code>
   */
  int getEducationLevelValue(int index);

  /**
   * <code>repeated string tags = 20;</code>
   */
  java.util.List<String>
      getTagsList();
  /**
   * <code>repeated string tags = 20;</code>
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 20;</code>
   */
  String getTags(int index);
  /**
   * <code>repeated string tags = 20;</code>
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  public Job.SalaryTypeCase getSalaryTypeCase();
}
