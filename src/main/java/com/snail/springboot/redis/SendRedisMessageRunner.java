package com.snail.springboot.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/9 8:34
 */
@Component
public class SendRedisMessageRunner implements CommandLineRunner {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Override
    public void run(String... args) throws Exception {
        ValueOperations valueOperation=redisTemplate.opsForValue();
        valueOperation.set("hello","hello"+System.currentTimeMillis(),1, TimeUnit.SECONDS);
        String hello= (String) valueOperation.get("hello");
        System.out.println(hello);

        stringRedisTemplate.convertAndSend("chat","hello from redis");
    }
}
