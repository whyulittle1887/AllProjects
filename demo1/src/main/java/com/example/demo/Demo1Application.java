package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication

public class Demo1Application
{

    public static void main(String[] args)
    {
        SpringApplication.run(Demo1Application.class, args);
    }

    @RequestMapping(value = "/test")
    public String available()
    {
        return "Spring in Action";
    }

}
