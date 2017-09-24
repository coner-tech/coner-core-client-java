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
import java.math.BigDecimal;

/**
 * HandicapGroupApiEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-24T21:13:55.701Z")
public class HandicapGroupApiEntity {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("factor")
  private BigDecimal factor = null;

  public HandicapGroupApiEntity id(String id) {
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

  public HandicapGroupApiEntity name(String name) {
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

  public HandicapGroupApiEntity factor(BigDecimal factor) {
    this.factor = factor;
    return this;
  }

   /**
   * Get factor
   * minimum: 0.0
   * maximum: 1.0
   * @return factor
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BigDecimal getFactor() {
    return factor;
  }

  public void setFactor(BigDecimal factor) {
    this.factor = factor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HandicapGroupApiEntity handicapGroupApiEntity = (HandicapGroupApiEntity) o;
    return Objects.equals(this.id, handicapGroupApiEntity.id) &&
        Objects.equals(this.name, handicapGroupApiEntity.name) &&
        Objects.equals(this.factor, handicapGroupApiEntity.factor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, factor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HandicapGroupApiEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
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

