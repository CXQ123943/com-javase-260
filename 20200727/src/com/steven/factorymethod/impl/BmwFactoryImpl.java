package com.steven.factorymethod.impl;

import com.steven.factorymethod.CarFactory;

/**
 * @author StevenChen
 * @version 1.0
 */
public class BmwFactoryImpl implements CarFactory {

    @Override
    public BmwImpl build() {
        return new BmwImpl();
    }
}
