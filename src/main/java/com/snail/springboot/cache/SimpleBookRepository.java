package com.snail.springboot.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/13 21:29
 */
@Repository
public class SimpleBookRepository implements BookRepository{
    @Cacheable("books")
    @Override
    public Book getByIsbn(String isbn) {
        simulateSlowService();
        return new Book(isbn,"Some book");
    }

    private void simulateSlowService() {
    }
}
