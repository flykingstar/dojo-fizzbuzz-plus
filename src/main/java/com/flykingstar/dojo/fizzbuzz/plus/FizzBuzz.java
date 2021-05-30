package com.flykingstar.dojo.fizzbuzz.plus;

/**
 * @author dengzhe
 * @date 2021/5/5
 */
public class FizzBuzz {

    public static String of(int number) {
        String result = "";
        if (isRelate(number, 3)) {
            result += "fizz";
        }
        if (isRelate(number, 5)) {
            result += "buzz";
        }
        if (!isRelate(number, 3) && !isRelate(number, 5)) {
            result = String.valueOf(number);
        }
        return result;
    }

    private static boolean isRelate(int number, int relateNumber) {
        return number % relateNumber == 0 || String.valueOf(number).contains(String.valueOf(relateNumber));
    }
}
