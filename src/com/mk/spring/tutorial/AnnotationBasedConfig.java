package com.mk.spring.tutorial;

import org.springframework.context.annotation.*;
@Configuration
public class AnnotationBasedConfig {
   @Bean(name = "first")
   public Greeting greeting(){
      return new Greeting();
   }

   @Bean(name = "second")
   public Greeting secondGreeting(){
      Greeting greeting = new Greeting();
      greeting.setMessage("This is second greeting!");
      return greeting;
   }
}