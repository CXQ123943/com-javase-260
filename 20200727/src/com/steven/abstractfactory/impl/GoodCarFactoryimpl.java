package com.steven.abstractfactory.impl;

import com.steven.abstractfactory.CarFactory;
import com.steven.abstractfactory.Engine;
import com.steven.abstractfactory.Lights;
import com.steven.abstractfactory.Tires;

public class GoodCarFactoryimpl implements CarFactory {

    @Override
    public Engine getEngine() {
        return new GoodEngineImpl();
    }

    @Override
    public Tires getTires() {
        return new GoodTiresImpl();
    }

    @Override
    public Lights getLights() {
        return new GoodLightsImpl();
    }
}