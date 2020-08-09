package com.cxq.test;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class NothingTest {
    public NothingTest() {
        System.out.println("StaticBlockDemo的构造...");
    }

    {
        System.out.println("StaticBlockDemo的动态块01...");
    }

    {
        System.out.println("StaticBlockDemo的动态块02...");
    }

    static {
        System.out.println("StaticBlockDemo的静态块01...");
    }

    static {
        System.out.println("StaticBlockDemo的静态块02...");
    }

    @Test
    public void dynamicBlock() {
        new NothingTest();
        new NothingTest();
        new NothingTest();
    }
}




