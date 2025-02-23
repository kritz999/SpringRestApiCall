package com.example.UC1_ServiceLayer;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreeting() {
        return "Hello World";
    }
}
