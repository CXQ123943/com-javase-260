package com.chenxiaoqiang.text;

import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class SoutTest {

    @Test
    public void print(){
        System.out.println("我叫" + "Steven" );
    }

    @Test
    public void err(){
        System.err.println("哎哟！！！");
        System.out.println(10);
    }
}
