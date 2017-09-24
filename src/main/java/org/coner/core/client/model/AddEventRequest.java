/*
 * coner-core-service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.16
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.coner.core.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * AddEventRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-24T21:53:12.598Z")
public class AddEventRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("date")
  private DateTime date = null;

  @SerializedName("handicapGroupSetId")
  private String handicapGroupSetId = null;

  @SerializedName("competitionGroupSetId")
  private String competitionGroupSetId = null;

  @SerializedName("maxRunsPerRegistration")
  private Integer maxRunsPerRegistration = null;

  public AddEventRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AddEventRequest date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public AddEventRequest handicapGroupSetId(String handicapGroupSetId) {
    this.handicapGroupSetId = handicapGroupSetId;
    return this;
  }

   /**
   * Get handicapGroupSetId
   * @return handicapGroupSetId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHandicapGroupSetId() {
    return handicapGroupSetId;
  }

  public void setHandicapGroupSetId(String handicapGroupSetId) {
    this.handicapGroupSetId = handicapGroupSetId;
  }

  public AddEventRequest competitionGroupSetId(String competitionGroupSetId) {
    this.competitionGroupSetId = competitionGroupSetId;
    return this;
  }

   /**
   * Get competitionGroupSetId
   * @return competitionGroupSetId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCompetitionGroupSetId() {
    return competitionGroupSetId;
  }

  public void setCompetitionGroupSetId(String competitionGroupSetId) {
    this.competitionGroupSetId = competitionGroupSetId;
  }

  public AddEventRequest maxRunsPerRegistration(Integer maxRunsPerRegistration) {
    this.maxRunsPerRegistration = maxRunsPerRegistration;
    return this;
  }

   /**
   * Get maxRunsPerRegistration
   * @return maxRunsPerRegistration
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getMaxRunsPerRegistration() {
    return maxRunsPerRegistration;
  }

  public void setMaxRunsPerRegistration(Integer maxRunsPerRegistration) {
    this.maxRunsPerRegistration = maxRunsPerRegistration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddEventRequest addEventRequest = (AddEventRequest) o;
    return Objects.equals(this.name, addEventRequest.name) &&
        Objects.equals(this.date, addEventRequest.date) &&
        Objects.equals(this.handicapGroupSetId, addEventRequest.handicapGroupSetId) &&
        Objects.equals(this.competitionGroupSetId, addEventRequest.competitionGroupSetId) &&
        Objects.equals(this.maxRunsPerRegistration, addEventRequest.maxRunsPerRegistration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, date, handicapGroupSetId, competitionGroupSetId, maxRunsPerRegistration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddEventRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    handicapGroupSetId: ").append(toIndentedString(handicapGroupSetId)).append("\n");
    sb.append("    competitionGroupSetId: ").append(toIndentedString(competitionGroupSetId)).append("\n");
    sb.append("    maxRunsPerRegistration: ").append(toIndentedString(maxRunsPerRegistration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

