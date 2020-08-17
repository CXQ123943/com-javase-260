package com.cxq.generic;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author CXQ
 * @version 1.0
 */
public class SkipGenericTypeCheckTest {

    public  static class Point<T> {
        private T value;

        public T getValue() { return value; }
        public void setValue(T value) { this.value = value; }
    }

    @Test
    public void skipGenericTypeCheckByReflect() throws Exception {
        Point<String> demo = new Point<>();
        Class<?> klass = demo.getClass();
        Method method = klass.getMethod("setValue", Object.class);
        method.invoke(demo, 10);
        Method method1 = klass.getMethod("getValue");
        System.out.println(method1.invoke(demo));
    }
}
