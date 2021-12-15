package com.supersource.controller;


import com.supersource.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value={"msg"})
public class AnnoController {
    @RequestMapping("testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username){
        System.out.println("执行了。。。");
        System.out.println(username);
        return "success";
    }

    /**
     * 获取到请求体的内容
     * @param body
     * @return
     */
    @RequestMapping("testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行了。。。");
        System.out.println(body);
        return "success";
    }

    /**
     * PathVaiable注解
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id){
        System.out.println("执行了。。。");
        System.out.println(id);
        return "success";
    }

    /**
     * 返回请求头
     * @param header
     * @return
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header){
        System.out.println("执行了。。。");
        System.out.println(header);
        return "success";
    }

    /**
     返回会话窗口的值
     * @param cookieValue
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){
        System.out.println("执行了。。。");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * ModelAttribute注解
     * @return
     */
    /**
     * ModelAttribute方法一测试
     * @param user
     * @return
     */
//    @RequestMapping("/testModelAttribute")
//    public String testModelAttribute(User user){
//        System.out.println("testModel方法执行了。。。");
//        System.out.println(user);
//        return "success";
//    }

    /**
     * 方法二测试
     * @param user
     * @return
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("testModel方法执行了。。。");
        System.out.println(user);
        return "success";
    }
    /**
     * 该方法先执行
     * @param uname
     * @return
     */
    @ModelAttribute
    public void showUser(String uname,Map<String, User> map){
        System.out.println("showUser执行了...");
        //查询数据库（模拟）
        User user=new User();
        user.setUname(uname);
        user.setAge(30);
        user.setDate(new Date());
        map.put("abc",user);
    }
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("testSessionAttribute方法执行了。。。");
        //底层会存贮到Session作用域中
        model.addAttribute("msg","美好");
        return "success";
    }

    /**
     * 获取Session作用域中的值
     * @param modelMap
     * @return
     */
    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap){
        System.out.println("getSessionAttribute方法执行了。。。");
        //底层会存贮到Session作用域中
        String msg= (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }
    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status){
        System.out.println("delSessionAttribute方法执行了。。。");
        //底层会存贮到Session作用域中
//        String msg= (String) modelMap.getAttribute("msg");
        status.setComplete();
//        System.out.println(msg);
        return "success";
    }
}
