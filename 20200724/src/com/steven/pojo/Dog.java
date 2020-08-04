package com.steven.pojo;

import java.io.Serializable;

/**
 * @author StevenChen
 * @version 1.0
 */
public class Dog extends  Animal implements Serializable {

    public Dog() {
        super();
    }

    public void methodA(){
//        move();
        super.move();
    }
}
