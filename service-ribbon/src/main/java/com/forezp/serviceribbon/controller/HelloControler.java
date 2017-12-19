package com.forezp.serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.forezp.serviceribbon.service.HelloService;

@RestController
public class HelloControler {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    @ResponseBody
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
