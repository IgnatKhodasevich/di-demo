package com.example.demo.controllers;

import org.springframework.stereotype.Controller;

/**
 * controller
 */
@Controller
public class MyController {

    public String hello() {
        System.out.println("Hello!");
    return "foo";
    }
}
