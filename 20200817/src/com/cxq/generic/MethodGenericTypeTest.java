package com.cxq.generic;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class MethodGenericTypeTest<T> {
    private <V> V method(V v, T t) {
        System.out.println("v:" + (v instanceof Integer));
        System.out.println("t:" + (t instanceof String));
        return v;
    }

    @Test
    public void api() {
        MethodGenericTypeTest<String> result01 = new MethodGenericTypeTest<>();
        System.out.println("return: " + result01.method(15,"...."));
        MethodGenericTypeTest<String> result02 = new MethodGenericTypeTest<>();
        System.out.println("return: " + result02.method(15.5,"..."));
    }
}
