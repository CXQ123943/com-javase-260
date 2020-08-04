package com.steven.pojo;

import java.io.Serializable;

/**
 * @author StevenChen
 * @version 1.0
 */
public class Bird extends Animal implements Serializable {

    public Bird() {
        super("精卫");
    }

    protected int a(long t){
        return 0;
    }
}
