package com.cxq.collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author CXQ
 * @version 1.0
 */
public class ComparatorTest {

    /**
     * 实现Comparator接口 Comparator - compare
     * */
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

    @Test
    public void sortByComparator() {
        Set<Person> set = new TreeSet<>(new CustomComparator());
        set.add(new Person("b", 18));
        set.add(new Person("b", 15));
        set.add(new Person("a", 9));
        set.add(new Person("a", 9));
        System.out.println(set);
    }


    /**
     * 实现Comparable接口  Comparable - compareTo
     * */
    private static class Student implements Comparable<Student> {
        private String name;
        private int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Student student) {
            String prevName = this.name;
            String nextName = student.getName();
            int prevAge = this.age;
            int nextAge = student.getAge();
            return prevAge == nextAge ? nextName.compareTo(prevName) : nextAge - prevAge;
        }

        @Override
        public String toString() {
            return "Student [name=" + name + ", age=" + age + "]";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Student student = (Student) o;
            return age == student.age &&
                    Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        String getName() {
            return name;
        }

        int getAge() {
            return age;
        }
    }

    @Test
    public void sortByComparable() {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student studentA = new Student("a", 50);
        Student studentB = new Student("c", 60);
        Student studentC = new Student("b", 30);
        treeSet.add(studentA);
        treeSet.add(studentB);
        treeSet.add(studentC);
        System.out.println(treeSet);
    }
}
