package com.cxq.linkedlist;

import org.junit.Before;
import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class JosephRing {

    private static class JosephRingTest<E>{

        private Node<E> head;

        private static class Node<E> {
            private E data;
            private Node<E> next;

            private Node(E data) {
                this.data = data;
            }

        }

        private JosephRingTest(E headData) {
            this.head = new Node<>(headData);
            this.head.next = this.head;
        }

        private JosephRingTest<E> add(E data) {
            Node<E> newNode = new JosephRingTest.Node<>(data);
            Node<E> headNode = this.head;
            Node<E> neckNode = headNode.next;
            headNode.next = newNode;
            newNode.next = neckNode;
            return this;
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("cycle-linked-list: ");
            Node<E> current = head;
            do {
                result.append("[");
                result.append(current.data);
                result.append("-> ");
                result.append(current.next == null ? "null" : current.next.data);
                result.append("] ");
                current = current.next;
            } while (current != head);
            return result.toString();
        }
    }

    private JosephRingTest<String> linkList;

    @Before
    public void before() {
        linkList = new JosephRingTest<>("1");
    }

    @Test
    public void add() {
        System.out.println(linkList);
        String str = "";
        for (int i = 1; i <= 10; i++) {
            str = str + i;
            System.out.println(linkList.add(str));
        }
    }

}
