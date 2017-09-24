/*
 * coner-core-service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.20
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
import org.coner.core.client.model.CarApiEntity;
import org.coner.core.client.model.PersonApiEntity;

/**
 * RegistrationApiEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-24T22:49:05.254Z")
public class RegistrationApiEntity {
  @SerializedName("id")
  private String id = null;

  @SerializedName("person")
  private PersonApiEntity person = null;

  @SerializedName("car")
  private CarApiEntity car = null;

  @SerializedName("handicapGroupId")
  private String handicapGroupId = null;

  @SerializedName("competitionGroupId")
  private String competitionGroupId = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("checkedIn")
  private Boolean checkedIn = null;

  public RegistrationApiEntity id(String id) {
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

  public RegistrationApiEntity person(PersonApiEntity person) {
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PersonApiEntity getPerson() {
    return person;
  }

  public void setPerson(PersonApiEntity person) {
    this.person = person;
  }

  public RegistrationApiEntity car(CarApiEntity car) {
    this.car = car;
    return this;
  }

   /**
   * Get car
   * @return car
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CarApiEntity getCar() {
    return car;
  }

  public void setCar(CarApiEntity car) {
    this.car = car;
  }

  public RegistrationApiEntity handicapGroupId(String handicapGroupId) {
    this.handicapGroupId = handicapGroupId;
    return this;
  }

   /**
   * Get handicapGroupId
   * @return handicapGroupId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHandicapGroupId() {
    return handicapGroupId;
  }

  public void setHandicapGroupId(String handicapGroupId) {
    this.handicapGroupId = handicapGroupId;
  }

  public RegistrationApiEntity competitionGroupId(String competitionGroupId) {
    this.competitionGroupId = competitionGroupId;
    return this;
  }

   /**
   * Get competitionGroupId
   * @return competitionGroupId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCompetitionGroupId() {
    return competitionGroupId;
  }

  public void setCompetitionGroupId(String competitionGroupId) {
    this.competitionGroupId = competitionGroupId;
  }

  public RegistrationApiEntity number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public RegistrationApiEntity checkedIn(Boolean checkedIn) {
    this.checkedIn = checkedIn;
    return this;
  }

   /**
   * Get checkedIn
   * @return checkedIn
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCheckedIn() {
    return checkedIn;
  }

  public void setCheckedIn(Boolean checkedIn) {
    this.checkedIn = checkedIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationApiEntity registrationApiEntity = (RegistrationApiEntity) o;
    return Objects.equals(this.id, registrationApiEntity.id) &&
        Objects.equals(this.person, registrationApiEntity.person) &&
        Objects.equals(this.car, registrationApiEntity.car) &&
        Objects.equals(this.handicapGroupId, registrationApiEntity.handicapGroupId) &&
        Objects.equals(this.competitionGroupId, registrationApiEntity.competitionGroupId) &&
        Objects.equals(this.number, registrationApiEntity.number) &&
        Objects.equals(this.checkedIn, registrationApiEntity.checkedIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, person, car, handicapGroupId, competitionGroupId, number, checkedIn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationApiEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    car: ").append(toIndentedString(car)).append("\n");
    sb.append("    handicapGroupId: ").append(toIndentedString(handicapGroupId)).append("\n");
    sb.append("    competitionGroupId: ").append(toIndentedString(competitionGroupId)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    checkedIn: ").append(toIndentedString(checkedIn)).append("\n");
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

