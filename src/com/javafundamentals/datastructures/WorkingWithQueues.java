package com.javafundamentals.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.offer(new Person("James"));
        queue.offer(new Person("Mila"));
        queue.offer(new Person("Abu"));
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        //queue.remove();
        System.out.println(queue);
        queue.forEach(person -> System.out.println(person.name));
        // FIFO (First in first out)
    }

    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
