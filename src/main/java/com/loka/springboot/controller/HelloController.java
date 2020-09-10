package com.loka.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author LoKa
 * @date 2020-09-08 10:34
 */
@Controller
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String sayHello(){
        return "aloha";
    }
}
