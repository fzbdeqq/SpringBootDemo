package com.snail.springboot.consume;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/6 22:59
 */
@Component
@Slf4j
public class Consume implements CommandLineRunner {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void run(String... args) throws Exception {
        Quote quote=restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString() );
    }
}
