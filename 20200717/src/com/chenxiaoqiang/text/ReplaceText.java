package com.chenxiaoqiang.text;

import org.junit.Test;

import java.net.StandardSocketOptions;
import java.util.Random;

/**
 * @author StevenChen
 * @version 1.0
 */
public class ReplaceText {

    @Test
    public void replaceTest(){
        String str = "AAAAA";
        String replace = str.replace('A', 'a');
        System.out.println(replace);
    }

    @Test
    public void logicalOperators(){
        System.out.println(false && true);
        System.out.println(true || false);
        System.out.println(true || false && false || true);
        System.out.println(true || false && false || false);
    }

    @Test
    public void ternaryOperator01(){
        int num1 = 473;
        int num2 = 473;
        String str = num1 > num2 ? String.valueOf(num1) : num1 < num2 ? num2+"" :"相等" ;
        System.out.println(str);
    }

    @Test
    public void ternaryOperator02(){
        int num1 = 188;
        int num2 = 473;
        String str = num1 == num2 ? "相等" : num1 > num2 ? num1 + "": num2 + "";
        System.out.println(str);
    }

    @Test
    public void randomNumbe(){
        Random random = new Random();
        int a = random.nextInt(5) + 5;
        System.out.println(a);
    }

    @Test
    public void randomNumbe01(){
        System.out.println(Math.random());
    }


}
