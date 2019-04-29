package com.mk.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {


    public static void main(String[] args) {
        Main m = new Main();
        m.greet();
    }

    private  void greet() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Greeting greeting = applicationContext.getBean(Greeting.class);
        System.out.println(greeting.getMessage());

    }


}
