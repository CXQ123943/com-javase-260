package com.steven.abstractfactory.impl;

import com.steven.abstractfactory.Lights;

/**
 * @author StevenChen
 * @version 1.0
 */
public class BadLightImpl implements Lights {
    @Override
    public void info() {
        System.out.println("坏车灯...");
    }
}
