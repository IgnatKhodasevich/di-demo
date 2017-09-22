package com.example.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("rus")
public class PrimaryRussianGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Сервис по-русски";
    }
}
