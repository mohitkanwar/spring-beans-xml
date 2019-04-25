package com.mk.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationBasedConfig.class);
        Greeting greeting = applicationContext.getBean("first",Greeting.class);
        System.out.println(greeting.getMessage());

        Greeting secondGreeting = applicationContext.getBean("second",Greeting.class);
        System.out.println(secondGreeting.getMessage());
    }


}
