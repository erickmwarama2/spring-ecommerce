package com.erick.mutwiri.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import javax.xml.bind.annotation.*;
import org.springframework.hateoas.RepresentationModel;

/**
 * Card
 */
@JacksonXmlRootElement(localName = "Card")
@XmlRootElement(name = "Card")
@XmlAccessorType(XmlAccessType.FIELD)
public class Card extends RepresentationModel<Card>  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cardNumber")
  @JacksonXmlProperty(localName = "cardNumber")
  private String cardNumber;

  @JsonProperty("expires")
  @JacksonXmlProperty(localName = "expires")
  private String expires;

  @JsonProperty("ccv")
  @JacksonXmlProperty(localName = "ccv")
  private String ccv;

  public Card cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * Card Number
   * @return cardNumber
  */
  @ApiModelProperty(value = "Card Number")


  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public Card expires(String expires) {
    this.expires = expires;
    return this;
  }

  /**
   * Expiration date
   * @return expires
  */
  @ApiModelProperty(value = "Expiration date")


  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public Card ccv(String ccv) {
    this.ccv = ccv;
    return this;
  }

  /**
   * CCV code
   * @return ccv
  */
  @ApiModelProperty(value = "CCV code")


  public String getCcv() {
    return ccv;
  }

  public void setCcv(String ccv) {
    this.ccv = ccv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.cardNumber, card.cardNumber) &&
        Objects.equals(this.expires, card.expires) &&
        Objects.equals(this.ccv, card.ccv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, expires, ccv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    ccv: ").append(toIndentedString(ccv)).append("\n");
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

