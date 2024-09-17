package com.salih.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    // http://localhost:8080/api/person/hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello from PersonController";
    }

}
