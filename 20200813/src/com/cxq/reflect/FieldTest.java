package com.cxq.reflect;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author CXQ
 * @version 1.0
 */
public class FieldTest {
    private Class<?> Klass = FieldTest.class;
    public String name;
    private int gender = 0;
    private int age = 0;

    @Test
    public void reflectFieldsOnlyPublic() {
        for (Field field : Klass.getFields()) {
            System.out.println(field);
        }
    }

    @Test
    public void reflectFields() {
        for (Field field : Klass.getDeclaredFields()) {
            System.out.println(field);
        }
    }

    @Test
    public void reflectFieldOnlyPublic() throws Exception {
        System.out.println(Klass.getField("name"));
    }

    @Test
    public void reflectField() throws Exception {
        System.out.println(Klass.getDeclaredField("name"));
        System.out.println(Klass.getDeclaredField("gender"));
    }

    @Test
    public void usePublicField(){
        try {
            Object instanceA = Klass.getConstructor().newInstance();
            Object instanceB = Klass.getConstructor().newInstance();

            Field nameField = Klass.getField("age");

            nameField.set(instanceA, 0);
            nameField.set(instanceB, 1);

            System.out.println(nameField.get(instanceA));
            System.out.println(nameField.get(instanceB));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void usePrivateField() {
        try {
            Object instanceA = Klass.getDeclaredConstructor().newInstance();
            Object instanceB = Klass.getDeclaredConstructor().newInstance();

            Field ageField = Klass.getDeclaredField("gender");

            //获取权限
            ageField.setAccessible(true);
            ageField.set(instanceA, 1);
            ageField.set(instanceB, 2);
            System.out.println(ageField.get(instanceA));
            System.out.println(ageField.get(instanceB));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
