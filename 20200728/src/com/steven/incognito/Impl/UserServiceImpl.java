package com.steven.incognito.Impl;

import com.steven.incognito.UserService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class UserServiceImpl {

    @Test
    public void userServiceByInnerClass() {
        new UserService() {
            @Override
            public void create() {
                System.out.println("添加...");
            }
        }.create();
    }
}
