package com.erick.mutwiri.api.exceptions;

public class ItemNotFoundException extends RuntimeException {
    
    public ItemNotFoundException(String msg) {
        super(msg);
    }
}
