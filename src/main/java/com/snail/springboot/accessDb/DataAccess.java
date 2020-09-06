package com.snail.springboot.accessDb;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/6 23:18
 */
@Slf4j
@Component
public class DataAccess implements CommandLineRunner {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void run(String... args) throws Exception {
      List<Language> languages=jdbcTemplate.query("select language_id,name,last_update from language",new Object[] {  },
              (rs, rowNum) -> new Language(rs.getShort("language_id"), rs.getString("name"), rs.getDate("last_update"))
      );
      languages.forEach(customer -> log.info(customer.toString()));

    }
}
