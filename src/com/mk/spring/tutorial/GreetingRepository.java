package com.mk.spring.tutorial;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class GreetingRepository implements IGreetingRepository {
    private static Map<Integer,String> greetingMap = new HashMap<>();
    static {
        greetingMap.put(0,"Hello");
        greetingMap.put(1,"नमस्ते");
        greetingMap.put(2,"ਸਤਿ ਸ਼੍ਰੀ ਅਕਾਲ");
        greetingMap.put(3,"السلام علیکم");
        greetingMap.put(4,"নমস্কার");
        greetingMap.put(5,"नमस्कार");
        greetingMap.put(6,"आदाब");
        greetingMap.put(7,"வணக்கம்!");
        greetingMap.put(8,"నమస్కారం");
        greetingMap.put(9,"नमस्कारः");


    }
    @Override
    public String getGreetingById(int id) {
        String greeting = greetingMap.get(id);
        return greeting == null? "Hello" : greeting;
    }
}
