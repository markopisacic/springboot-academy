package com.ag04smarts.sha.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("greetingService")
@Profile({"EN", "default"})
public class GreetingServiceEngImpl implements GreetingService {
    @Override
    public void sayGreeting() {
        System.out.println("Hello from Hospitallo!");
    }
}
