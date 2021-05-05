package com.flykingstar.dojo.fizzbuzz.plus;

import org.assertj.core.api.AbstractStringAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTests {

    @Test
    void should_print_fizz_when_given_number_is_three() {
        assertNumber(3, "fizz");
    }


    @Test
    void should_print_buzz_when_given_number_is_five() {
        assertNumber(5, "buzz");
    }

    @Test
    void should_print_fizzbuzz_when_given_number_is_fifteen() {
        assertNumber(15, "fizzbuzz");
    }

    @Test
    void should_print_number_when_given_number_is_seven() {
        assertNumber(7, "7");
    }


    @Test
    void should_print_fizz_when_given_number_contain_three() {
        assertNumber(13, "fizz");
    }

    @Test
    void should_print_buzz_when_given_number_contain_five() {
        assertNumber(52, "buzz");
    }

    @Test
    void should_print_fizzbuzz_when_given_number_contain_three_and_five() {
        assertNumber(35, "fizzbuzz");
    }

    @Test
    void should_print_fizzbuzz_when_given_number_divide_three_and_contain_five() {
        assertNumber(51, "fizzbuzz");
    }

    @Test
    void should_print_fizzbuzz_when_given_number_contain_three_and_divide_five() {
        assertNumber(310, "fizzbuzz");
    }



    private AbstractStringAssert<?> assertNumber(Integer number, String expect) {
        return assertThat(Calculator.of(number)).isEqualTo(expect);
    }

}
