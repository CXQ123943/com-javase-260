package com.cxq.util;

import org.junit.Test;

import java.util.Stack;

/**
 * @author CXQ
 * @version 1.0
 */
public class StackTest {

    @Test
    public void api() {
        Stack<Object> objects = new Stack<>();
        System.out.println("push: " + objects.push(1));
        System.out.println("push: " + objects.push(2));
        System.out.println("push: " + objects.push(3));
        System.out.println("push: " + objects.push(4));
        System.out.println("peek: " + objects.peek());
        System.out.println("search: " + objects.search(3));
        System.out.print("for: ");
        while (!objects.isEmpty()) {
            System.out.print(objects.pop() + "\t");
        }
    }
}
