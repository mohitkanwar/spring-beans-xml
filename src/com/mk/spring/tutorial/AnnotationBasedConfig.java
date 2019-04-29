package com.mk.spring.tutorial;

import org.springframework.context.annotation.*;
@Configuration
public class AnnotationBasedConfig {
   /*@Bean
   public Greeting greeting(){
      return new Greeting();
   }*/

   @Bean(name = "DefaultMessage")
   public String defaultMessage(){
      return "This is my default message!!";
   }

   @Bean(name = "SetterInjectionMessage")
   public String setterInjectionMessage(){
      return "This is set via setters!!";
   }

   @Bean(name = "ConstructorInjectionMessage")
   public String constructorInjectionMessage(){
      return "This is set via constructor!!";
   }
}