package com.steven.test;

import com.steven.demo.MethodCallDemo;
import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class MethodCallTest {

    @Test
    public void  methodCall(){
        MethodCallDemo methodCallDemo01 = new MethodCallDemo();
        methodCallDemo01.methodA();
        MethodCallDemo.methodB();
        methodCallDemo01.methodC("lalal");
        MethodCallDemo.methodD("fjsiao",4);

        MethodCallDemo methodCallDemo02 = new MethodCallDemo();
        methodCallDemo02.methodA();
    }
}
