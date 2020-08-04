package com.cxq.test;

/**
 * @author CXQ
 * @version 1.0
 */
class A {
    void foo() throws Exception { throw new Exception(); }
}
class SubB2 extends A {
    @Override
    void foo() { System.out.println("B "); }
}
class Tester {
    public static void main(String[] args) throws Exception {
        A a = new SubB2();
        a.foo();//14
    }
}
