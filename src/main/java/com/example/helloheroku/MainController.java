package com.example.helloheroku;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String showHello(){
        return "hello_heroku";
    }
}
