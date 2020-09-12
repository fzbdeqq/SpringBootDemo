package com.snail.springboot.asynchronous;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/12 16:22
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class User {
    private String name;
    private String blog;
}
