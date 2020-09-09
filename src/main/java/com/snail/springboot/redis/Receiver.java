package com.snail.springboot.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/8 19:43
 */
@Slf4j
@Component
public class Receiver {
    private AtomicInteger counter=new AtomicInteger();

    public void receiveMessage(String message){
        log.info("Received <{}>", message);
        counter.incrementAndGet();
    }
    public int count(){
        return counter.get();
    }
}
