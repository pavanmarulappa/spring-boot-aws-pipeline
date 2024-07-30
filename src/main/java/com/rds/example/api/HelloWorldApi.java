package com.rds.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApi {

    @GetMapping
    public String helloWorld() {
        return "Hello World! Well Done!";
    }

}
