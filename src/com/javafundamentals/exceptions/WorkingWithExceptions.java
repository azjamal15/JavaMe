package com.javafundamentals.exceptions;

public class WorkingWithExceptions {
    public static void main(String[] args) {
//        String name = "Azam";
//        System.out.println(name.length());

        String lastName = null;
//        System.out.println(lastName.length()); //gives us NPE

        try {
            System.out.println(lastName.length());
        } catch (Exception e) {
            System.out.println("Last Name is null");
        }
    }
}
