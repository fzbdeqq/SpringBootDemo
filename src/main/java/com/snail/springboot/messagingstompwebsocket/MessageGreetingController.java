package com.snail.springboot.messagingstompwebsocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import sun.rmi.runtime.Log;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/12 16:52
 */
@Controller
@Slf4j
public class MessageGreetingController {

    @MessageMapping("/message")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws InterruptedException {
        log.info(message.getName());
        Thread.sleep(1000);
        return new Greeting("Hello,"+ HtmlUtils.htmlEscape(message.getName())+"!");
    }
}
