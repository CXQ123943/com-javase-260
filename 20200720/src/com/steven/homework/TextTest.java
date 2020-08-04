package com.steven.homework;

import org.junit.Test;

import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author StevenChen
 * @version 1.0
 */
public class TextTest {

    @Test
    public void oneTest(){
        int bridePrice = 100000;
        boolean temp = bridePrice == 100000;
        if (temp){
            System.out.println("你给了我" + bridePrice + "RMB,我愿意嫁给我！！");
        }else{
            System.out.println("你没给够我一百万，我不愿意嫁给你");
        }
    }

    @Test
    public void twoTest(){
        String mountain = "山无棱";
        String sky = "天地合";
        if (mountain == "山无棱"){
            if (sky == "天地合"){
                System.out.println("山无棱，天地合，才敢与君绝！");
            }else{
                System.out.println("与君无缘");
            }
        }else{
            System.out.println("与君无缘");
        }
    }

    @Test
    public void thirdTest(){
        int age = 100;
        String ageLevel = "童年";
        if (age >= 0 & age <= 16){
            ageLevel = "童年";
        }else if (age <= 30) {
            ageLevel = "青年";
        }else if (age <= 50) {
            ageLevel = "中年";
        }else if (age <= 100) {
            ageLevel = "老年";
        }else {
            ageLevel = "年龄有误！";
        }
        System.out.println(ageLevel);
    }

