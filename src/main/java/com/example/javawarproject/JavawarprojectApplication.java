package com.example.javawarproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JavawarprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavawarprojectApplication.class, args);
    }

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

}
