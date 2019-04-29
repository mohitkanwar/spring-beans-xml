package com.mk.spring.tutorial;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Greeting {
    //@Autowired
    //@Qualifier("DefaultMessage")
    private String message;


    @Autowired
    public Greeting(@Qualifier("ConstructorInjectionMessage") String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    //@Autowired
    //@Qualifier("SetterInjectionMessage")
    public void setMessage(String message) {
        this.message = message;
    }

}
