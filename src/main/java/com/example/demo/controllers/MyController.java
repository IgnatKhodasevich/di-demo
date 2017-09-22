package com.example.demo.controllers;

import com.example.demo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * controller
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(final GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!");
    return greetingService.sayGreeting();
    }
}
