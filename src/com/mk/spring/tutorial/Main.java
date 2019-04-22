package com.mk.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        standard();
        springSetterExample(applicationContext);
        springConstructorExample(applicationContext);
    }

    private static void springConstructorExample(ApplicationContext applicationContext) {
        Greeting secondGreet = applicationContext.getBean("second", Greeting.class);
        System.out.println(secondGreet.getMessage());
    }

    private static void springSetterExample(ApplicationContext applicationContext) {
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
