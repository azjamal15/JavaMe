package com.javafundamentals.datastructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Character> charactersSet = new HashSet();
        charactersSet.add('A');
        charactersSet.add('B');
        charactersSet.add('C');
        charactersSet.add('A');
        charactersSet.add('D');

        Iterator<Character> iterator = charactersSet.iterator();

        while(iterator.hasNext()) {
            Character character = iterator.next();
            System.out.println(character);
        }

        System.out.println("----------");
        for(char character : charactersSet) {
            System.out.println(character);
        }

    }
}
