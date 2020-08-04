package com.steven.demo;

/**
 * @author StevenChen
 * @version 1.0
 */
public class MethodCallDemo {
    public void methodA() {
        System.out.println("普通、公共、非静态、无参");
    }

    public static void methodB() {
        System.out.println("普通、公共、静态、无参");
    }

    public void methodC(String str) {
        System.out.println("普通、公共、非静态、有参");
    }

    public static void methodD(String str, int b) {
        System.out.println("普通、公共、非静态、有参");
    }
}
