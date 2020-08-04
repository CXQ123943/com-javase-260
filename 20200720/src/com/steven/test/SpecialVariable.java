package com.steven.test;

import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class SpecialVariable {

    @Test
    public void tempTest(){
        int a = 1;
        int b = 2;
//        int temp = 0;
//        temp = a;
//        a = b;
//        b = temp;
        a +=b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
    @Test
    public void IdentificationVariable(){
        boolean flag = false;
        int sum = 0;
        for (int i = 100; i <= 200; i++){
            if (i % 23 ==0){
                flag = true;
                sum++;
            }else{
                continue;
            }
        }
        if (flag){
            System.out.println("有");
            System.out.println(sum);
        }else{
            System.out.println("无");
        }
    }
}
