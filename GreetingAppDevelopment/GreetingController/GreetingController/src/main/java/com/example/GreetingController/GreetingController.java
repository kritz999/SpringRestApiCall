package com.example.GreetingController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public Greeting getGreeting(){
        return new Greeting("Hello,World!","GET");
    }

    @PostMapping
    public Greeting postGreeting(@RequestBody Greeting request){
        return new Greeting("Hello,"+ request.getMessage(),"Post");
    }

    @PutMapping("/put")
    public Greeting putGreeting(@RequestBody Greeting request){
        return new Greeting("Updated :"+request.getMessage(),"PUT");
    }

    @PutMapping
    public Greeting deleteGreeting(){
        return new Greeting("Greeting deleted","DELETE");
    }
}
