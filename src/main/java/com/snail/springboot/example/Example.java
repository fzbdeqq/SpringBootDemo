package com.snail.springboot.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/3 22:25
 */
@RestController
public class Example {

    @RequestMapping("/")
    public String home(){
        return "Hello world";
    }
}
