package com.example.springbootgithubactiondemo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/")
public class HomeController {

    private static Logger logger = LogManager.getLogger();

    @GetMapping("home")
    public String index(){
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
        return "Hello World! Testing Github Action";
    }
}
