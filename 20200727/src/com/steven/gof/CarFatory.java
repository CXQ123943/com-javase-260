package com.steven.gof;

/**
 * @author StevenChen
 * @version 1.0
 */
 class CarFatory {

     static Car getBenz(){
        return new Benz();
    }

     static Car getBmw(){
        return new Bmw();
    }
}
