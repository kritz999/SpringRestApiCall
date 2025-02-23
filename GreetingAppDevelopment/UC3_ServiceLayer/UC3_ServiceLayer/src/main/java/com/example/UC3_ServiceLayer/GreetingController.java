package com.example.UC3_ServiceLayer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greet(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName
    ) {
        return greetingService.getGreeting(firstName, lastName);
    }
}
