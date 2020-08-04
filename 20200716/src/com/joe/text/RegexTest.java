package com.joe.text;

import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class RegexTest {

    @Test
    public void i() {
        String regex = "^\\d{1,9}\\w*$";
        System.out.println("123a".matches(regex));
        System.out.println("123".matches(regex));
        System.out.println("a".matches(regex));
        String re = "\t";
        System.out.println(re.matches("\\t"));

        String re01 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        System.out.println(re.matches("67453563463@qq.com"));

    }
}
