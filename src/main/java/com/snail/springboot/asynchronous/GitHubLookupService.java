package com.snail.springboot.asynchronous;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/12 16:22
 */
@Service
@Slf4j
public class GitHubLookupService {
    @Autowired
    private RestTemplate restTemplate;

    public CompletableFuture<User> findUser(String user) throws InterruptedException {
        log.info("Looking up"+user);
        String url = String.format("https://api.github.com/users/%s", user);
        User result=restTemplate.getForObject(url,User.class);
        Thread.sleep(1000L);
        return CompletableFuture.completedFuture(result);
    }
}
