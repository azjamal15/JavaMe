package com.javafundamentals.javabasics;

import java.time.LocalDate;

public class Methods {
    public static void main(String[] args) {
        int x = incrementNumber(0);
        print(x);
        var now = getCurrentDate();
    }

    private static int incrementNumber(int value) {
        return value + 1;
    }

    private static void print(int value) {
        System.out.println(value);
    }

    private static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

}

