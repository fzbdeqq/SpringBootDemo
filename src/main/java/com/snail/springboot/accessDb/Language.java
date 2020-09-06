package com.snail.springboot.accessDb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/6 23:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Language {
    private Short languageId;
    private String name;
    private Date lastUpdate;
}
