package com.steven.abstractfactory.impl;

import com.steven.abstractfactory.CarFactory;
import com.steven.abstractfactory.Engine;
import com.steven.abstractfactory.Lights;
import com.steven.abstractfactory.Tires;

public class BadCarFactoryImpl implements CarFactory {

    @Override
    public Engine getEngine() {
        return new BadEngineImpl();
    }

    @Override
    public Tires getTires() {
        return new BadTiresImpl();
    }

    @Override
    public Lights getLights() {
        return new BadLightImpl();
    }
}