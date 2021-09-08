package com.ttestoo.bypass.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 领悟。
 * @Date 2021/9/2 7:58 下午
 */
@RestController
public class LoginController {
    @PostMapping("/doLogin")
    public void doLogin(String username, String password) {
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(new UsernamePasswordToken(username, password));
            System.out.println("success");
        } catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println("failed");
        }
    }

    @GetMapping("/admin/index")
    public String admin_index() {
        return "admin page";
    }

    @GetMapping("/admin/")
    public String admin() {
        return "admin page";
    }

    @GetMapping("/index")
    public String index() {
        return "index page";
    }

    @GetMapping("/hello/{page}")
    public String hello(@PathVariable String page) {
        return "hello " + page;
    }

    @GetMapping("/login")
    public String login() {
        return "please login!";
    }
}