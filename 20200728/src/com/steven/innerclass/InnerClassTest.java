package com.steven.innerclass;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class InnerClassTest {

    @Test
    public void innerClass() {
        //方法一
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.innerMethod();

        //方法二
        Outer.Inner inner1 = new Outer().new Inner();
        inner1.innerMethod();
    }
}
