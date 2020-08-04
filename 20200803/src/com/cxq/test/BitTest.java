package com.cxq.test;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class BitTest {

    @Test
    public void miec(){
        System.out.println(Integer.toBinaryString(-2 >> 3));
        System.out.println(Integer.toBinaryString(-2 / 8));
        System.out.println(Integer.toString(-2 >> 3));
    }

    @Test
    public void calculation1(){

        //交换数值.
        int a = 1;
        int b = 2;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void calculation2(){
        int a = 1;
        int b = 2;
        b = ( a + b ) - ( a = b);
        System.out.println(a);
        System.out.println(b);
    }
}
