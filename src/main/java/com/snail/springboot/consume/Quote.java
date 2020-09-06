package com.snail.springboot.consume;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/6 22:57
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Quote {
    private String type;
    private Value value;
}
