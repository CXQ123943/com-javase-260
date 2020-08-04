package com.steven.staticinnerclass;

/**
 * @author CXQ
 * @version 1.0
 */
public class StaticOuter {
    private int field = 1;
    private static int staticField = 2;

    static class StaticInner {
        private int field = 3;
        private static int staticField = 4;

        public void aMethod() {
            System.out.println(field);
            System.out.println(staticField);
            System.out.println(new StaticOuter().field);
            System.out.println(StaticOuter.staticField);

            // 无法直接访问外部类非静态属性
            // System.out.println(Outer.this.field);
        }

        public static void aStaticMethod() {
            System.out.println(staticField);
            System.out.println(new StaticOuter().field);
            System.out.println(StaticOuter.staticField);

            // 静态方法无法访问非静态属性
            // System.out.println(field);

            // 无法直接访问外部类非静态属性
            // System.out.println(Outer.this.field);
        }
    }
}
