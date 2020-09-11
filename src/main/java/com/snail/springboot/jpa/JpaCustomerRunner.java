package com.snail.springboot.jpa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/11 16:54
 */
@Component
@Slf4j
public class JpaCustomerRunner implements CommandLineRunner {
    @Autowired
    private JpaCustomerRepository jpaCustomerRepository;

    @Override
    public void run(String... args) throws Exception {
        jpaCustomerRepository.save(new JpaCustomer("Jack", "Bauer"));
        jpaCustomerRepository.save(new JpaCustomer("Chloe", "O'Brian"));
        jpaCustomerRepository.save(new JpaCustomer("David", "Palmer"));
        jpaCustomerRepository.save(new JpaCustomer("Michelle", "Dessler"));

        log.info("Customers found with findAll():");
        log.info("-------------------------------");

        for(JpaCustomer jpaCustomer:jpaCustomerRepository.findAll()){
            log.info(jpaCustomer.toString());
        }
        log.info("");

        Optional<JpaCustomer> optional=jpaCustomerRepository.findById(1L);
        JpaCustomer jpaCustomer=optional.orElse(null);
        log.info("Customer found with findById(1L):");
        log.info("--------------------------------");
        if(jpaCustomer!=null){
            log.info(jpaCustomer.toString());
        }
        log.info("");
        log.info("Customer found with findByLastName('Bauer'):");
        log.info("--------------------------------------------");
        jpaCustomerRepository.findByLastName("Bauer").forEach(bauer->{
            log.info(bauer.toString());
        });
        log.info("");
    }
}
