package com.ooqiu.gaming.microservicewebadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Cheysen
 * @Description 登录注册
 * @Date 2019/4/8 0:45
 * @Version 1.0
 */
@Controller
public class LoginController {
    /**
     * @Description 登录
     * @Author Cheysen
     * @Date 2019/4/8 0:49
     * @Param []
     * @return java.lang.String
     */
    @GetMapping("login")
    public String login(){
        return "login";
    }

    /**
     * 跳转到起始
     * @return
     */
    @GetMapping("home")
    public String home(){
        return "home";
    }
    @GetMapping("main")
    public String main(){
        return "main";
    }
    /**
     * @Description 登录业务
     * @Author Cheysen
     * @Date 2019/4/8 0:50
     * @Param
     * @return
     */
    @PostMapping("login")
    public String login(String email,String password) {
        if ("admin@admin.com".equals(email) && "admin".equals(password)) {
            return "redirect:main";
        }else {
            return "login";
        }
    }
}
