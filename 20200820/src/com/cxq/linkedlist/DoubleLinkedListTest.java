package com.cxq.linkedlist;

import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author CXQ
 * @version 1.0
 */
public class DoubleLinkedListTest {

    private class DoubleLinkedListDemo<E> {

        private  Node<E> head;

        DoubleLinkedListDemo(E headData) {
            this.head = new Node<>(headData);
        }

        private  class Node<E> {
            private E data;
            private Node<E> next;
            private Node<E> pre;

            Node(E data) {
                this.data = data;
            }
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            Node<E> current = head;
            while (current != null) {
                result.append("[");
                result.append(current.pre == null ? "null" : current.pre.data);
                result.append(" <-");
                result.append(current.data);
                result.append("-> ");
                result.append(current.next == null ? "null" : current.next.data);
                result.append("] ");
                current = current.next;
            }
            return result.toString();
        }

        private DoubleLinkedListDemo addHead(E data) {
            Node<E> newNode = new Node<>(data);
            this.head.pre = newNode;
            newNode.next = this.head;
            this.head = newNode;
            return this;
        }
    }

    private DoubleLinkedListDemo<String> linkList;

    @Before
    public void before() {
        linkList = new DoubleLinkedListDemo<>("1111");
    }

    @Test
    public void addHead() {
        System.out.println(linkList);
        System.out.println(linkList.addHead("2222"));
        System.out.println(linkList.addHead("3333"));
        System.out.println(linkList.addHead("4444"));
    }
}
