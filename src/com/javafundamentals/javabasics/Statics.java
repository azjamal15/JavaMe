package com.javafundamentals.javabasics;

import java.util.List;

public class Statics {

    static String BRAND;
    static List list;

    static {
        //used to initliaze static fields
        BRAND = "azamscode";
        list.add("");
    }

    public static void main(String[] args) {
        Person alex = new Person("alex");
        Person bob = new Person("bob");
        System.out.println(Person.createdPeople);
    }

    static class Person {
        static int createdPeople = 0;
        String name;

        Person(String name) {
            this.name = name;
            createdPeople++;
        }
    }
}
