package com.cxq.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

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

    @Test
    public void synchronizedList() {
        List<String> arrayList = new ArrayList<>();
        List<String> list = Collections.synchronizedList(arrayList);
        list.add("赵四");
        System.out.println(list.get(0));
    }

    @Test
    public void copyOnWriteArrayList() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("zhao-si");
        System.out.println(list.get(0));
    }
}
