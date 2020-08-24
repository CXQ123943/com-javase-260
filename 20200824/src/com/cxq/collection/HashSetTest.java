package com.cxq.collection;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

/**
 * @author CXQ
 * @version 1.0
 */
public class HashSetTest {

    private HashSet<String> hashSet;

    @Before
    public void before() {
        hashSet = new HashSet<>(0);
    }

    @Test
    public void deduplication() {
        System.out.println(hashSet.hashCode());
        hashSet.add("a");
        hashSet.add("b");
        System.out.println(hashSet.hashCode());
        hashSet.add("b");
        System.out.println(hashSet.hashCode());
    }

    @Test
    public void iteratorByForEach() {
        int times = 20;
        for (int i = 0; i < times; i++) {
            hashSet.add(i + "");
        }
        for (String str : hashSet) {
            System.out.print(str + "\0");
        }
    }
}
