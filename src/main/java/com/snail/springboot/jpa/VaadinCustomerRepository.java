package com.snail.springboot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/14 22:48
 */
public interface VaadinCustomerRepository extends JpaRepository<JpaCustomer,Long> {
    List<JpaCustomer> findByLastNameStartsWithIgnoreCase(String lastName);
}
