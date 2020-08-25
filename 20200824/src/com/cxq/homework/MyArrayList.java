package com.cxq.homework;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class MyArrayList<T> {

    public static class Student {

        private String name;
        private String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        Student(String name, String age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student [name = " + name + ", age = " + age + "]";
        }
    }

    private int total = 0;
    private T[] arr = null;

    @SuppressWarnings("unchecked")
    private MyArrayList(int arrayInitSize) {
        arr = (T[]) new Object[arrayInitSize];
    }

    private MyArrayList() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    private void add(T t) {
        if (total >= arr.length) {
            T[] newArr = (T[]) new Object[arr.length + 10];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            newArr[total] = t;
            arr = newArr;
        } else {
            arr[total] = t;
        }
        total++;
    }

    private T get(int index) {
        if (total <= index) {
            throw new IndexOutOfBoundsException("数组越界");
        } else {
            return arr[index];
        }
    }

    @Test
    public void main() {
        MyArrayList<Student> list = new MyArrayList<Student>();
        for (int i = 0; i < 100; i++) {
            list.add(new Student("张三"+ "\0" + i , "" + i));
        }
        System.out.println(list.get(34));
        System.out.println(list.get(99));
        System.out.println(list.get(100));
    }
}
