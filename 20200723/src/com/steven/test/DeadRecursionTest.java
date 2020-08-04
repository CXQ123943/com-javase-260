package com.steven.test;

import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class DeadRecursionTest {
    public void fun() {
        System.out.println("fun...");
        fun();// 自己调用自己，会导致方法无限执行，最终堆栈溢出，抛出java.lang.StackOverflowError
    }

    @Test
    public void test() {
        fun();
    }
}
