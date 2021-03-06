package com.cxq.homework;

import org.junit.Test;

import java.util.*;

public class ClassTest {

    @Test
    public void test01() {

        Map<String, Object> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        Set<String> strings = map.keySet();
        for (String e : strings) {
            Object value = map.get(e);
            System.out.println("Key: " + e + " Value: " + value);
        }
    }

    @Test
    public void test02() {
        HashMap<Character, Integer> hashMap = new HashMap<>(5);
        char[] chars = "aabawebaaabbeecc".toCharArray();
        Integer value = 0;
        for (Character key : chars) {
            value = hashMap.get(key);
            if (value == null) {
                hashMap.put(key, 1);
            } else {
                hashMap.put(key, ++value);
            }
            System.out.println("Key: " + key + " Value: " + value);
        }
    }

    @Test
    public void test03() {
        int temp = 10000;
        ArrayList<Integer> arr = new ArrayList<>();
        long first01 = System.currentTimeMillis();
        for (int i = 0; i < temp; i++) {
            arr.add(0, 1);
        }
        long end01 = System.currentTimeMillis();
        System.out.println(end01 - first01);

        LinkedList<Integer> links = new LinkedList<>();
        long first02 = System.currentTimeMillis();
        for (int i = 0; i < temp; i++) {
            links.add(0, 1);
        }
        long end02 = System.currentTimeMillis();
        System.out.println(end02 - first02);
    }

    @Test
    public void test04() {
        TreeSet<Object> treeSet = new TreeSet<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 1;
            }
        });

        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(2);
        System.out.println(treeSet);
    }

    private static class StringDemo implements Comparable<StringDemo> {
        private String value;

        StringDemo(String value) {
            this.value = value;
        }

        @Override
        public int compareTo(StringDemo o) {
            int prevLength = value.length();
            int nextLength = o.value.length();
            return prevLength == nextLength ? 1 : nextLength -prevLength ;
        }

        @Override
        public String toString() {
            return value ;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            StringDemo that = (StringDemo) o;
            return Objects.equals(value, that.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }

    @Test
    public void sortedByStringLength() {
        Set<StringDemo> set = new TreeSet<>();
        set.add(new StringDemo("a"));
        set.add(new StringDemo("bc"));
        set.add(new StringDemo("aaa"));
        set.add(new StringDemo("aaaa"));
        set.add(new StringDemo("bbab"));
        set.add(new StringDemo("cdfa"));
        set.add(new StringDemo("b"));
        set.add(new StringDemo("c"));
       System.out.println(set);
    }
}