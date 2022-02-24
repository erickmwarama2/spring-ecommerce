package com.erick.mutwiri.api.model;

import java.util.Objects;
import com.erick.mutwiri.api.model.AddCardReqAllOf;
import com.erick.mutwiri.api.model.Card;
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
 * Request object for new card registration.
 */
@ApiModel(description = "Request object for new card registration.")
@JacksonXmlRootElement(localName = "AddCardReq")
@XmlRootElement(name = "AddCardReq")
@XmlAccessorType(XmlAccessType.FIELD)
public class AddCardReq extends RepresentationModel<AddCardReq>  implements Serializable {
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

  @JsonProperty("userId")
  @JacksonXmlProperty(localName = "userId")
  private Object userId;

  public AddCardReq cardNumber(String cardNumber) {
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

  public AddCardReq expires(String expires) {
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

  public AddCardReq ccv(String ccv) {
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

  public AddCardReq userId(Object userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getUserId() {
    return userId;
  }

  public void setUserId(Object userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCardReq addCardReq = (AddCardReq) o;
    return Objects.equals(this.cardNumber, addCardReq.cardNumber) &&
        Objects.equals(this.expires, addCardReq.expires) &&
        Objects.equals(this.ccv, addCardReq.ccv) &&
        Objects.equals(this.userId, addCardReq.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, expires, ccv, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCardReq {\n");
    
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    ccv: ").append(toIndentedString(ccv)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

