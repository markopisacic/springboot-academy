package com.ag04smarts.sha.controllers;

import com.ag04smarts.sha.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(@Qualifier("greetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void greet() {
        greetingService.sayGreeting();
    }
}
