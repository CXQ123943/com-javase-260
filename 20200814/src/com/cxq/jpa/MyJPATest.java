package com.cxq.jpa;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class MyJPATest {

    @Test
    public void myJpaTest() {
        new CreateTableTool(User.class).build();
    }
}
