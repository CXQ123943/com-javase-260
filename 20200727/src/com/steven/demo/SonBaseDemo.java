package com.steven.demo;

/**
 * @author StevenChen
 * @version 1.0
 */
public class SonBaseDemo extends BaseStartDemo {
    @Override
    public void methodB() {
        System.out.println("子类重写了methodB方法");
    }

    @Override
    public void methodC() {
        System.out.println("子类重写了methodC方法");
    }
}
