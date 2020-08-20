package com.cxq.linkedlist;

import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import javax.xml.crypto.Data;

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

            @Override
            public String toString() {
                return "["
                        + (pre == null ? "null" : pre.data)
                        + "<- " + data + "->"
                        + (next == null ? "null" : next.data)
                        + "]";
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

        private DoubleLinkedListDemo resetHead(E data) {
            Node<E> newNode = new Node<>(data);
            this.head.pre = newNode;
            newNode.next = this.head;
            this.head = newNode;
            return this;
        }

        //在末尾添加节点
        private DoubleLinkedListDemo add(E data) {
            Node<E> newNode = new Node<>(data);
            Node<E> currentNode = this.head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.pre = currentNode;
            return this;
        }

        // 向指定位置添加节点
        private DoubleLinkedListDemo add(E data, int pos) {
            if (pos == 0) {
                this.resetHead(data);
                return this;
            }else if (pos < 0) {
                add(data);
                return this;
            }

            Node<E> newNode = new Node<>(data);
            Node<E> currentNode = this.head;
            Node<E> preNode = this.head;
            for (int i = 0; i < pos; i++) {
                if (currentNode.next == null) {
                    add(data);
                    return this;
                }
                preNode = currentNode;
                currentNode = currentNode.next;
            }
            preNode.next = newNode;
            newNode.pre = preNode;
            currentNode.pre = newNode;
            newNode.next = currentNode;
            return this;
        }

        private Node get(E data) {
            Node<E> result = null;
            Node<E> currentNode = this.head;
            while (currentNode != null) {
                if (data.equals(currentNode.data)) {
                    result = currentNode;
                    break;
                } else {
                    currentNode = currentNode.next;
                }
            }
            return result;
        }

        private DoubleLinkedListDemo<E> delete(E data) {
            Node currentNode = this.head;
            while (currentNode != null) {
                if (data.equals(currentNode.data)) {
                    currentNode.pre.next = currentNode.next;
                    currentNode.next.pre = currentNode.pre;
                    break;
                }else {
                    currentNode = currentNode.next;
                }
            }
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
        System.out.println(linkList.resetHead("2222"));
        System.out.println(linkList.resetHead("3333"));
        System.out.println(linkList.resetHead("4444"));
    }

    @Test
    public void add() {
        System.out.println(linkList.add("2222"));
        System.out.println(linkList.add("3333"));
        System.out.println(linkList.add("4444"));
    }

    @Test
    public void addWithPos() {
        System.out.println(linkList);
        System.out.println(linkList.add("2222", 0));
        System.out.println(linkList.add("3333", 9));
        System.out.println(linkList.add("4444", 1));
        System.out.println(linkList.add("5555", 3));
    }

    @Test
    public void get() {
        System.out.println(linkList);
        System.out.println(linkList.add("2222"));
        System.out.println(linkList.add("3333"));
        System.out.println("node: " + linkList.get("2222"));
        System.out.println("node: " + linkList.get("3333"));
        System.out.println("node: " + linkList.get("4444"));
    }

    @Test
    public void delete() {
        System.out.println(linkList);
        System.out.println(linkList.add("2222"));
        System.out.println(linkList.add("3333"));
        System.out.println(linkList.add("4444"));
        System.out.println(linkList.delete("2222"));
        System.out.println(linkList.delete("3333"));
    }
}