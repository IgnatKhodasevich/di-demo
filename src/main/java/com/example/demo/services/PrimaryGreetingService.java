package com.example.demo.services;

public class PrimaryGreetingService implements GreetingService{

    GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello from the Primary Service";
    }
}
