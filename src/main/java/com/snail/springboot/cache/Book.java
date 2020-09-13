package com.snail.springboot.cache;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/13 21:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String isbn;
    private String title;
}
