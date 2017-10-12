package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello from the Primary Service";
    }

    @Override
    public String getRussianGreeting() {
        return "Сервис по-русски";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo aus dem Primärdienst";
    }
}
