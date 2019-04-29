package com.mk.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class DefaultGreetingService implements IGreetingService {
    private final IGreetingRepository greetingRepository;

    @Autowired
    public DefaultGreetingService(IGreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String getRandomGreeting() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
        return greetingRepository.getGreetingById(randomNum);
    }
}
