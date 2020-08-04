package com.cxq.demo;

import java.lang.annotation.*;

/**
 * @author CXQ
 * @version 1.0
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    // String name;
    String name();

    // int age = 18;
    int age() default 18;

    // String[] course = {"语文", "数学"}
    String[] course() default {"语文", "数学"};
}
