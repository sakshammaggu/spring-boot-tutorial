package com.example.springbootapp.MySpringBootApplication.BasicRestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
    // expose "/" to a @GetMapping
    @GetMapping
    public String printHello() {
        return "Hello World.";
    }
}