    //fourTest  第四题
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("选择查询人的性别：1.男 2.女；输入编号（1或2）：");
        int sex = scanner.nextInt();
        System.out.println("输入一个年龄：");
        int age = scanner.nextInt();
        if (sex == 1){
            if (age > 0 & age <=2){
                System.out.println("男孩称谓为：襁褓");
            }else if (age > 2 & age <= 3){
                System.out.println("男孩称谓为：孩提");
            }else if (age > 3 & age <= 7){
                System.out.println("男孩称谓为：韶年");
            }else if (age > 7 & age <= 10){
                System.out.println("男孩称谓为：黄口");
            }
        }else {
            if (age > 0 & age <=2){
                System.out.println("女孩称谓为：襁褓");
            }else if (age > 2 & age <= 3){
                System.out.println("女孩称谓为：孩提");
            }else if (age > 3 & age <= 7){
                System.out.println("女孩称谓为：鬓年");
            }else if (age > 7 & age <= 10){
                System.out.println("女孩称谓为：黄口");
            }
        }
        scanner.close();
    }

    @Test
    public void fiveTest(){
        int bookNumber = 03;
        String result = "水浒传";
        switch (bookNumber){
            case 01:
                result = "红楼梦";
                break;
            case 02:
                result = "西游记";
                break;
            case 03:
                result = "金瓶梅";
                break;
            case 04:
                result = "水浒传";
                break;
            default:
                result = "错误";
                break;
        }
        System.out.println(result);
    }


    @Test
    public void sixTest(){
        float fraction = 48.5f;
        int temp = (int)fraction/10;
        String result = "";
        switch (temp){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                result = "不及格";
                break;
            case 6:
            case 7:
                result = "及格";
                break;
            case 8:
            case 9:
            case 10:
                result = "优秀";
                break;
            default:
                result = "输入有误";
                break;
        }
        System.out.println(result);
    }

    @Test
    public void sevenTest(){
        int i = 10;
        while (i < 15){
            i++;
            System.out.print(i + "\t");
        }
    }

    @Test
    public void eightTest(){
        int bridePrice = 600000;
        int sellBloodMoney = 1000;
        int frequency = 0;
        while (sellBloodMoney < bridePrice){
            frequency++;
            sellBloodMoney = 1000 * frequency;
        }
        System.out.println(frequency);
    }

    @Test
    public void nightTest() {
        int xiaoBinAge = 13;
        int daBinAge = 36;
        int year = 0;
        while (daBinAge != 2 * xiaoBinAge){
            year ++;
            xiaoBinAge ++;
            daBinAge ++;
        }
        System.out.println(year);
    }

    @Test
    public void tenTest() {
       int i = 9;
       do {
           i++;
           System.out.println(i);
       }while (i < 15);
    }

    @Test
    public void eleventTest() {
        double principal = 10000;
        double interest = 0;
        double interestRate = 0.03;
        int year = 1;
        do {
            interest = principal * interestRate;
            principal = principal + interest;
            year ++;
        }while (year <= 5);
        System.out.println(principal);
    }

    @Test
    public void twelvetTest() {
        int sum = 0;
        int addend = 0;
        do {
            addend ++;
            if (addend % 3 != 0){
                sum = sum + addend;
            }
        }while (addend <100);
        System.out.println(sum);
    }

    @Test
    public void work08() {
        // 求整数1-100的累加值，但要求第3，第6，第9...（3的倍数）个值，跳过不计算。
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }

    @Test
    public void thirteenTest() {
        for (int i = 1 ; i < 100 ; i++){
            i ++;
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    @Test
    public void fourteenTest() {
        int sum = 0;
        int frequency = 1;
        int temp = 0;
        z:
        for (; frequency < 10000; frequency++) {
            if (sum < 130) {
                temp = frequency * 5;
                sum = temp;
            }else {
                break z;
            }
        }
        System.out.println(frequency);
    }
//        int count = -1;
//        for (int sum = 0 , total = 135; sum <= total; sum += 5) {
//            count ++;
//        }
//        System.out.println(count);
//    }

    @Test
    public void fiveteenTest() {
        for (int i = 1; i <= 11; i++){
            if (i == 4){
                System.out.println(i + "号女嘉宾出场，i love you!");
                break;
            }
            System.out.println(i + "号女嘉宾出场！");
        }
    }

    @Test
    public void work12() {
        // 方法一：引入第三方变量的方法；
        int a = 1, b = 2;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

        // 方法二：不引入第三方变量的方法
        int a1 = 1, b1 = 2;
        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;
        System.out.println(a1);
        System.out.println(b1);
    }

    @Test
    public void work13() {
        boolean flag = false;
        for (int i = 100; i <= 120; i++) {
            if (i % 23 == 0) {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "有能被23整除的数" : "没有能被23整除的数");
    }

    @Test
    public void work14() {
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 23 == 0) {
                count++;
            }
        }
        System.out.println("有" + count + "个能被23整除的数");
    }

    @Test
    public void work15() {
        // 求数组：{1, 3, 5, 7, 9, 2, 4, 6, 8, 0}，的最小值，最大值和平均值。
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        int min = arr[0];
        int max = arr[0];
        double sum = 0;

        for (int i = 0, j = arr.length; i < j; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

            sum += arr[i];
        }

        System.out.println("最小值是：" + min);
        System.out.println("最大值是：" + max);
        System.out.println("平均值是：" + (sum / arr.length));
    }

    @Test
    public void work16() {
        // 输出数字串"18210210122"中的最大数字"8"和最小值数字"0"。

        String numStr = "18210210122";
        char[] numArr = numStr.toCharArray();
        //数组升序
        Arrays.sort(numArr);
        System.out.println("theMinValue:" + numArr[0]);
        System.out.println("theMaxValue:" + numArr[numArr.length - 1]);
    }

    @Test
    public void work17() {
        // 找出2个已知数组中相同的值：
        //    - int[] as = {2, 3, 6, 9, 11, 15, 19, 23, 35};
        //    - int[] bs = {1, 3, 7, 9, 11, 13, 14, 19, 35}。

        int[] as = {2, 3, 6, 9, 11, 15, 19, 23, 35};
        int[] bs = {1, 3, 7, 9, 11, 13, 14, 19, 35};
        for (int e1 : as) {
            for (int e2 : bs) {
                if (e1 == e2) {
                    System.out.print(e1 + "\t");
                }
            }
        }
    }

    @Test
    public void work18() {
        // 设计程序，要求可以从1到32随机生成不重复的7个数。
        int[] nums = new int[32];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        // 把数组打乱10000次
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int posA = random.nextInt(32);
            int posB = random.nextInt(32);
            int temp = nums[posA];
            nums[posA] = nums[posB];
            nums[posB] = temp;
        }

        // 取前七个
        for (int i = 0; i < 7; i++) {
            System.out.print(nums[i] + "\t");
        }
    }

    @Test
    public void work19(){
        int[] arr = new int[32];
        for (int i = 0, j = arr.length; i < j; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
