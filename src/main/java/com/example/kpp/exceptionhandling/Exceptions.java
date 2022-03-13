package com.example.kpp.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exceptions {

    @ExceptionHandler
    public ResponseEntity<Object> exception(MyThrowable exception) {
        if (exception.status_code == 400)
            return new ResponseEntity<>("Empty line was send", HttpStatus.BAD_REQUEST);
        else
            return new ResponseEntity<>("Unexpected Error", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}