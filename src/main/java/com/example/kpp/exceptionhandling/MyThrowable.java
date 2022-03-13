package com.example.kpp.exceptionhandling;

import com.example.kpp.LoggingController;

public class MyThrowable extends Throwable {
    public final int status_code;
    public static final LoggingController logger = new LoggingController();

    public MyThrowable(int status_code) {
        this.status_code = status_code;
    }

}
