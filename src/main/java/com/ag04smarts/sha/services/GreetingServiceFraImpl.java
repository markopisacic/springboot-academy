package com.ag04smarts.sha.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("greetingService")
@Profile("FR")
public class GreetingServiceFraImpl implements GreetingService {
    @Override
    public void sayGreeting() {
        System.out.println("Salut monde!");
    }
}
