package com.steven.factorymethod.impl;

import com.steven.factorymethod.CarFactory;

/**
 * @author StevenChen
 * @version 1.0
 */
public class BenzFactoryImpl implements CarFactory {

    @Override
    public BenzImpl build() {
        return new BenzImpl();
    }
}
