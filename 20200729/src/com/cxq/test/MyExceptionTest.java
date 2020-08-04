package com.cxq.test;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class MyExceptionTest {

    @Test
    public void trycatchStructure(){
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println("除数不能为0！");
        } finally {
            System.out.println("程序结束！");
        }
    }
}
