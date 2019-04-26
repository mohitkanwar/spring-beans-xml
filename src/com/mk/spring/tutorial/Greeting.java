package com.mk.spring.tutorial;


public class Greeting {
    private String message;
    public Greeting() {
        this.message = "Invoked by Default Constructor";
    }
    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
