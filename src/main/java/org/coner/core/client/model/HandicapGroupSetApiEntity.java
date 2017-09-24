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
import java.util.ArrayList;
import java.util.List;
import org.coner.core.client.model.HandicapGroupApiEntity;

/**
 * HandicapGroupSetApiEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-24T21:13:55.701Z")
public class HandicapGroupSetApiEntity {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("handicapGroups")
  private List<HandicapGroupApiEntity> handicapGroups = new ArrayList<HandicapGroupApiEntity>();

  public HandicapGroupSetApiEntity id(String id) {
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

  public HandicapGroupSetApiEntity name(String name) {
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

  public HandicapGroupSetApiEntity handicapGroups(List<HandicapGroupApiEntity> handicapGroups) {
    this.handicapGroups = handicapGroups;
    return this;
  }

  public HandicapGroupSetApiEntity addHandicapGroupsItem(HandicapGroupApiEntity handicapGroupsItem) {
    this.handicapGroups.add(handicapGroupsItem);
    return this;
  }

   /**
   * Get handicapGroups
   * @return handicapGroups
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<HandicapGroupApiEntity> getHandicapGroups() {
    return handicapGroups;
  }

  public void setHandicapGroups(List<HandicapGroupApiEntity> handicapGroups) {
    this.handicapGroups = handicapGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HandicapGroupSetApiEntity handicapGroupSetApiEntity = (HandicapGroupSetApiEntity) o;
    return Objects.equals(this.id, handicapGroupSetApiEntity.id) &&
        Objects.equals(this.name, handicapGroupSetApiEntity.name) &&
        Objects.equals(this.handicapGroups, handicapGroupSetApiEntity.handicapGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, handicapGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HandicapGroupSetApiEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    handicapGroups: ").append(toIndentedString(handicapGroups)).append("\n");
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

