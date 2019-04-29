package com.mk.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

   private IGreetingService greetingService;
   @Autowired
   public GreetingController(IGreetingService greetingService){
       this.greetingService = greetingService;
   }

   public String greet(){
       return this.greetingService.getRandomGreeting();
   }
}
