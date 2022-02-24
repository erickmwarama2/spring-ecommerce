package com.erick.mutwiri.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import javax.xml.bind.annotation.*;
import org.springframework.hateoas.RepresentationModel;

/**
 * Contains the new order request information
 */
@ApiModel(description = "Contains the new order request information")
@JacksonXmlRootElement(localName = "NewOrder")
@XmlRootElement(name = "NewOrder")
@XmlAccessorType(XmlAccessType.FIELD)
public class NewOrder extends RepresentationModel<NewOrder>  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("customer")
  @JacksonXmlProperty(localName = "customer")
  private URI customer;

  @JsonProperty("address")
  @JacksonXmlProperty(localName = "address")
  private URI address;

  @JsonProperty("card")
  @JacksonXmlProperty(localName = "card")
  private URI card;

  @JsonProperty("items")
  @JacksonXmlProperty(localName = "items")
  private URI items;

  public NewOrder customer(URI customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @ApiModelProperty(value = "")

  @Valid

  public URI getCustomer() {
    return customer;
  }

  public void setCustomer(URI customer) {
    this.customer = customer;
  }

  public NewOrder address(URI address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public URI getAddress() {
    return address;
  }

  public void setAddress(URI address) {
    this.address = address;
  }

  public NewOrder card(URI card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  */
  @ApiModelProperty(value = "")

  @Valid

  public URI getCard() {
    return card;
  }

  public void setCard(URI card) {
    this.card = card;
  }

  public NewOrder items(URI items) {
    this.items = items;
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @ApiModelProperty(value = "")

  @Valid

  public URI getItems() {
    return items;
  }

  public void setItems(URI items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewOrder newOrder = (NewOrder) o;
    return Objects.equals(this.customer, newOrder.customer) &&
        Objects.equals(this.address, newOrder.address) &&
        Objects.equals(this.card, newOrder.card) &&
        Objects.equals(this.items, newOrder.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, address, card, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOrder {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

