package com.example.UC8;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    // Create a new Greeting
    public Greeting createGreeting(String message) {
        return greetingRepository.save(new Greeting(message));
    }

    // Get a Greeting by ID
    public Greeting findGreetingById(Long id) {
        return greetingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Greeting not found with ID: " + id));
    }

    // Get all Greetings
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    // Update a Greeting
    public Greeting updateGreeting(Long id, String newMessage) {
        Greeting existingGreeting = greetingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Greeting not found with ID: " + id));
        existingGreeting.setMessage(newMessage);
        return greetingRepository.save(existingGreeting);
    }

    // Delete a Greeting
    public void deleteGreeting(Long id) {
        if (!greetingRepository.existsById(id)) {
            throw new RuntimeException("Greeting not found with ID: " + id);
        }
        greetingRepository.deleteById(id);
    }
}
