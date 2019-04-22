package com.mk.spring.tutorial;

public class Greeting {
    private String message;
    public Greeting() {
    }
    public Greeting(String message) {
        System.out.println("Constructor called!!");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Setter Called");
        this.message = message;
    }
}
