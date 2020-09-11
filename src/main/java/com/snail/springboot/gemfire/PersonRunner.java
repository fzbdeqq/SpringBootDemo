package com.snail.springboot.gemfire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/11 10:12
 */
@Component
public class PersonRunner implements ApplicationRunner {
    @Autowired
    PersonRepository personRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long start=System.currentTimeMillis();
        Person alice = new Person("Adult Alice", 40);
        Person bob = new Person("Baby Bob", 1);
        Person carol = new Person("Teen Carol", 13);

        System.out.println("Before accessing data in Pivotal GemFire...");

        Arrays.asList(alice,bob,carol).forEach(person -> {
            System.out.println("\t"+person);
        });

        System.out.println("Saving Alice, Bob and Carol to Pivotal GemFire...");

        personRepository.save(alice);
        personRepository.save(bob);
        personRepository.save(carol);

        System.out.println("Lookup each person by name...");

        System.out.println("Query adults (over 18):");
        StreamSupport.stream(personRepository.findByAgeGreaterThan(18).spliterator(),false)
                .forEach(person -> System.out.println("\t"+person));
        System.out.println("Query babies (less than 5):");
        StreamSupport.stream(personRepository.findByAgeLessThan(5).spliterator(), false)
                .forEach(person -> System.out.println("\t" + person));

        System.out.println("Query teens (between 12 and 20):");

        StreamSupport.stream(personRepository.findByAgeGreaterThanAndAgeLessThan(12, 20).spliterator(), false)
                .forEach(person -> System.out.println("\t" + person));
        System.out.println((System.currentTimeMillis()-start)+"ms");
    }
}
