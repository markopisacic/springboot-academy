package com.ag04smarts.sha.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("greetingService")
@Profile("GR")
public class GreetingServiceGerImpl implements GreetingService {
    @Override
    public void sayGreeting() {
        System.out.println("Hallo Welt!");
    }
}
