package com.ttestoo.bypass.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.*

import javax.servlet.http.HttpServletRequest;

/**
 * @Author 领悟。
 * @Date 2021/8/29 1:59 下午
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String hello() {
        return "hello index...";
    }

}
