package com.steven.incognito;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class BaseServiceTest {

    @Test
    public void baseServiceByInnerClass() {

        //方法一
        new BaseService() {
            @Override
            public void create() {
                System.out.println("添加...");
            }
        }.create();

        //方法二
        BaseService baseService = new BaseService() {
            @Override
            void create() {
                System.out.println("添加...");
            }
        };
        baseService.create();
    }
}
