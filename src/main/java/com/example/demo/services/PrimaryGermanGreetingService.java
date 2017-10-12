package com.example.demo.services;


public class PrimaryGermanGreetingService implements GreetingService {

    GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hallo aus dem Primärdienst";
    }
}
