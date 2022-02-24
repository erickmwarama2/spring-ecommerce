package com.erick.mutwiri.api.exceptions;

public class ErrorUtils {
    private ErrorUtils(){}

    public static Error createError(final String errMsgKey, final String errCode, final Integer httpStatusCode) {
        Error error = new Error();
        error.setMessage(errMsgKey);
        error.setErrorCode(errCode);
        error.setStatus(httpStatusCode);
        return error;
    }
}
