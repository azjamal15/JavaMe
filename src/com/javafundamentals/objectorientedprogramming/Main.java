package com.javafundamentals.objectorientedprogramming;

public class Main {
    public static void main(String[] args) {
//        Animals animal = new Animals("bobby");
        Animals dog = new Dog("flex", "bulldog");

//        System.out.println(animal.getName());
//        System.out.println(dog.getName() + " is a " + dog.getBreed());
        dog.makeSound();

        AnimalsInterface cat = new Cat("rosie");
        cat.makeSound();

        System.out.println("A" + "B");
        System.out.println(1 + 2);

        SuperMath superMath = new SuperMath();
        System.out.println(superMath.add(1, 90));
        System.out.println(superMath.add(1, 2, 90));

    }

}
