package com.steven.test;

import com.steven.demo.Person;
import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class InstanceTest {
    @Test
    public void instance(){
        // 变量类型 变量名 = new 构造器();
        Person zhaosi = new Person();
        System.out.println(zhaosi);
    }

    @Test
    public void changeForNoStaticField(){
        Person zhaosi = new Person();
        Person liuneng = new Person();
        zhaosi.id = 50;
        System.out.println(liuneng.id);
    }

    @Test
    public void changeForStaticField(){
        Person zhaosi = new Person();
        Person liuneng = new Person();
        // 静态属性不属于某个实例，而是属于这个模板
        Person.age = 50;
        System.out.println(Person.age);
    }
}
