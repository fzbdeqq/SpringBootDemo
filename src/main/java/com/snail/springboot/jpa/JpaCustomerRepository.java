package com.snail.springboot.jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/11 16:49
 */
public interface JpaCustomerRepository extends CrudRepository<JpaCustomer,Long> {
    List<JpaCustomer> findByLastName(String lastName);

}
