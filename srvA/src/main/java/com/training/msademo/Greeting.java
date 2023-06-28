package com.training.msademo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Service A") String name) {
        return String.format("Hello %s!", name);
    }
}