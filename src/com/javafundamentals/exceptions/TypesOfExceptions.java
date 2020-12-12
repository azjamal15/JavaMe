package com.javafundamentals.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TypesOfExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        //Checked Exceptions
        FileInputStream inputStream = new FileInputStream("src/example.txt");

        /*
        try {
                FileInputStream inputStream() = new FileINputStream("src/exampl.txt");
         } catch(FileNotFoundException e) {
            e.printStackTrace();
         }
         */

        //Unchecked Exceptions
        var result = 10 / 2;
        System.out.println(result); //5

        try {
            var result2 = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException | NullPointerException | NumberFormatException e) {
            System.out.println("Cannot divide number by 0");
        } finally {
            System.out.println("cleaing up...");
        }

        performDivision(1, 0);
    }

    //Custom Exceptions

    static double performDivision(double a, double b) {
        if(b == 0) {
            throw new MyException("Cannot divide by 0");
        }
        return a / b;
    }


    static class MyException extends RuntimeException {
        public MyException(String message) {
            super(message);
        }
    }
}
