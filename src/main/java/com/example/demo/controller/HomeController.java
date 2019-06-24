package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anderson on 23/06/2019.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model){

        Person person = new Person();

        person.setprimeiroNome("Anderson");
        person.setemail("xxx@gmail.com");


        model.addAttribute("person", person);




        return "home";
    }
}
