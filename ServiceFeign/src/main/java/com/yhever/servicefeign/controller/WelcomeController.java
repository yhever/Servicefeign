package com.yhever.servicefeign.controller;

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
