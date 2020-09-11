package com.snail.springboot.gemfire;

import org.springframework.data.gemfire.repository.query.annotation.Trace;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/11 10:08
 */
public interface PersonRepository extends CrudRepository<Person,String> {
    @Trace
    Person findByName(String name);
    @Trace
    Iterable<Person> findByAgeGreaterThan(int age);
    @Trace
    Iterable<Person> findByAgeLessThan(int age);
    @Trace
    Iterable<Person> findByAgeGreaterThanAndAgeLessThan(int greaterThanAge,int lessThanAge);

}
