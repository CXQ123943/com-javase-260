package com.steven.test;

import java.util.Scanner;

/**
 * @author StevenChen
 * @version 1.0
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用计算器，请输入第一个数：");
        int num01 = scanner.nextInt();
        System.out.println("请选择一个计算法测：");
        System.out.println("1.加法");
        System.out.println("2.减法");
        System.out.println("3.乘法");
        System.out.println("4.除法");
        System.out.println("5.取余");
        int algorithm = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int num02 = scanner.nextInt();
//        方法一：
//        String result = algorithm < 1 || algorithm > 5 ? "输入运算法则序号有误" :
//                algorithm == 1 ? String.valueOf(num01 + num02) :
//                algorithm == 2 ? String.valueOf(num01 - num02) :
//                algorithm == 3 ? String.valueOf(num01 * num02) :
//                algorithm == 4 ? num02 == 0 ? "除数不能为0" : String.valueOf(num01 / num02):
//                String.valueOf(num01 % num02);
//        System.out.println("计算结果：" + result);

        //方法二：
        String result = algorithm < 1 || algorithm > 5 ? "输入运算法则序号有误" :
                algorithm == 1 ? String.valueOf(num01 + num02) :
                        algorithm == 2 ? String.valueOf(num01 - num02) :
                                algorithm == 3 ? String.valueOf(num01 * num02) :
                                        algorithm == 4 & num02 == 0 ? "cnus" : algorithm == 5 ? String.valueOf(num01 % num02) : String.valueOf(num01 / num02);
        System.out.println("计算结果：" + result);
        scanner.close();
    }
}
