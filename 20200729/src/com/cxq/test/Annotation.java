package com.cxq.test;

import com.cxq.demo.MyAnnotation;

/**
 * @author CXQ
 * @version 1.0
 */
public class Annotation {
    @MyAnnotation(name = "赵四")
    public class Student {

        @MyAnnotation(name = "刘能")
        public void method(){

        }
    }
}
