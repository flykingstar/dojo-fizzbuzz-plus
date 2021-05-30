package com.flykingstar.dojo.fizzbuzz.plus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class FizzBuzzTest {

    @ParameterizedTest(name = "when given {0} then return {1}")
    @CsvSource({
            "1,'1'",
            "2,'2'",
            "3,'fizz'",
            "5,'buzz'",
            "15,'fizzbuzz'",
            "13,'fizz'",
            "30,'fizzbuzz'",
            "300,'fizzbuzz'"
    })
    void should_return_number_by_given_number(int number,String result){
       assertThat(FizzBuzz.of(number)).isEqualTo(result);
    }
}
