package com.steven.test;

import com.steven.pojo.Manager;
import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class ExtendsTest {

    @Test
    public void extendsTest(){
        Manager cxq = new Manager();
        double salary = cxq.getSalary();
        double bonus = cxq.getBonus();
        System.out.println("工资是：" + (salary + bonus));
    }
}
