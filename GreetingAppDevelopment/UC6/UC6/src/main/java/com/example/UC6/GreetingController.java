package com.example.UC6;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/greetings/{id}")
    public Greeting getGreetingById(@PathVariable Long id) {
        return greetingService.findGreetingById(id);
    }

    @GetMapping("/greetings")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }
}
