package com.chenxiaoqiang.text;

import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class BaseText {

    @Test
    public void SpecialBase(){
        System.out.println(0x782);
    }

    @Test
    public void SpecialBase2(){
        System.out.println(0775);
    }

    @Test
    public void byteNum(){
        byte a = 127;
        System.out.println(a);
    }

    @Test
    public void shortNum(){
        short a = 12557;
        System.out.println(a);
    }

    @Test
    public void intNum(){
        int a = 1543542557;
        System.out.println(a);
    }

    @Test
    public void longNum(){
        long a = 1564366757;
        System.out.println(a);
    }

    @Test
    public void floatNum(){
        float a = 646;
        System.out.println(a);
    }

    @Test
    public void doubleNum(){
        double a = 1564366757;
        System.out.println(a);
    }

    @Test
    public void booleanNum(){
        boolean a = true;
        System.out.println(a);
    }

    @Test
    public void charNum(){
        char a = 89;
        System.out.println(a);
    }
}
