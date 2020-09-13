package com.snail.springboot.transaction;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/11 11:16
 */
@Service
@Slf4j
public class BookingService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void del(){
        log.info("del booking");
        jdbcTemplate.execute("delete from bookings");
    }
    public void book(String ...persons){
        for (String person:persons){
            log.info("Booking {} in a seat...",person);
            jdbcTemplate.update("insert into bookings(first_name) values(?)",person);
        }
    }

    public List<String> findAllBookings(){
        return jdbcTemplate.query("select first_name from bookings",(rs,rowNum)->rs.getString("first_name"));
    }
}
