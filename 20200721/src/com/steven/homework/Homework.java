package com.steven.homework;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author StevenChen
 * @version 1.0
 */
public class Homework {

    @Test
    public void work01(){
        int num = 107;
        int a = num / 100;
        int b = num / 10 % 10;
        int c = num % 100 %10;
        char[] arr = {'零', '一', '二', '三', '四', '五', '六', '七', '八', '九' };
        String result = "";

        if (a != 0 && b != 0 && c != 0){
            result = arr[a] + "百" + arr[b] + "十" + arr[c];
        }else if (a != 0 && b != 0 && c == 0) {
            result = arr[a] + "百" + arr[b] + "十";
        }else if (a != 0 && b == 0 && c != 0) {
            result = arr[a] + "百" + "零" + arr[c];
        }else{
            result = "输入有误";
        }
        System.out.println(result);
    }

    @Test
    public void work02() {
        int num = 0;
        for (int i = 0; i < 2000; i++) {
            if (i % 3 ==0 & i % 8 == 0 & num < 15){
                System.out.print(i + "\t");
                num++;
                if (num % 5 ==0){
                    System.out.println();
                }
            }
        }
    }

    @Test
    public void work03() {
        int value01 = 1;
        int value02 = 1;
        for (int i = 0;i < 20 / 2; i++){
            System.out.print(value01 + " ");
            System.out.print(value02 + " ");
            value01 += value02;
            value02 += value01;
        }
        System.out.println();
    }

    @Test
    public void work04() {
        int factorial = 1;
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            factorial *= i;
            sum += factorial;
        }
        System.out.println(sum);
    }


    @Test
    public void work05() {
        int num = 0;
        for (int i = 101; i < 200; i++) {
            int divisor = 2;
            z:while (divisor < i){
                if (i % divisor == 0){
                    break z;
                }
                divisor++;
            }
            if (divisor == i){
                num++;
                System.out.print(i + " ");
            }
        }
        System.out.println("个数为：" + num);
    }
}