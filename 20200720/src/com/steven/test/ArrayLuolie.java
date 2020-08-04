package com.steven.test;

import java.util.Scanner;

/**
 * @author StevenChen
 * @version 1.0
 */
public class ArrayLuolie {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入班级人数：");
        int numberQfPeople = scanner.nextInt();
        String[] studentName = new String[numberQfPeople];
        int[] fraction = new int[numberQfPeople];
        int maxGrade = -1;
        String name = "";

        for (int i = 0 ; i < numberQfPeople ; i++){
            System.out.println("请输入第" + (i+1) + "个人的名字");
            studentName[i] = scanner.next();
            System.out.println("请输入第" + (i+1) + "个人的成绩");
            fraction[i] = scanner.nextInt();

            if (maxGrade < fraction[i]){
                maxGrade = fraction[i];
                name = studentName[i];
            }
        }
        for (int i = 0; i < numberQfPeople; i++) {
            System.out.print(studentName[i] +"的成绩是"+fraction[i] + ",");
        }
        System.out.println("且成绩最好的是" + name + ",他的成绩是" +maxGrade);
        scanner.close();
    }
}
