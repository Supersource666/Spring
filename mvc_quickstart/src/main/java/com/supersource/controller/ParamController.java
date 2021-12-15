package com.supersource.controller;

import com.supersource.dao.Account;
import com.supersource.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping(value = "/testParam")
    public String testParam(String username,String password){
        System.out.println("执行了。。。");
        System.out.println("用户名："+username);
        System.out.println("密码："+password);
        return "success";
    }
    @RequestMapping(value = "/saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行了。。。");
        System.out.println(account);
        return "success";
    }
    /**
     * 自定义类型转换器
     * @param user
     * @return
     */
    @RequestMapping(value = "/saveUser")
    public String saveUser(User user){
        System.out.println("执行了。。。");
        System.out.println(user);
        return "success";
    }
//    获取原生API
   @RequestMapping(value = "/testServlet")
   public String testServlet(HttpServletRequest request, HttpServletResponse response){
          System.out.println("执行了。。。");
          System.out.println(request);
          System.out.println(response);
          HttpSession session= request.getSession();
          System.out.println(session);
          ServletContext servletContext=session.getServletContext();
          System.out.println(servletContext);
          return "success";
   }

}
