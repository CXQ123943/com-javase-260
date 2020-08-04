package com.steven.abstractfactory.impl;

import com.steven.abstractfactory.Engine;

/**
 * @author StevenChen
 * @version 1.0
 */
class BadEngineImpl implements Engine {
    @Override
    public void info() {
        System.out.println("坏发动机...");
    }
}