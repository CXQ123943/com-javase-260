package com.cxq.test;

import org.junit.Test;

import java.text.AttributedString;

/**
 * @author CXQ
 * @version 1.0
 */
public class CustomStackTest {
    private int[] arr = new int[2];

    private void push(int value){
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = arr.length; i < j; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = value;
        arr = newArr;
    }

    private int pop(){
        int lastElement = arr[arr.length - 1];
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        return arr[arr.length - 1];
    }

    private int peek(){
        return arr[arr.length - 1];
    }

    @Test
    public void api(){
        push(20);
        push(30);
        push(40);
        for (int e: arr){
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println("pop操作后栈顶的数据是：" + pop());
        System.out.print("操作后栈列为：");
        for (int e: arr){
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println("第二次pop操作后的栈顶数据：" + pop());
        System.out.println("使用peek操作查看栈顶的元素是：" + peek());
    }
}