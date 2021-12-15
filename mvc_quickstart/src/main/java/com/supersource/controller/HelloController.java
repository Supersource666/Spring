package com.supersource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//控制类
@Controller
public class HelloController {
@RequestMapping(value = "/Hello",method={RequestMethod.GET},params = {"user=weiwei"},headers = "Accept")
    public String sayHello(){
        System.out.println("Hello,SprigMVC");
        return "success";
    }
}
