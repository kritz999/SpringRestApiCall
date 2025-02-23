package com.example.UC4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GreetingController {
    private final GreetingService greetingService;
    private final GreetingRepository greetingRepository;

    public GreetingController(GreetingService greetingService, GreetingRepository greetingRepository) {
        this.greetingService = greetingService;
        this.greetingRepository = greetingRepository;
    }

    @GetMapping("/greet")
    public String greet(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName
    ) {
        return greetingService.getGreeting(firstName, lastName);
    }

    @GetMapping("/greetings")
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }
}
