/*
 * coner-core-service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.14
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
 * EventApiEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-24T21:13:55.701Z")
public class EventApiEntity {
  @SerializedName("id")
  private String id = null;

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

  @SerializedName("current")
  private Boolean current = null;

  public EventApiEntity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EventApiEntity name(String name) {
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

  public EventApiEntity date(DateTime date) {
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

  public EventApiEntity handicapGroupSetId(String handicapGroupSetId) {
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

  public EventApiEntity competitionGroupSetId(String competitionGroupSetId) {
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

  public EventApiEntity maxRunsPerRegistration(Integer maxRunsPerRegistration) {
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

  public EventApiEntity current(Boolean current) {
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCurrent() {
    return current;
  }

  public void setCurrent(Boolean current) {
    this.current = current;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventApiEntity eventApiEntity = (EventApiEntity) o;
    return Objects.equals(this.id, eventApiEntity.id) &&
        Objects.equals(this.name, eventApiEntity.name) &&
        Objects.equals(this.date, eventApiEntity.date) &&
        Objects.equals(this.handicapGroupSetId, eventApiEntity.handicapGroupSetId) &&
        Objects.equals(this.competitionGroupSetId, eventApiEntity.competitionGroupSetId) &&
        Objects.equals(this.maxRunsPerRegistration, eventApiEntity.maxRunsPerRegistration) &&
        Objects.equals(this.current, eventApiEntity.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, date, handicapGroupSetId, competitionGroupSetId, maxRunsPerRegistration, current);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventApiEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    handicapGroupSetId: ").append(toIndentedString(handicapGroupSetId)).append("\n");
    sb.append("    competitionGroupSetId: ").append(toIndentedString(competitionGroupSetId)).append("\n");
    sb.append("    maxRunsPerRegistration: ").append(toIndentedString(maxRunsPerRegistration)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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

