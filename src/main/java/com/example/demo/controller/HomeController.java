package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anderson on 23/06/2019.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){

        return "home";
    }
}
