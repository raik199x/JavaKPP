package com.example.kpp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    public void log_trace(String text){
        logger.trace(text);
    }
    public void log_info(String text){
        logger.info(text);
    }
    public void log_debug(String text){
        logger.debug(text);
    }
    public void log_warn(String text){
        logger.warn(text);
    }
    public void log_error(String text){
        logger.error(text);
    }
}