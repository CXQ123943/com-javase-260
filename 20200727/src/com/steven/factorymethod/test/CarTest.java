package com.steven.factorymethod.test;

import com.steven.factorymethod.impl.BenzFactoryImpl;
import com.steven.factorymethod.impl.BmwFactoryImpl;
import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class CarTest {
    @Test
    public void factoryMethod() {
        new BenzFactoryImpl().build().drive();
        new BmwFactoryImpl().build().drive();
    }
}
