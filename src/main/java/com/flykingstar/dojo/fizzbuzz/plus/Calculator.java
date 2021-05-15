package com.flykingstar.dojo.fizzbuzz.plus;

/**
 * @author dengzhe
 * @date 2021/5/5
 */
public class Calculator {
    public static String of(int number) {
        StringBuilder sb = new StringBuilder();
        if (containOrDivideByNumber(number, 3)) {
            sb.append("fizz");
        }
        if (containOrDivideByNumber(number, 5)) {
            sb.append("buzz");
        }
        if (sb.length() == 0) {
            return String.valueOf(number);
        }
        return sb.toString();
    }

    private static boolean containOrDivideByNumber(int number, int operateNumber) {
        return divideByNumber(number, operateNumber) || containsNumber(number, String.valueOf(operateNumber));
    }

    private static boolean containsNumber(int number, String s) {
        return (number + "").contains(s);
    }

    private static boolean divideByNumber(int number, int divisor) {
        return number % divisor == 0;
    }
}
