package com.cxq.collection;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CXQ
 * @version 1.0
 */
public class ArrayListTest {
    private List<String> list;

    @Before
    public void before() {
        list = new ArrayList<>(10);
    }

    /**
     * ArrayList的增操作
     * */
    @Test
    public void add() {
        list.add("China");
        list.add("US");
        //向指定位置插入e
        list.add(1, "India");
        list.add("Africa");
        List<String> newList = new ArrayList<>();
        newList.add("Canada");
        newList.add("UK");
        list.addAll(newList);
        newList = new ArrayList<>();
        newList.add("Japan");
        newList.add("Korea");
        list.addAll(1, newList);
        System.out.println(list);
    }

    /**
     * ArrayList的删操作
     * */
    @Test
    public void delete() {
        list.add("China");
        list.add("US");
        list.add("Canada");
        list.add("UK");
        list.add("Japan");
        list.add("China");
        //reove是返回移除的元素；
        System.out.println(list.remove(1));
        System.out.println(list.remove("UK"));
        List<String> newList = new ArrayList<>();
        newList.add("Canada");
        System.out.println(list.removeAll(newList));
        System.out.println(list);
        newList = new ArrayList<>();
        newList.add("China");
        System.out.println(list.retainAll(newList));
        System.out.println(list);
    }

    /**
     * ArrayList的改操作
     * */
    @Test
    public void update() {
        list.add("China");
        list.add("US");
        list.add("Canada");
        list.add("UK");
        list.add("Japan");
        list.set(1, "UK");
        System.out.println(list);
        System.out.println(list.subList(1, 3));
    }

    /**
     * ArrayList的查操作
     * */
    @Test
    public void retrieve() {
        list.add("China");
        list.add("US");
        list.add("Canada");
        list.add("UK");
        list.add("Japan");
        list.add("China");
        System.out.println(list.get(0));
        System.out.println(list.indexOf("China"));
        //没有指定元素就返回 -1
        System.out.println(list.indexOf("null"));
        System.out.println(list.lastIndexOf("China"));
        System.out.println(list.contains("China"));
        List<String> newList = new ArrayList<>();
        newList.add("Korea");
        System.out.println(list.equals(newList));
        newList = new ArrayList<>();
        newList.add("China");
        newList.add("US");
        System.out.println(list.containsAll(newList));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.toArray()[0]);
    }
}
