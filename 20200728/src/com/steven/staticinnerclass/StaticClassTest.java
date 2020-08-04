package com.steven.staticinnerclass;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class StaticClassTest {

    @Test
    public void staticInnerTest(){
        // 获取静态内部类
        StaticOuter.StaticInner staticInner = new StaticOuter.StaticInner();

        // 用内部类实例访问内部类成员方法
        staticInner.aMethod();

        // 可以直接使用内部类的名字调用内部类的静态方法
        StaticOuter.StaticInner.aStaticMethod();
    }
}
