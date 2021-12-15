package com.supersource.controller;


import com.supersource.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/response")
public class UserController {
    /**
     * 返回值类型为字符串
     * @param model
     * @return
     */
    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString执行了。。。");
        //模拟从数据库查询对象
        User user=new User();
        user.setUserName("天下");
        user.setPassword("123456");
        user.setAge(1000);
        model.addAttribute("user",user);
        return "success";
    }

    /**
     * 返回值是void
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid执行了。。。");
        //编写请求转发程序
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //重定向
//        response.sendRedirect(request.getContextPath()+"/index.jsp");
//        return ;
        //设置中文不乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().print("你好");
    }

    /**
     * 返回值是ModelAndView
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("testString执行了。。。");
        //创建ModelAndView对象
        ModelAndView mv=new ModelAndView();
        //模拟从数据库查询对象
        User user=new User();
        user.setUserName("河山统一");
        user.setPassword("666999");
        user.setAge(1000);
        //user对象存储到MOdelAndView对象
        mv.addObject("user",user);
        //跳转到哪一个页面
        mv.setViewName("success");
        return mv;
    }

    /**
     * 请求转发与重定向
     * @return
     */
    @RequestMapping("/testForwardAndRedirect")
    public String testForwardAndRedirect(){
        System.out.println("testForwardAndRedirect执行了。。。");
       //请求转发
        //return "forward:WEB-INF/pages/success.jsp";
        //重定向
        return "redirect:/index.jsp";
    }
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax执行了。。。");
        System.out.println(user);

        user.setUserName("小燕");
        user.setPassword("123");
        return user;

    }

}
