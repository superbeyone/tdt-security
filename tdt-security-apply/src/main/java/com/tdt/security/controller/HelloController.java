package com.tdt.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: tdt-security
 * @ClassName: HelloController
 * @Author: Mr.superbeyone
 * @Time: 2018-11-24 22:17
 * @Description: HelloController
 **/
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
}
