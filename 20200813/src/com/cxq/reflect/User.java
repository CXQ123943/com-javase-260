package com.cxq.reflect;

import com.sun.xml.internal.bind.v2.schemagen.episode.Klass;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author CXQ
 * @version 1.0
 */
public class User {
    private int age;
    public void hello() {
        age++;
    }

    @Test
    public void usePublicMethod() throws Exception {
        Long times = 1000000000L;
        //正常测试
        User user = new User();
        long t1 = System.currentTimeMillis();
        for (long i = 0; i < times; i++) {
            user.hello();
        }
        long t2 = System.currentTimeMillis();
        System.out.println("正常调用的时间：" + (t2 - t1) + "ms");

        //未开启权限测试
        Object instance = User.class.getConstructor().newInstance();
        Method fun = User.class.getMethod("hello");
        long t3 = System.currentTimeMillis();
        for (long i = 0; i < times; i++) {
            fun.invoke(instance);
        }
        long t4 = System.currentTimeMillis();
        System.out.println("未开权限调用的时间：" + (t4 - t3) + "ms");

        //开启权限测试
        long t5 = System.currentTimeMillis();
        fun.setAccessible(true);
        for (long i = 0; i < times; i++) {
            fun.invoke(instance);
        }
        long t6 = System.currentTimeMillis();
        System.out.println("开启权限调用的时间：" + (t6 - t5) + "ms");
    }

    @Test
    public void usePrivateField() {
        try {
            Object instanceA = User.class.getDeclaredConstructor().newInstance();

            Field ageField = User.class.getDeclaredField("age");

            //获取权限
            ageField.setAccessible(true);
            ageField.set(instanceA, 1);
            System.out.println(ageField.get(instanceA));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}