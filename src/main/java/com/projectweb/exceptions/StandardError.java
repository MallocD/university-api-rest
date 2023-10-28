package com.projectweb.exceptions;

import java.io.Serializable;
import java.util.Date;

public class StandardError implements Serializable {

    private Date timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
    private Long serialVersionUID;


    public StandardError() {
    }

    public StandardError(Date timestamp, Integer status, String error, String message, String path, Long serialVersionUID) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
        this.serialVersionUID = serialVersionUID;
    }



    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(Long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

}
