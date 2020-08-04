package com.cxq.test;

import com.cxq.demo.MyException;
import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class MyExceptionTest {

    @Test
    public void myException() throws MyException {
        throw new MyException("你触发了一个我自己写的异常...");
    }
}
