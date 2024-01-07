package com.example.springbootgithubactiondemo.controller;

import java.util.logging.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/")
public class HomeController {

    Logger logger = Logger.getLogger(HomeController.class.getName());

    @GetMapping("home")
    public String index(){

        logger.info("Hello World! Testing Github Action");
        return "Hello World! Testing Github Action";
    }
}
