package com.example.kpp;

import com.example.kpp.exceptionhandling.MyThrowable;
import com.example.kpp.logic.polynom;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @GetMapping(path = "/polynom")
    public String[][] WelcomMessage(@RequestParam(name="MyPath",defaultValue = "empty") String test) throws MyThrowable {
        return polynom.is_polynom(test);
    }
}
