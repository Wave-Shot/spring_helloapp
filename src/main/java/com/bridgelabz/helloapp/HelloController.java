package com.bridgelabz.helloapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/query")
    public String helloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String helloParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @PostMapping("/post")
    public String helloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    @PutMapping("/put/{firstName}")
    public String helloPut(@PathVariable String firstName,
                           @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}