/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.erick.mutwiri.api;

import com.erick.mutwiri.api.model.AddCardReq;
import com.erick.mutwiri.api.model.Address;
import com.erick.mutwiri.api.model.Card;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Validated
@Api(value = "Card", description = "the Card API")
public interface CardApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /api/v1/cards/{id} : Deletes card&#39;s address
     * Deletes card&#39;s address based on given card ID.
     *
     * @param id card Identifier (required)
     * @return Accepts the deletion request and perform deletion. If ID does not exist, does nothing. (status code 202)
     */
    @ApiOperation(value = "Deletes card's address", nickname = "deleteCardById", notes = "Deletes card's address based on given card ID.", tags={ "card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Accepts the deletion request and perform deletion. If ID does not exist, does nothing.") })
    @RequestMapping(value = "/api/v1/cards/{id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteCardById(@ApiParam(value = "card Identifier",required=true) @PathVariable("id") String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/cards : Returns all user&#39;s cards
     * Returns all user&#39;s cards, else empty collection
     *
     * @return For successful fetch. (status code 200)
     */
    @ApiOperation(value = "Returns all user's cards", nickname = "getAllCards", notes = "Returns all user's cards, else empty collection", response = Card.class, responseContainer = "List", tags={ "card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "For successful fetch.", response = Card.class, responseContainer = "List") })
    @RequestMapping(value = "/api/v1/cards",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Card>> getAllCards() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"expires\" : \"expires\", \"ccv\" : \"ccv\", \"cardNumber\" : \"cardNumber\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Card> <cardNumber>aeiou</cardNumber> <expires>aeiou</expires> <ccv>aeiou</ccv> </Card>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/cards/{id} : Returns user&#39;s card
     * Returns user&#39;s card based on given card ID.
     *
     * @param id card Identifier (required)
     * @return For successful fetch. (status code 200)
     */
    @ApiOperation(value = "Returns user's card", nickname = "getCardById", notes = "Returns user's card based on given card ID.", response = Card.class, tags={ "card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "For successful fetch.", response = Card.class) })
    @RequestMapping(value = "/api/v1/cards/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Card> getCardById(@ApiParam(value = "card Identifier",required=true) @PathVariable("id") String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"expires\" : \"expires\", \"ccv\" : \"ccv\", \"cardNumber\" : \"cardNumber\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Card> <cardNumber>aeiou</cardNumber> <expires>aeiou</expires> <ccv>aeiou</ccv> </Card>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/v1/cards : Creates a new user addresses
     * Creates a new user addresses. Does nothing if address already exists.
     *
     * @param addCardReq  (optional)
     * @return For successful fetch. (status code 200)
     */
    @ApiOperation(value = "Creates a new user addresses", nickname = "registerCard", notes = "Creates a new user addresses. Does nothing if address already exists.", response = Address.class, tags={ "card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "For successful fetch.", response = Address.class) })
    @RequestMapping(value = "/api/v1/cards",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/xml", "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Address> registerCard(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) AddCardReq addCardReq) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"residency\" : \"residency\", \"number\" : \"number\", \"country\" : \"country\", \"pincode\" : \"pincode\", \"city\" : \"city\", \"street\" : \"street\", \"state\" : \"state\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Address> <number>aeiou</number> <residency>aeiou</residency> <street>aeiou</street> <city>aeiou</city> <state>aeiou</state> <country>aeiou</country> <pincode>aeiou</pincode> </Address>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
