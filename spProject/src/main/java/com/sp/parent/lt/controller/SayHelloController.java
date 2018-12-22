package com.sp.parent.lt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lt")
public class SayHelloController {
    @RequestMapping("sayHello")
    public String sayHello(){
        return  "Hello World";
    }
}
