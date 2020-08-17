package com.cxq.generic;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author CXQ
 * @version 1.0
 */
public class ReflectGenericTypeTest {
    private static class Demo<T, K> { }

    private Demo<String, Object> method(Demo<Integer, Double> demo) {
        return null;
    }

    private Method method;

    @Before
    public void before() throws NoSuchMethodException {
        method = ReflectGenericTypeTest.class.getDeclaredMethod("method", Demo.class);
    }

    @Test
    public void getGenericActualParamTypeOfMethod() {
        for (Type paramType: method.getGenericParameterTypes()) {
            System.out.println(paramType.getTypeName());
            //判断是否带泛型 即使参数化接口
            if (paramType instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) paramType;
                for (Type actualParamType: parameterizedType.getActualTypeArguments()) {
                    System.out.println("\t" + actualParamType);
                }
            }
        }
    }

    @Test
    public void getGenericActualReturnTypeOfMethod() {
        Type returnType = method.getGenericReturnType();
        if (returnType instanceof ParameterizedType) {
            System.out.println(returnType.getTypeName());
            ParameterizedType parameterizedType = (ParameterizedType) returnType;
            for (Type actualTypeArgument : parameterizedType.getActualTypeArguments()) {
                System.out.println("\t" + actualTypeArgument.getTypeName());
            }
        }
    }
}
