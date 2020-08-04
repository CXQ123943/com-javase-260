package com.steven.test;

import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class ArraysTest {

    @Test
    public void arraysMax(){
        int[] arrs = {1,3,5,7,9,2,4,6,8,0};
        int result = arrs[0];
        for (int i = 0; i < arrs.length; i++) {
            if (result < arrs[i]){
                result = arrs[i];
            }
        }
        System.out.println("最大值：" + result);
    }

    @Test
    public void arraysMin(){
        int[] arrs = {1,3,5,7,9,2,4,6,8,0};
        int result= arrs[0];
        for (int i = 0; i < arrs.length; i++) {
            if (result > arrs[i]){
                result = arrs[i];
            }
        }
        System.out.println("最小值：" + result);
    }

    @Test
    public void arraysavg(){
        int[] arrs = {1,3,5,7,9,2,4,6,8,0};
        double sum = 0;
        for (int i = 0; i < arrs.length; i++) {
            sum += arrs[i];
        }
        System.out.println("平均数：" + sum / arrs.length);
    }

    @Test
    public void arrayTraverse01() {
        int[] num = {1,2,3};
        for (int i = 0, j = num.length; i < j; i++) {
            System.out.print(num[i]);
        }
    }
    @Test
    public void arrayTraverse02() {
        int[] num = {1,2,3};
        for (int e: num){
            System.out.print(e);
        }
    }
}
