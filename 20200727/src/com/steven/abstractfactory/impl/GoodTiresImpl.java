package com.steven.abstractfactory.impl;

import com.steven.abstractfactory.Tires;

/**
 * @author StevenChen
 * @version 1.0
 */
public class GoodTiresImpl implements Tires {
    @Override
    public void info() {
        System.out.println("好轮胎...");		
    }
}
