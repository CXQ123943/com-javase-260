package com.chenxiaoqiang.text;

import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class HelloWorld {

    @Test
    public void fun01(){
        //ctrl + alt + l    快速对齐
        //ctrl + d   快速复制上一行
        //ctrl + shift + ?    多行注释
        //ctrl q 查看方法的详细信息
        System.out.println("我叫JoeZhou");
        System.out.println("175471");
        System.out.println("135631");
        System.out.println("175765");
        System.out.println("43255");
        System.out.println("52345");
        fun02();
    }

    @Test
    public void fun02(){
        System.out.println("2222");
    }

    @Test
    public void fun03(){
        System.out.println("2222");
        System.out.println();
        System.out.println("\n");
    }
}
