package com.example.Springboot.tutorial.Controller;

import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContainer {

    @GetMapping("/")
    public String helloWorld() {

        return "Welcome to Coding!! dfg";
    }
}
