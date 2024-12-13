package com.example.springbootapp.MySpringBootApplication.BasicRestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
    // expose "/hello" to a @GetMapping
    @GetMapping ("/hello")
    public String printHello() {
        return "Hello";
    }

    // expose "/helloWorld" to a @GetMapping
    @GetMapping ("/helloWorld")
    public String printHelloWorld() {
        return "Hello World";
    }
}