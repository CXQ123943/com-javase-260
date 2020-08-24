package com.cxq.collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author CXQ
 * @version 1.0
 */
public class ComparatorTest {

    class Person {
        private String name;
        private Integer age;

        Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", age=" + age + "]";
        }

        //可重写可重写：阿里规范建议的
        @Override
        public int hashCode() {
            return super.hashCode();
        }

        //可重写可重写：阿里规范建议的
        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }

    class CustomComparator implements Comparator<Person> {
        @Override
        public int compare(Person personA, Person personB) {
            int result = personA.getName().compareTo(personB.getName());
            if (result == 0) {
                result = Integer.compare(personA.getAge(), personB.getAge());
            }
            return result;
        }
    }

    @Test
    public void sortByComparator() {
        Set<Person> set = new TreeSet<>(new CustomComparator());
        set.add(new Person("b", 18));
        set.add(new Person("b", 15));
        set.add(new Person("a", 9));
        set.add(new Person("a", 9));
        System.out.println(set);
    }
}
