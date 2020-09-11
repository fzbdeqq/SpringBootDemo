package com.snail.springboot.gemfire;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

import java.io.Serializable;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/11 10:06
 */
@Region(value = "People")
@Data
public class Person implements Serializable {
    @Id
    private final String name;

    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
