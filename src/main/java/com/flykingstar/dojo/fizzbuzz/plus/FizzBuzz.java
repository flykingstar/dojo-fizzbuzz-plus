package com.flykingstar.dojo.fizzbuzz.plus;

/**
 * @author dengzhe
 * @date 2021/5/5
 */
public class FizzBuzz {

    public static String of(Integer number) {
        String result = "";
        if (isRelated(number, 3)) {
            result = result + "fizz";
        }
        if (isRelated(number, 5)) {
            result = result + "buzz";
        }
        if (result.length() == 0) {
            result = String.valueOf(number);
        }
        return result;
    }

    private static boolean isRelated(Integer number, int operator) {
        return number % operator == 0 || String.valueOf(number).contains(String.valueOf(operator));
    }
}
