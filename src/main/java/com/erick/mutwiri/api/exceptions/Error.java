package com.erick.mutwiri.api.exceptions;

import lombok.Data;

@Data
public class Error {
    private static final long serialVersionUID = 1L;

    private String errorCode;

    private String message;

    private Integer status;

    private String url = "Not available";

    private String reqMethod = "Not available";
}
