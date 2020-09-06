package com.snail.springboot.restful;

import lombok.Data;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/6 22:35
 */
@Data
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
