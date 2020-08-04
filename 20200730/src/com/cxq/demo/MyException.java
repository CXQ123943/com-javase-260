package com.cxq.demo;

import java.util.Arrays;

/**
 * @author CXQ
 * @version 1.0
 */
public class MyException extends Exception {
    public MyException(){}
    public MyException(String message){
        super(message);
        System.out.println("my exception service...");
    }

}
