package com.steven.abstractfactory.impl;

import com.steven.abstractfactory.Tires;

/**
 * @author StevenChen
 * @version 1.0
 */
public class BadTiresImpl implements Tires {
    @Override
    public void info() {
        System.out.println("坏轮胎...");
    }
}