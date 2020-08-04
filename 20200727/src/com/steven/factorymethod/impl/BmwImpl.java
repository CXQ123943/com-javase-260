package com.steven.factorymethod.impl;

import com.steven.factorymethod.Car;

/**
 * @author StevenChen
 * @version 1.0
 */
public class BmwImpl implements Car {

    @Override
    public void drive() {
        System.out.println("宝马在跑");
    }
}
