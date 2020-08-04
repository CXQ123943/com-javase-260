package com.steven.gof;

/**
 * @author StevenChen
 * @version 1.0
 */
public interface Car {
    void drive();
}

class Benz implements Car{

    @Override
    public void drive() {
        System.out.println("奔驰在跑");
    }
}

class Bmw implements Car{

    @Override
    public void drive() {
        System.out.println("宝马在跑");
    }
}
