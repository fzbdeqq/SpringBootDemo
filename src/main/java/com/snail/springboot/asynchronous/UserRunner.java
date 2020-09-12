package com.snail.springboot.asynchronous;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/12 16:32
 */
@Component
@Slf4j
public class UserRunner implements CommandLineRunner {
    @Autowired
    private GitHubLookupService gitHubLookupService;

    @Override
    public void run(String... args) throws Exception {
        long start=System.currentTimeMillis();
//        CompletableFuture<User> page1=gitHubLookupService.findUser("fzbdeqq");
//        CompletableFuture<User> page1=gitHubLookupService.findUser("PivotalSoftware");
//        CompletableFuture<User> page2=gitHubLookupService.findUser("CloudFoundry");
//        CompletableFuture<User> page3=gitHubLookupService.findUser("Spring-Projects");

//        CompletableFuture.allOf(page1,page2,page3).join();
//        CompletableFuture.allOf(page1).join();

        log.info("Elapsed time:"+(System.currentTimeMillis()-start));
//        log.info("--> " + page1.get());
//        log.info("--> " + page2.get());
//        log.info("--> " + page3.get());
    }
}
