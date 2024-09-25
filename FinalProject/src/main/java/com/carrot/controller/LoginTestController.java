package com.carrot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class LoginTestController {

    @GetMapping("/logi")
    public String login(){
        return "aa";
    }
}
