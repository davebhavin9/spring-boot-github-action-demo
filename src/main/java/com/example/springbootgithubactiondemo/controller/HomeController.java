package com.example.springbootgithubactiondemo.controller;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// @RestController
// @RequestMapping("/")
// public class HomeController {

//     private final Logger logger = LoggerFactory.getLogger(this.getClass());

//     @GetMapping("app")
//     public String index(){

//         logger.info("Hello World! Testing Github Action");
//         logger.debug("This is a debug message");
//         logger.info("This is an info message");
//         logger.warn("This is a warn message");
//         logger.error("This is an error message");
//         System.out.println("hello");
//         return "Hello World! Testing Github Action";
//     }
// }

import com.example.springbootgithubactiondemo.helpers.SpringLoggingHelper;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/app/")
public class HomeController {
    private static final Logger logger = LogManager.getLogger(HomeController.class);
   
    @GetMapping("hello")
    public String index(){
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        new SpringLoggingHelper().helpMethod();
        return "index";
    }
}