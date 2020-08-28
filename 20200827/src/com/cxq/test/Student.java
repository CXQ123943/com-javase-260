package com.cxq.test;

import lombok.Data;

/**
 * @author CXQ
 * @version 1.0
 */
public class Student {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.setName("zhao-si");
        System.out.println(demo.getName());

    }

    @Data
    private static class Demo{
        private String name;
    }
}
