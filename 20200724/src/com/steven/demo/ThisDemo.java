package com.steven.demo;

import java.util.Arrays;

/**
 * @author StevenChen
 * @version 1.0
 */
public class ThisDemo {
    private String  name;
    private int age;
    private double[] score;

    public ThisDemo(String name, int age, double[] score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public ThisDemo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getScore() {
        return score;
    }

    public void setScore(double[] score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ThisDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + Arrays.toString(score) +
                '}';
    }
}


