package com.yhever.servicefeign.service;

@FeignClient(value = "service-user")
public interface WelcomeService {
	
    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
