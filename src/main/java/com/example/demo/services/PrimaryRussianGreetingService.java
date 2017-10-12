package com.example.demo.services;

public class PrimaryRussianGreetingService implements GreetingService {

    GreetingRepository greetingRepository;

    public PrimaryRussianGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Сервис по-русски";
    }
}
