package com.joe.text;

import org.junit.Test;

import javax.xml.bind.annotation.XmlTransient;

/**
 * @author StevenChen
 * @version 1.0
 */
public class Stringtest {

    @Test
    public void stringText(){
        //输出对应位置的字符串
        String str = " Lucky! Lucky";
        char c = str.charAt(1);
        System.out.println(c);

        String a = str.concat("a");
        //链接两个字符串
        String boy = str.concat("boy");
        System.out.println(boy);
        String concat = str.concat("boy").concat(" is").concat(" me!");
        System.out.println(concat);

        //查询是否包含该字符，输出boolean值
        boolean s = str.contains("s");
        System.out.println(s);
        boolean u = str.contains("u");
        System.out.println(u);

        //从参数位置输出改字符串的子字符串，直到结束
        String substring = str.substring(3);
        System.out.println(substring);

        //字符串比较，输出boolean值(不忽略大小写)
        boolean equals = str.equals("lucky!");
        System.out.println(equals);

        //字符串比较，输出boolean值(忽略大小写)
        boolean b = str.equalsIgnoreCase("lucky!");
        System.out.println(b);

        //查询第一次出现的位置
        int uc = str.indexOf("u");
        System.out.println(uc);
        System.out.println(str.lastIndexOf("a"));

        //冲指定位置开始,查询字串出现的位置
        int i = str.indexOf("u", 0);
        System.out.println(i);

        boolean empty = str.isEmpty();
        System.out.println(empty);

        String replace = str.replace("u", "kkk");
        System.out.println(replace);

        boolean ck = str.startsWith("Lu");
        System.out.println(ck);

        boolean y = str.endsWith("ky");
        System.out.println(y);

        String s1 = str.toLowerCase();
        System.out.println(s1);
        String s2 = str.toUpperCase();
        System.out.println(s2);

        String trim = str.trim();
        System.out.println(trim.toLowerCase());
    }

    @Test
    public void stringText01(){
        long l = System.currentTimeMillis();
        String str = "handsome boy";
        System.out.println(str.charAt(1));
        System.out.println(str.concat("djias"));
        System.out.println(str.contains("au"));
        System.out.println(str.endsWith("u"));
        System.out.println(str.startsWith("a"));
        System.out.println(str.startsWith("ha"));
        System.out.println(str.equals("duwif"));
        System.out.println(str.equalsIgnoreCase("Handsome boy"));
        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf("0",7));
        System.out.println(str.lastIndexOf("e"));
        System.out.println(str.lastIndexOf("y",3));
        System.out.println(str.isEmpty());
        System.out.println(str.length());
        System.out.println(str.replace("a","P"));
        System.out.println(str.substring(3));
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
