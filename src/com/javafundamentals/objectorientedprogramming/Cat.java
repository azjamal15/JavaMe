package com.javafundamentals.objectorientedprogramming;

public class Cat implements AnimalsInterface {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
