package com.cxq.reflect;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author CXQ
 * @version 1.0
 */
public class ConstructorTest {

    /**
     * 写上所有类型的构造器进行测试
     * */
    static class Demo{
        public Demo() {
            System.out.println("public + ()：");
        }
        public Demo(String str) {
            System.out.println("public + (String)：" + str);
        }

        private Demo(int num) {
            System.out.println("private + (int)：" + num);
        }

        Demo(Double dbl) {
            System.out.println("(Double)：" + dbl);
        }

        protected Demo(Float flt) {
            System.out.println("protected  + (Float)：" + flt);
        }

        //一个普通的方法
        public void sayHello() {
            System.out.println("hello!");
        }
    }

    /**
     * 获取一个Demo类的对象
     */
    private Class<?> Klass = Demo.class;

    /**
     * 获取所有的的public构造方法.
     */
    @Test
    public void reflectConstructorsOnlyPublic() {
        Constructor<?>[] constructors = Klass.getConstructors();
        for (Constructor<?> e : constructors){
            System.out.println(e);
        }
    }

    /**
     * 获取所有的构造方法.
     */
    @Test
    public void reflectConstructors() {
        Constructor<?>[] declaredConstructors = Klass.getDeclaredConstructors();
        for (Constructor<?> e : declaredConstructors) {
            System.out.println(e);
        }
    }

    /**
     * 获取指定的一个public构造方法.
     */
    @Test
    public void reflectConstructorOnlyPublic() {
        try {
            System.out.println(Klass.getConstructor());
            System.out.println(Klass.getConstructor(String.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取指定类型的任意一个构造器
     * */
    @Test
    public void reflectConstructor() throws Exception {
        System.out.println(Klass.getDeclaredConstructor());
        System.out.println(Klass.getDeclaredConstructor(int.class));
        System.out.println(Klass.getDeclaredConstructor(String.class));
        System.out.println(Klass.getDeclaredConstructor(Double.class));
        System.out.println(Klass.getDeclaredConstructor(Float.class));
    }

    @Test
    public void usePublicConstructor(){
        try {
            Constructor<?> constructor = Klass.getConstructor();
            Demo demo = (Demo) constructor.newInstance();
            demo.sayHello();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void usePrivateConstructor(){
        try {
            Constructor<?> declaredConstructor = Klass.getDeclaredConstructor(int.class);
            declaredConstructor.setAccessible(true);
            Demo demo = (Demo) declaredConstructor.newInstance(10);
            demo.sayHello();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

