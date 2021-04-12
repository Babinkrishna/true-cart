package com.nit.web.data;

import java.util.List;

public class CommonResponseModel {
    private String status;
    private List result;
    private String message;
    private String statusCode;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List getResult() {
        return result;
    }

    public void setResult(List result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}