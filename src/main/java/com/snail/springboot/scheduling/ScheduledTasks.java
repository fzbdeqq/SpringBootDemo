package com.snail.springboot.scheduling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/6 22:46
 */
@Component
@Slf4j
public class ScheduledTasks {
    private static final SimpleDateFormat DATE_FORMAT=new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 500000)
//    @Scheduled(cron = "0/5 * * * * *")
    public void reportCurrentTime(){
        log.info("The time is now {}",DATE_FORMAT.format(new Date()));
    }
}
