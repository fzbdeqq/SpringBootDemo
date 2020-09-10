package com.snail.springboot.validate;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/10 10:06
 */
@Data
public class PersonForm {

    @NotNull
    @Size(min = 2,max = 30)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;

}
