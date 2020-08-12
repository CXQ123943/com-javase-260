package com.cxq.test;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class CodeReuseTest {

    @Test
    public void codeReuseFirst(){
        Integer a = 100;
        Integer b = 100;
        Integer c = new Integer(100);
        System.out.println(a == b);
        System.out.println(b == c);
    }

    @Test
    public void codeReuseSecond(){
        String a = "abc";
        String b = "abc";
        // T：因为都在String池中，且不允许重复
        System.out.println(a == b);
        String c = new String("abc");
        // F：因为一个在String池中，一个在堆中新开辟的内存在中
        System.out.println(a == c);
        // T：a.intern()的作用就是将c从堆中移动到String池中
        System.out.println(a == c.intern());
    }

    @Test
    public void codeReuseThree(){
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;
        // T:ad都来自代码重用池
        System.out.println(c == d);
        // F:ef来自不同的堆内存
        System.out.println(e == f);
        // T:abc都来自代码重用池
        System.out.println(c == (a + b));
        // T:值和类型都一样
        System.out.println(c.equals(a + b));
        // T:abc都来自代码重用池
        System.out.println(g == (a + b));
        // F:值相同但是类型不同
        System.out.println(g.equals(a + b));
        // T:等号两端如果出现表达式，则触发自动拆箱
        System.out.println(g == (a + h));
    }
}
