package com.example.springbootgithubactiondemo.helpers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SpringLoggingHelper {
    private static final Logger logger = LogManager.getLogger(SpringLoggingHelper.class);
    public void helpMethod(){
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
    }
}
