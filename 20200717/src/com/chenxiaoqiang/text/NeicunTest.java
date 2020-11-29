package com.chenxiaoqiang.text;

import org.junit.Test;

/**
 * @author StevenChen
 * @version 2.0
 */
public class NeicunTest {

    @Test
    public void comparisonOfBasicDataTypes(){
        //内存存储比较
        int a = 100;
        double b = 10.5;
        String str = new String("java");
    }

    @Test
    public void selfCalculation(){
        int a = 13 , b = 3;
        System.out.println(++a + b);
        System.out.println(a-- - b);
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void nullPointerException(){
        String str1 = null;
        System.out.println("".equals(str1));
        //空指针异常
        //System.out.println(str1.equals(""));
    }
}
