package com.example.springbootgithubactiondemo.controller;

import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.SimpleFormatter;
import java.io.IOException;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    public static final Logger logger = Logger.getLogger(HomeController.class.getName());
    static Handler fileHandler = null;

    public static void setup() {

        try {
            fileHandler = new FileHandler("var/log/app.log");//file
            SimpleFormatter simple = new SimpleFormatter();
            fileHandler.setFormatter(simple);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            logger.fine("This is an fine message");
        }
    }

    @GetMapping("app")
    public String index(){
        setup();
        logger.info("Hello World! Testing Java Application");
        logger.info("This is an info message");
        return "Hello World! Testing Java Application";
    }
}
