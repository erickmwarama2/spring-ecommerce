package com.erick.mutwiri.api.exceptions;

// import lombok.Data;


public class Error {
    private static final long serialVersionUID = 1L;

    private String errorCode;

    private String message;

    private Integer status;

    private String url = "Not available";

    private String reqMethod = "Not available";

    public String getReqMethod() {
        return reqMethod;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setReqMethod(String reqMethod) {
        this.reqMethod = reqMethod;
    }
}
