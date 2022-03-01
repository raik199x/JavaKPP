package com.example.kpp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
    @GetMapping(path = "/polynom")
    public String WelcomMessage(@RequestParam(name="MyPath",defaultValue = "empty") String test){

        for(int i = 0; i < test.length(); i++)
            if(test.charAt(i) != test.charAt(test.length()-i-1))
                return "The word is: " + test + " - " + Integer.toString(test.length()) + " symbols" + "\nIt's not a polynom!";
        return "The word is: " + test + " - " + Integer.toString(test.length()) + " symbols" + "\nIts a polynom!";
    }
}
