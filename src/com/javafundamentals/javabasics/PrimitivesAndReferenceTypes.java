package com.javafundamentals.javabasics;

public class PrimitivesAndReferenceTypes {

    public static void main(String[] args) {
        int a = 10;
        int b = a; // pass by copy; unaffected by what happends in a
        a = 100;
        System.out.println("a = " + a + " - b = " + b);

        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);

        mariam.name = "Mariam";

        System.out.println("after changing alex");
        System.out.println(alex.name + " " + mariam.name);
    }

    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }
}
