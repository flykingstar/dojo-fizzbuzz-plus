package com.flykingstar.dojo.fizzbuzz.plus;

/**
 * @author dengzhe
 * @date 2021/5/5
 */
public class Calculator {
    public static String of(int number) {
        if(containOrDivideByFive(number) && containOrDivideByThree(number)){
            return "fizzbuzz";
        }
        if (containOrDivideByThree(number)) {
            return "fizz";
        }
        if (containOrDivideByFive(number)) {
            return "buzz";
        }
        return number + "";
    }

    private static boolean containOrDivideByThree(int number) {
        return divideByThree(number) || containsByThree(number);
    }

    private static boolean containOrDivideByFive(int number) {
        return divideByFive(number) || containsByFive(number);
    }

    private static boolean containsByFive(int number) {
        return containsNumber(number, "5");
    }

    private static boolean containsNumber(int number, String s) {
        return (number + "").contains(s);
    }

    private static boolean containsByThree(int number) {
        return containsNumber(number, "3");
    }

    private static boolean divideByThree(int number) {
        return divideByNumber(number, 3);
    }

    private static boolean divideByFive(int number) {
        return divideByNumber(number, 5);
    }

    private static boolean divideByNumber(int number, int divisor) {
        return number % divisor == 0;
    }
}
