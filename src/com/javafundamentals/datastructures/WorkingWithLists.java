package com.javafundamentals.datastructures;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1000);


        for(int number  : numbers) {
            System.out.println(number);
        }
//        numbers.add("hello");
//        numbers.add(new Point(10, 10));
//        numbers.add('A');

//        numbers.remove(2);
//        numbers.add(0, -1);
//        System.out.println(numbers.contains(1000)); //true
//        System.out.println(numbers.isEmpty()); //false
//        System.out.println(numbers.size()); //size of array, 4 (n-1)
//        numbers.clear();

        System.out.println(numbers);
//
//        for(Object number : numbers) {
//            System.out.println(number);
//        }
//
//        System.out.println();
//        numbers.forEach(System.out::println);
    }
}
