package com.steven.abstractfactory;

/**
 * @author StevenChen
 * @version 1.0
 */
public interface CarFactory {
    /**
     * 创建发动机
     *
     * @return 发动机实例
     */
    Engine getEngine();

    /**
     * 创建轮胎
     *
     * @return 轮胎实例
     */
    Tires getTires();

    /**
     * 创建车灯
     *
     * @return 车灯实例
     */
    Lights getLights();
}