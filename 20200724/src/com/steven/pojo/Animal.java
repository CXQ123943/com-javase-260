package com.steven.pojo;

import java.io.Serializable;

/**
 * @author StevenChen
 * @version 1.0
 */
public class Animal implements Serializable {
    private String name;

    public Animal() {
    }
    protected int a(int x){
        return x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println("所有动物都可以移动");
    }
}
