package com.flykingstar.dojo.fizzbuzz.plus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTests {

    @ParameterizedTest(name = "when given {0} should return {1}")
    @CsvSource({
            "1,'1'",
            "2,'2'",
            "3,'fizz'",
            "5,'buzz'",
            "6,'fizz'",
            "15,'fizzbuzz'",
            "13,'fizz'",
            "300,'fizzbuzz'",
            "51,'fizzbuzz'"
    })
    void should_return_correct_string_by_given(Integer number,String result){
        assertThat(FizzBuzz.of(number)).isEqualTo(result);
    }
}
