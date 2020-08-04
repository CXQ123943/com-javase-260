package com.chenxiaoqiang.text;

import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class PackageTest {

    @Test
    public void build(){

        String s1 = "dax";
        s1 = s1.concat("abc");
        System.out.println(s1);
        short a = 1;
        a+=4;
        System.out.println(new Byte((byte) 100));
        System.out.println(new Short((short) 200));
        System.out.println(new Integer(10000));
        System.out.println(new Long(1888L));
        System.out.println(new Double(478235));
        System.out.println(new Float(784));
        System.out.println(new Boolean(true));
        System.out.println(new Character('4'));
    }
}
