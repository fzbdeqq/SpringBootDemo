package com.snail.springboot.cache;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/13 21:28
 */
public interface BookRepository {
    Book getByIsbn(String isbn);
}
