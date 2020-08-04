package com.steven.test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class funTest {
    public static void main(String[] args){
        Integer a = Integer.valueOf(3);
        Integer b = 2;

        System.out.println("a 和 b 的原始的值："+a+" "+b);

        swap(a,b);

        System.out.println("a 和 b 的现在的值："+a+" "+b);
    }

    private static void swap(Integer a, Integer b) {
        // TODO Auto-generated method stub
        Integer temp = 0;
        temp = a;
        a = b;
        b = temp;
    }
}
