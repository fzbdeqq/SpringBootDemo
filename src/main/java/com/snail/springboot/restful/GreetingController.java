package com.snail.springboot.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/6 22:36
 */
@RestController
public class GreetingController {
    private static final String template="Hello,%s";
    private final AtomicLong counter=new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template,name));
    }
}
