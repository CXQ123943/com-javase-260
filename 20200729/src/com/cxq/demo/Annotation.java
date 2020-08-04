package com.cxq.demo;

import java.lang.annotation.*;

/**
 * @author CXQ
 * @version 1.0
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation {
    ElementType[] value();
}