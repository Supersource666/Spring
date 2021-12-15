package com.supersource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {
@RequestMapping("/fileUpload01")
public String fileUpload01(HttpServletRequest request, HttpServletResponse response){
    System.out.println("fileUpload01执行了。。。");
    return "success";
}
}
