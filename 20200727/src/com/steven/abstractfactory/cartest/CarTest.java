package com.steven.abstractfactory.cartest;

import com.steven.abstractfactory.CarFactory;
import com.steven.abstractfactory.impl.BadCarFactoryImpl;
import com.steven.abstractfactory.impl.GoodCarFactoryimpl;
import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class CarTest {

    @Test
    public void abstractFactory(){
        // by good car
        CarFactory goodFactory = new GoodCarFactoryimpl();
        goodFactory.getEngine().info();
        goodFactory.getTires().info();
        goodFactory.getLights().info();

        // by bad car
        CarFactory badFactory = new BadCarFactoryImpl();
        badFactory.getEngine().info();
        badFactory.getTires().info();
        badFactory.getLights().info();
    }
}
