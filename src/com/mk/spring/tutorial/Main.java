package com.mk.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        firstCall(applicationContext);
        secondCall(applicationContext);
    }

    private static void firstCall(ApplicationContext applicationContext) {
        Greeting firstGreet = applicationContext.getBean("first", Greeting.class);
        System.out.println("old message : "+ firstGreet.getMessage());
        firstGreet.setMessage("This is a new message that I have set!");
        System.out.println("Message changed");
    }

    private static void secondCall(ApplicationContext applicationContext) {
        Greeting firstGreet = applicationContext.getBean("first", Greeting.class);
        System.out.println("Message in second call : "+firstGreet.getMessage());
    }

}
