package com.cxq.collection;

import org.junit.Test;

import java.util.Vector;

/**
 * @author CXQ
 * @version 1.0
 */
public class SynchronizedListTest {

    @Test
    public void vectorByDebug() {
        Vector<String> vector = new Vector<>();
        vector.add("zhao-si");
        vector.add(0,"liu-neng");
        vector.add("zhang-de-shuai");
        vector.add(1,"wang-wu");
        vector.set(1,"wang-de-fa");
        System.out.println(vector.capacity());
        System.out.println(vector.size());
        System.out.println(vector.contains("wang-de-fa"));
        System.out.println(vector.indexOf("zhang-de-shuai"));
        vector.removeElementAt(1);
        System.out.println(vector.remove(0));
        vector.clear();
    }
}
