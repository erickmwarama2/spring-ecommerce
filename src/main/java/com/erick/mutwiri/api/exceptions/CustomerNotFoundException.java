package com.erick.mutwiri.api.exceptions;

public class CustomerNotFoundException extends RuntimeException {
    
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
