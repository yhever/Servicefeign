package com.yhever.servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yhever.servicefeign.service.WelcomeService;

@RestController
public class WelcomeController {

    @Autowired
    WelcomeService serviceWelcome;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return serviceWelcome.sayHiFromClientOne(name);
    }
}
