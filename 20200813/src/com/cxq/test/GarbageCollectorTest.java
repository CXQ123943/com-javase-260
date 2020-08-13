package com.cxq.test;

import org.junit.Test;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;

/**
 * @author CXQ
 * @version 1.0
 */
public class GarbageCollectorTest {

    @Test
    public void myGarbageCollector() {
        for (GarbageCollectorMXBean e : ManagementFactory.getGarbageCollectorMXBeans()) {
            System.out.println(e.getName());
        }
    }
}
