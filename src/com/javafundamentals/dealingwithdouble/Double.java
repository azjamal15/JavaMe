package com.javafundamentals.dealingwithdouble;

import java.math.BigDecimal;

public class Double {
    public static void main(String[] args) {
//        double numberOne = 0.02;
//        double numberTwo = 0.03;
//        double result = numberTwo - numberOne;
//        System.out.println(result);

        BigDecimal numberOne = new BigDecimal("0.02");
        BigDecimal numberTwo = new BigDecimal("0.03");
        BigDecimal result = numberTwo.subtract(numberOne);
        System.out.println(result);

        double a = 1;
        double b = 2;
        System.out.println(a <= b);

        BigDecimal c = new BigDecimal("0.02");
        BigDecimal d = new BigDecimal("0.03");
        BigDecimal res = d.subtract(numberOne);
        System.out.println(c.compareTo(numberTwo));

        if(c.compareTo(d) == -1) {
            System.out.println("hi");
        }

    }
}
