package com.javafundamentals.datastructures;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4); // last in , first out

        System.out.println(stack.peek()); //looks at top of stack, does not remove
        stack.pop(); //removes most recent item in the stack

        System.out.println(stack); //4 is now gone
        stack.pop();
        stack.pop();

        System.out.println(stack);

        // LAST IN FIRST OUT
    }
}
