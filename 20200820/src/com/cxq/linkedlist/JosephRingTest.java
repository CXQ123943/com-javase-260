package com.cxq.linkedlist;

import com.sun.glass.ui.Size;
import org.junit.Before;
import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class JosephRingTest {
    private static class JosephRingDemo<E> {

        private static class Node<E> {
            private E data;
            private Node<E> next;

            private Node(E data) {
                this.data = data;
            }

        }

        private Node<E> head;

        private JosephRingDemo(E headData) {
            this.head = new Node<>(headData);
            this.head.next = this.head;
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            Node<E> current = head;
            do {
                result.append("[");
                result.append(current.data);
                result.append("] ");
                current = current.next;
            } while (current != head);
            return result.toString();
        }

        private void add(E data) {
            Node<E> currentNode = this.head;
            while (currentNode.next != this.head) {
                currentNode = currentNode.next;
            }
            Node<E> newNode = new Node<>(data);
            currentNode.next = newNode;
            newNode.next = this.head;
        }

        private void kill(){
            while (this.head.next != this.head) {
                Node<E> currentNode = this.head;
                Node<E> left = currentNode.next;
                Node<E> right = currentNode.next.next.next;
                left.next = right;
                this.head = right;
                System.out.println(toString());
            }
        }
    }

    private JosephRingDemo<String> linkList;

    @Before
    public void before() {
        linkList = new JosephRingDemo<>("1");
    }

    @Test
    public void sha() {
        for (int i = 2; i < 11; i++) {
            linkList.add("" + i);
        }
        System.out.println(linkList);
        linkList.kill();
    }
}