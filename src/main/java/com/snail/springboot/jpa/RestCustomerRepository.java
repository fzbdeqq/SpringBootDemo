package com.snail.springboot.jpa;

import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/13 21:09
 */
@RepositoryRestResource(collectionResourceRel="people",path="people")
public interface RestCustomerRepository extends PagingAndSortingRepository<JpaCustomer,Long> {
    List<JpaCustomer> findByLastName(@Param("name") String name);
}
