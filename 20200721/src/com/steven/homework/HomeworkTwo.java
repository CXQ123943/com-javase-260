package com.steven.homework;

import com.sun.corba.se.spi.ior.MakeImmutable;
import org.junit.Test;

import java.util.Scanner;

/**
 * @author StevenChen
 * @version 1.0
 */
public class HomeworkTwo {
    public static void main(String[] args){

        //work05
       /* Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][4];
        int sum = 0;
        System.out.println("请输入数组的各个值：");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = scanner.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
        scanner.close();*/

        Scanner scanner = new Scanner(System.in);
        for (int classNo = 1; classNo <= 3; classNo++) {
            double sum = 0;
            for (int studentNo = 1; studentNo <= 4; studentNo++) {
                System.out.printf(">> 输入第%d个班级第%d个同学的成绩\n", classNo, studentNo);
                sum += scanner.nextDouble();
            }
            System.out.printf(">> 第%s个班的平均成绩为%.2f分\n\n", classNo, sum / 4);
        }
        System.out.println(">> 录入结束...");
        scanner.close();
    }

    @Test
    public void work01(){
        //桩号
        int zNo = 1;
        //false就是向左走
        boolean flag = false;
        for (int i = 0; i < 50; i++) {
            if (zNo == 1 || zNo == 8){
                flag = !flag;
            }
            zNo = flag ? zNo + 1 : zNo - 1;
        }
        System.out.println(zNo);
    }

    @Test
    public void work02(){
        for (int i =100; i < 1000; i++) {
            int onesPlace = i % 10;
            int tensPlace = i / 10 % 10;
            int hundredsPlace = i / 100;
            if (i == Math.pow(onesPlace,3) + Math.pow(tensPlace,3) + Math.pow(hundredsPlace,3)){
                System.out.println(i);
            }
        }
    }

    @Test
    public void work03(){
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d×%d=%02d\t", j, i, j*i);
            }
            System.out.println();
        }
    }

    @Test
    public void work04(){
        int i, j;
        int[][] arr = new int[10][10];
        for (i = 0; i < 10; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        for (i = 2; i < 10; i++){
            for (j = 1; j <=i ;j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        for (i = 0; i < 10; i++){
            for (j = 0; j <= i; j++){
                System.out.printf(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
}
