package com.mk.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        standard();
        springSetterExample();
    }

    private static void springSetterExample() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Greeting firstGreet = applicationContext.getBean("first", Greeting.class);
        System.out.println(firstGreet.getMessage());
    }

    private static void standard() {
        // This is the standard way of creating objects in Java
        Greeting greeting = new Greeting();
        greeting.setMessage("Hello World!");
        System.out.println(greeting.getMessage());
    }
}
