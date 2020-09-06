package com.snail.springboot.consume;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/6 22:58
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Value {
    private Long id;
    private String quote;
}
