package com.cxq.map;

import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;

/**
 * @author CXQ
 * @version 1.0
 */
public class TreeMapTest {

    private TreeMap<String, Object> treeMap;

    @Before
    public void before() {
        treeMap = new TreeMap<>();
    }

    @Test
    public void create() {
        treeMap.put("1", "a");
        treeMap.put("3", "c");
        treeMap.put("2", "b");
        treeMap.put("4", "f");
        treeMap.put("5", "e");
        System.out.println(treeMap);
    }

    @Test
    public void retrieve() {
        this.create();
        // 查询大于[等于]给定值的所有值中的最小Entry/key
        System.out.println(treeMap.ceilingEntry("4"));
        System.out.println(treeMap.ceilingKey("6"));
        // 查询大于给定值的所有值中的最小Entry/key
        System.out.println(treeMap.higherEntry("2"));
        System.out.println(treeMap.higherKey("3"));

        // 查询小于[等于]给定值的所有值中的最大Entry
        System.out.println(treeMap.floorEntry("4"));
        System.out.println(treeMap.floorKey("4"));
        // 查询小于[等于]给定值的所有值中的最大Entry/key
        System.out.println(treeMap.lowerEntry("4"));
        System.out.println(treeMap.lowerKey("4"));

        // 查询map的比较器实例，如果没有返回null
        System.out.println(treeMap.comparator());

        // 查询第一个Entry
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.lastKey());
    }

    @Test
    public void intercept() {
        this.create();
        // 将map截取到指定值(不包括指定值)
        System.out.println(treeMap.headMap("3"));
        // 将map截取到指定值(包括指定值)
        System.out.println(treeMap.headMap("4", true));
        // 将map从指定值开始截取(包括指定值)
        System.out.println(treeMap.tailMap("1"));
        // 将map从指定值开始截取(不包括指定值)
        System.out.println(treeMap.tailMap("2", true));

        // 从p1截取到p2，默认左闭右开
        System.out.println(treeMap.subMap("2", "4"));
        // 从p1截取到p2，左开右闭
        System.out.println(treeMap.subMap("3", false, "4", true));
    }
}
