package com.madabula.rest.webservices.restfulwebservices;

public class HelloWorldBean {

    public String getMessage() {
        return message;
    }

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public HelloWorldBean(String message) {
        this.message=message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
