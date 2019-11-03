/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * OuterComposite
 */

public class OuterComposite implements Parcelable {
  public static final String SERIALIZED_NAME_MY_NUMBER = "my_number";
  @SerializedName(SERIALIZED_NAME_MY_NUMBER)
  private BigDecimal myNumber;

  public static final String SERIALIZED_NAME_MY_STRING = "my_string";
  @SerializedName(SERIALIZED_NAME_MY_STRING)
  private String myString;

  public static final String SERIALIZED_NAME_MY_BOOLEAN = "my_boolean";
  @SerializedName(SERIALIZED_NAME_MY_BOOLEAN)
  private Boolean myBoolean;

  public OuterComposite() {
  }

  public OuterComposite myNumber(BigDecimal myNumber) {
    
    this.myNumber = myNumber;
    return this;
  }

   /**
   * Get myNumber
   * @return myNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMyNumber() {
    return myNumber;
  }


  public void setMyNumber(BigDecimal myNumber) {
    this.myNumber = myNumber;
  }


  public OuterComposite myString(String myString) {
    
    this.myString = myString;
    return this;
  }

   /**
   * Get myString
   * @return myString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMyString() {
    return myString;
  }


  public void setMyString(String myString) {
    this.myString = myString;
  }


  public OuterComposite myBoolean(Boolean myBoolean) {
    
    this.myBoolean = myBoolean;
    return this;
  }

   /**
   * Get myBoolean
   * @return myBoolean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMyBoolean() {
    return myBoolean;
  }


  public void setMyBoolean(Boolean myBoolean) {
    this.myBoolean = myBoolean;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuterComposite outerComposite = (OuterComposite) o;
    return Objects.equals(this.myNumber, outerComposite.myNumber) &&
        Objects.equals(this.myString, outerComposite.myString) &&
        Objects.equals(this.myBoolean, outerComposite.myBoolean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myNumber, myString, myBoolean);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuterComposite {\n");
    sb.append("    myNumber: ").append(toIndentedString(myNumber)).append("\n");
    sb.append("    myString: ").append(toIndentedString(myString)).append("\n");
    sb.append("    myBoolean: ").append(toIndentedString(myBoolean)).append("\n");
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


  public void writeToParcel(Parcel out, int flags) {
    out.writeValue(myNumber);
    out.writeValue(myString);
    out.writeValue(myBoolean);
  }

  OuterComposite(Parcel in) {
    myNumber = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
    myString = (String)in.readValue(null);
    myBoolean = (Boolean)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<OuterComposite> CREATOR = new Parcelable.Creator<OuterComposite>() {
    public OuterComposite createFromParcel(Parcel in) {
      return new OuterComposite(in);
    }
    public OuterComposite[] newArray(int size) {
      return new OuterComposite[size];
    }
  };
}

