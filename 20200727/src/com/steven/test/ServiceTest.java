package com.steven.test;

import com.steven.service.AdditionService;
import com.steven.service.UserService;
import com.steven.service.impl.UserServiceImpl;
import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class ServiceTest {

    @Test
    public void userServiceBySubClass() {
        UserService userService = new UserServiceImpl();
        System.out.println(UserService.NAME);
        System.out.println(UserService.GENDER);
        userService.methodA();
    }

    @Test
    public void userServiceByInnerClass() {
        UserService userService = new UserService() {
            @Override
            public void methodA() {
                System.out.println("直接重写");
            }
        };

        System.out.println(UserService.NAME);
        System.out.println(UserService.GENDER);
        userService.methodA();
    }

    @Test
    public void lambda() {
        AdditionService additionService = (numA, numB) -> numA + numB;
        System.out.println(additionService.add(10, 20));
    }

    @Test
    public void lambda1() {
        System.out.println("宝马在跑");
        System.out.println("奔驰在跑");
    }
}
