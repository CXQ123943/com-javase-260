package com.cxq.reflect;

import org.junit.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author CXQ
 * @version 1.0
 */
public class ReflectAnnotationTest {

    @Documented
    @Target({ElementType.TYPE,ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MyAnnotation{
        String name();
        int age() default 18;
        String[] course() default {"语文", "数学"};
    }

    @MyAnnotation(name = "赵四")
    static class Student{

        @MyAnnotation(name = "刘能", course = {"英语","数学"}, age = 19)
        public void mothod(){}
    }

    @Test
    public void reflectAnnotation1() {
        Class<?> Klass= Student.class;
        MyAnnotation declaredAnnotation = Klass.getDeclaredAnnotation(MyAnnotation.class);
        System.out.println(declaredAnnotation.age());
        System.out.println(declaredAnnotation.name());
        System.out.println(Arrays.toString(declaredAnnotation.course()));
    }

    @Test
    public void reflectAnnotation2() {
        try {
            Class<?> Klass= Student.class;
            Method mothod = Klass.getDeclaredMethod("mothod");
            MyAnnotation declaredAnnotation = mothod.getDeclaredAnnotation(MyAnnotation.class);
            System.out.println(declaredAnnotation.age());
            System.out.println(declaredAnnotation.name());
            System.out.println(Arrays.toString(declaredAnnotation.course()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }


}
