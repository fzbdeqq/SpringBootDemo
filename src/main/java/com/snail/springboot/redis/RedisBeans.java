package com.snail.springboot.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.stereotype.Component;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/9 8:54
 */
@Slf4j
@Component
public class RedisBeans {
    @Bean
    RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory, MessageListenerAdapter listenerAdapter){
       RedisMessageListenerContainer container=new RedisMessageListenerContainer();
       container.setConnectionFactory(connectionFactory);
       container.addMessageListener(listenerAdapter,new PatternTopic("chat"));
       return container;
    }
    @Bean
    MessageListenerAdapter listenerAdapter(Receiver receiver){
        return new MessageListenerAdapter(receiver,"receiveMessage");
    }

}
