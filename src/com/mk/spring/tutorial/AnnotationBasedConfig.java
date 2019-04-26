package com.mk.spring.tutorial;

import org.springframework.context.annotation.*;
@Configuration
public class AnnotationBasedConfig {
   @Bean(name = "first")
   public Greeting greeting(){
      return new Greeting();
   }


   @Bean(name = "DefaultMessage")
   public String defaultMessage(){
      return "This is my default message!!";
   }
}