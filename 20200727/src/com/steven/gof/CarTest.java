package com.steven.gof;

import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class CarTest {

    @Test
    public void carTest(){
        Car benz = CarFatory.getBenz();
        Car bmw = CarFatory.getBmw();
        benz.drive();
        bmw.drive();
    }
}
