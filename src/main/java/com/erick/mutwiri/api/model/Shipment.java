package com.erick.mutwiri.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import javax.xml.bind.annotation.*;
import org.springframework.hateoas.RepresentationModel;

/**
 * Shipment
 */
@JacksonXmlRootElement(localName = "Shipment")
@XmlRootElement(name = "Shipment")
@XmlAccessorType(XmlAccessType.FIELD)
public class Shipment extends RepresentationModel<Shipment>  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("orderId")
  @JacksonXmlProperty(localName = "orderId")
  private String orderId;

  @JsonProperty("carrier")
  @JacksonXmlProperty(localName = "carrier")
  private String carrier;

  @JsonProperty("trackingNumber")
  @JacksonXmlProperty(localName = "trackingNumber")
  private String trackingNumber;

  @JsonProperty("estDeliveryDate")
  @JacksonXmlProperty(localName = "estDeliveryDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate estDeliveryDate;

  public Shipment orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Order Identifier
   * @return orderId
  */
  @ApiModelProperty(value = "Order Identifier")


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Shipment carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Shipping Carrier
   * @return carrier
  */
  @ApiModelProperty(value = "Shipping Carrier")


  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public Shipment trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

  /**
   * Shipping Tracking Number
   * @return trackingNumber
  */
  @ApiModelProperty(value = "Shipping Tracking Number")


  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public Shipment estDeliveryDate(LocalDate estDeliveryDate) {
    this.estDeliveryDate = estDeliveryDate;
    return this;
  }

  /**
   * Estimated Delivery Date
   * @return estDeliveryDate
  */
  @ApiModelProperty(value = "Estimated Delivery Date")

  @Valid

  public LocalDate getEstDeliveryDate() {
    return estDeliveryDate;
  }

  public void setEstDeliveryDate(LocalDate estDeliveryDate) {
    this.estDeliveryDate = estDeliveryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shipment shipment = (Shipment) o;
    return Objects.equals(this.orderId, shipment.orderId) &&
        Objects.equals(this.carrier, shipment.carrier) &&
        Objects.equals(this.trackingNumber, shipment.trackingNumber) &&
        Objects.equals(this.estDeliveryDate, shipment.estDeliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, carrier, trackingNumber, estDeliveryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipment {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    estDeliveryDate: ").append(toIndentedString(estDeliveryDate)).append("\n");
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

