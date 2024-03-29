/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.erick.mutwiri.api;

import com.erick.mutwiri.api.model.Address;
import com.erick.mutwiri.api.model.Card;
import com.erick.mutwiri.api.model.User;
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
@Api(value = "Customer", description = "the Customer API")
public interface CustomerApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /api/v1/customers/{id} : Deletes the customer
     * Deletes the customer identifiable by given ID
     *
     * @param id Customer Identifier (required)
     * @return Request accepted, returns this status even if user does not exist (status code 202)
     */
    @ApiOperation(value = "Deletes the customer", nickname = "deleteCustomerById", notes = "Deletes the customer identifiable by given ID", tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Request accepted, returns this status even if user does not exist") })
    @RequestMapping(value = "/api/v1/customers/{id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteCustomerById(@ApiParam(value = "Customer Identifier",required=true) @PathVariable("id") String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/customers/{id}/addresses : Returns all customer&#39;s addresses
     * Returns all customer&#39;s addresses based on given customer ID
     *
     * @param id Customer Identifier (required)
     * @return For successful fetch. (status code 200)
     */
    @ApiOperation(value = "Returns all customer's addresses", nickname = "getAddressesByCustomerId", notes = "Returns all customer's addresses based on given customer ID", response = Address.class, tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "For successful fetch.", response = Address.class) })
    @RequestMapping(value = "/api/v1/customers/{id}/addresses",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Address> getAddressesByCustomerId(@ApiParam(value = "Customer Identifier",required=true) @PathVariable("id") String id) {
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


    /**
     * GET /api/v1/customers : Returns all customers
     * Returns all customers, or empty collection if no use found
     *
     * @return For successful fetch. (status code 200)
     */
    @ApiOperation(value = "Returns all customers", nickname = "getAllCustomers", notes = "Returns all customers, or empty collection if no use found", response = User.class, responseContainer = "List", tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "For successful fetch.", response = User.class, responseContainer = "List") })
    @RequestMapping(value = "/api/v1/customers",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<User>> getAllCustomers() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"userStatus\" : 6, \"phone\" : \"phone\", \"id\" : 0, \"email\" : \"email\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<User> <id>123456789</id> <username>aeiou</username> <firstName>aeiou</firstName> <lastName>aeiou</lastName> <email>aeiou</email> <password>aeiou</password> <phone>aeiou</phone> <userStatus>123</userStatus> </User>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/customers/{id}/cards : Returns all customer&#39;s cards
     * Returns all customer&#39;s cards based on given customer ID
     *
     * @param id Customer Identifier (required)
     * @return For successful fetch. (status code 200)
     */
    @ApiOperation(value = "Returns all customer's cards", nickname = "getCardsByCustomerId", notes = "Returns all customer's cards based on given customer ID", response = Card.class, tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "For successful fetch.", response = Card.class) })
    @RequestMapping(value = "/api/v1/customers/{id}/cards",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Card> getCardsByCustomerId(@ApiParam(value = "Customer Identifier",required=true) @PathVariable("id") String id) {
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
     * GET /api/v1/customers/{id} : Returns a customer
     * Returns a customers identifiable by given ID
     *
     * @param id Customer Identifier (required)
     * @return For successful fetch. (status code 200)
     */
    @ApiOperation(value = "Returns a customer", nickname = "getCustomerById", notes = "Returns a customers identifiable by given ID", response = User.class, tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "For successful fetch.", response = User.class) })
    @RequestMapping(value = "/api/v1/customers/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<User> getCustomerById(@ApiParam(value = "Customer Identifier",required=true) @PathVariable("id") String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"userStatus\" : 6, \"phone\" : \"phone\", \"id\" : 0, \"email\" : \"email\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<User> <id>123456789</id> <username>aeiou</username> <firstName>aeiou</firstName> <lastName>aeiou</lastName> <email>aeiou</email> <password>aeiou</password> <phone>aeiou</phone> <userStatus>123</userStatus> </User>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
