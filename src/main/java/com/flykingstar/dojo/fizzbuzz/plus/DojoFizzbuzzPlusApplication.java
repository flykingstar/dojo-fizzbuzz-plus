package com.flykingstar.dojo.fizzbuzz.plus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;

@SpringBootApplication
public class DojoFizzbuzzPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(DojoFizzbuzzPlusApplication.class, args);
        IntStream.range(1,101).forEach(number -> System.out.println(Calculator.of(number)));
    }

}
