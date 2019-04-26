package com.mk.spring.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {


    public static void main(String[] args) {
        Main m = new Main();
        m.greet();
    }

    private  void greet() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationBasedConfig.class);

        Greeting greeting = applicationContext.getBean("first",Greeting.class);
        System.out.println(greeting.getMessage());
        greeting.setMessage("Message changed");
        Greeting secondGreeting =  applicationContext.getBean("first",Greeting.class);
        System.out.println(secondGreeting.getMessage());
    }


}
