package com.steven.innerclass;

/**
 * @author StevenChen
 * @version 1.0
 */
public class Outer {
    private String filed = "outer";

    class Inner{
        private String filed = "inner";
        public void innerMethod(){
            System.out.println(filed);
            Outer outer = new Outer();
            System.out.println(outer.filed);
            System.out.println(Outer.this.filed);
        }
    }
}
