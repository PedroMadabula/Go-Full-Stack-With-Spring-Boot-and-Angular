package com.madabula.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Identify that it's a controller
public class HelloWorldController {

    @GetMapping(path = "/helloWorld")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path="/helloWorldBean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }
}
