/*
 * Internal Utility API
 * This API allows you to access internal data.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.internal.api.dto;

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
import org.wso2.am.integration.clients.internal.api.dto.BandwidthLimitDTO;
import org.wso2.am.integration.clients.internal.api.dto.EventCountLimitDTO;
import org.wso2.am.integration.clients.internal.api.dto.RequestCountLimitDTO;

/**
 * ThrottleLimitDTO
 */

public class ThrottleLimitDTO {
  @SerializedName("quotaType")
  private String quotaType = null;

  @SerializedName("requestCount")
  private RequestCountLimitDTO requestCount = null;

  @SerializedName("bandwidth")
  private BandwidthLimitDTO bandwidth = null;

  @SerializedName("eventCount")
  private EventCountLimitDTO eventCount = null;

  public ThrottleLimitDTO quotaType(String quotaType) {
    this.quotaType = quotaType;
    return this;
  }

   /**
   * Get quotaType
   * @return quotaType
  **/
  @ApiModelProperty(value = "")
  public String getQuotaType() {
    return quotaType;
  }

  public void setQuotaType(String quotaType) {
    this.quotaType = quotaType;
  }

  public ThrottleLimitDTO requestCount(RequestCountLimitDTO requestCount) {
    this.requestCount = requestCount;
    return this;
  }

   /**
   * Get requestCount
   * @return requestCount
  **/
  @ApiModelProperty(value = "")
  public RequestCountLimitDTO getRequestCount() {
    return requestCount;
  }

  public void setRequestCount(RequestCountLimitDTO requestCount) {
    this.requestCount = requestCount;
  }

  public ThrottleLimitDTO bandwidth(BandwidthLimitDTO bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @ApiModelProperty(value = "")
  public BandwidthLimitDTO getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(BandwidthLimitDTO bandwidth) {
    this.bandwidth = bandwidth;
  }

  public ThrottleLimitDTO eventCount(EventCountLimitDTO eventCount) {
    this.eventCount = eventCount;
    return this;
  }

   /**
   * Get eventCount
   * @return eventCount
  **/
  @ApiModelProperty(value = "")
  public EventCountLimitDTO getEventCount() {
    return eventCount;
  }

  public void setEventCount(EventCountLimitDTO eventCount) {
    this.eventCount = eventCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThrottleLimitDTO throttleLimit = (ThrottleLimitDTO) o;
    return Objects.equals(this.quotaType, throttleLimit.quotaType) &&
        Objects.equals(this.requestCount, throttleLimit.requestCount) &&
        Objects.equals(this.bandwidth, throttleLimit.bandwidth) &&
        Objects.equals(this.eventCount, throttleLimit.eventCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotaType, requestCount, bandwidth, eventCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThrottleLimitDTO {\n");
    
    sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
    sb.append("    requestCount: ").append(toIndentedString(requestCount)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
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

