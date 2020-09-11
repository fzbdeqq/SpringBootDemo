package com.snail.springboot.jpa;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/11 16:45
 */
@Entity
@Data
public class JpaCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    public JpaCustomer() {
    }

    public JpaCustomer(String firstName,String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }

}
