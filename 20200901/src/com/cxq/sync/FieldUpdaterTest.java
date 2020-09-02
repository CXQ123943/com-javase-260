package com.cxq.sync;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.BinaryOperator;

/**
 * @author CXQ
 * @version 1.0
 */
public class FieldUpdaterTest {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Student implements Serializable {
        volatile long id;
        volatile String name;
        volatile int age;
    }

    @Test
    public void atomicLongFieldUpdater() {
        Student student = new Student(1L, "zhao-si", 15);
        AtomicLongFieldUpdater<Student> updater = AtomicLongFieldUpdater.newUpdater(Student.class, "id");

        updater.get(student);
        System.out.println("id from student：" + student.getId());

        updater.compareAndSet(student, 1L, 5L);
        System.out.println("update id from student to 5L：" + student.getId());

        updater.incrementAndGet(student);
        System.out.println("++id：" + student.getId());

        updater.decrementAndGet(student);
        System.out.println("--id：" + student.getId());

        updater.addAndGet(student, 5);
        System.out.println("id+=5 and return：" + student.getId());

        System.out.println("accumulate and return：" + updater.accumulateAndGet(student, 5, (left, right) -> {
            System.out.println("left：" + left);
            System.out.println("right：" + right);
            return (left + 37) * (right + 17);
        }));
    }

    @Test
    public void atomicIntegerFieldUpdater() {
        Student student = new Student(1L, "zhao-si", 10);
        AtomicIntegerFieldUpdater<Student> updater = AtomicIntegerFieldUpdater.newUpdater(Student.class, "age");

        updater.get(student);
        System.out.println("age from student：" + student.getAge());

        updater.compareAndSet(student, 10, 20);
        System.out.println("update age from student to 20：" + student.getAge());

        updater.incrementAndGet(student);
        System.out.println("++age：" + student.getAge());

        updater.decrementAndGet(student);
        System.out.println("--age：" + student.getAge());

        updater.addAndGet(student, 5);
        System.out.println("age+=5 and return：" + student.getAge());

        System.out.println("accumulate and return：" + updater.accumulateAndGet(student, 5, (left, right) -> {
            System.out.println("left：" + left);
            System.out.println("right：" + right);
            return (left + 37) * (right + 17);
        }));
    }

    @Test
    public void atomicReferenceFieldUpdater() {
        Student student = new Student(1L, "wangdefa", 10);
        AtomicReferenceFieldUpdater<Student, String> updater = AtomicReferenceFieldUpdater.newUpdater(Student.class, String.class, "name");

        updater.get(student);
        System.out.println("name from student：" + student.getName());

        updater.compareAndSet(student, "wangdefa", "cxq");
        System.out.println("update name from student to cxq：" + student.getName());

        updater.lazySet(student, "WTF");
        System.out.println("newName：" + student.getName());

        updater.getAndSet(student, "OMG");
        System.out.println("newName：" + student.getName());

        updater.getAndAccumulate(student, "LALALA", new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                return (s + s2);
            }
        });
        System.out.println("newName：" + student.getName());

        updater.set(student, "aaa");
        System.out.println("newName：" + student.getName());

        updater.weakCompareAndSet(student, "bbb", "ccc");
        System.out.println("newName：" + student.getName());
    }
}
