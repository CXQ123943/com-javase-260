package com.cxq.test;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author CXQ
 * @version 1.0
 */
public class ReturnTest {

    @Test
    public void returnTest(){
        System.out.println(returnInTryWithBase(20));
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(returnInTryWithRef01(arr)));
        System.out.println(returnInTryWithString("初始字符串"));
        System.out.println(returnInCatch(0));
        System.out.println(returnInTryAndFinally());
    }

    private int returnInTryWithBase(int num){
        try {
            return num += 5;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            num = 100;
            System.out.println("结束...");
        }
        return num;
    }

    private int[] returnInTryWithRef01(int[] arr){
        try {
            arr[0] = 100;
            return arr;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            arr[0] = 200;
            System.out.println("结束...");
        }
        return arr;
    }

    private String returnInTryWithString(String str){
        try {
            str = "第一次修改了";
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            str = "第二次修改了";
            System.out.println("结束...");
        }
        return str;
    }

    private int returnInCatch(int num) {
        try {
            System.out.println(1 / num);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        } finally {
            System.out.println("结束...");
        }
        return 0;
    }

    private int returnInTryAndFinally() {
        try {
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("结束...");
            return 2;
        }
    }

    @Test
    public void tryCatchStructure() {
        try {
            System.out.println(1 / 1);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("程序结束...");
        }
        System.out.println("如果异常爆发，我不会被输出...");
    }
}
