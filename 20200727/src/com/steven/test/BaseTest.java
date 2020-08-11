package com.steven.test;

import com.steven.demo.BaseStartDemo;
import com.steven.demo.SonBaseDemo;
import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class BaseTest {

    @Test
    public void baseTest(){
        SonBaseDemo sonBaseDemo = new SonBaseDemo();
        sonBaseDemo.methodA();
        sonBaseDemo.methodB();
        sonBaseDemo.methodC();

        BaseStartDemo baseStartDemo = new SonBaseDemo();
        baseStartDemo.methodA();
        baseStartDemo.methodB();
        baseStartDemo.methodC();
    }
}
