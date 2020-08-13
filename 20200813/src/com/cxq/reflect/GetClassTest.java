package com.cxq.reflect;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class GetClassTest {

    @Test
    public void getClassByInstance(){
        GetClassTest instance = new GetClassTest();
        Class<? extends GetClassTest> class01 = instance.getClass();
        Class<? extends GetClassTest> class02 = instance.getClass();
        System.out.println(class01.hashCode() == class02.hashCode());
    }

    @Test
    public void getClassByClassName(){
        Class<GetClassTest> class01 = GetClassTest.class;
        Class<GetClassTest> class02 = GetClassTest.class;
        System.out.println(class01.hashCode() == class02.hashCode());
    }

    @Test
    public void getClassByForNameMethod(){
        String qualifiedName = "com.cxq.reflect.GetClassTest";
        try {
            Class<?> class01 = Class.forName(qualifiedName);
            Class<?> class02 = Class.forName(qualifiedName);
            System.out.println(class01.hashCode() == class02.hashCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
