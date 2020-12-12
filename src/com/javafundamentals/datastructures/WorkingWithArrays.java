package com.javafundamentals.datastructures;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
//        int number = 1;
//        int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 20;
//        numbers[2] = 500;

        int[] numbers = {1, 20, 500, 4};
//        numbers[4] = 700;
        numbers[2] = 50;
        System.out.println(numbers[0]); //1
        System.out.println(Arrays.toString(numbers));
        for(int number : numbers) {
            System.out.println(number);
        }

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
