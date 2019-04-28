package com.soa.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final String HELLO_WORLD = "Hello World";

    @GetMapping
    public String helloWorld(){
        return HELLO_WORLD;
    }

    @GetMapping("/{name}")
    public String helloToSomeone(@PathVariable String name){
        return "Hello, " + name + "!";
    }
}
