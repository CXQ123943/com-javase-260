package com.cxq.linkedlist;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class SingleLinkedListTest {

    private static class SingleLinkedListDemo<E> {

        //设计一个head(链表头)，一个tail（链表尾），一个size（链表长度）
        private Node<E> head;
        private Node<E> tail;

        //构造方法 链表的创建
        private SingleLinkedListDemo(E headData) {
            this.head = new Node<>(headData);
            this.tail = head;
        }

        //创建了一个节点类
        private static class Node<E> {
            //设计节点的两个属性：data（数据域），next（后继指针域）。
            E data;
            Node<E> next;

            Node(E data) {
                this.data = data;
            }

            //重写了节点类的toString（）方法（下面重写了没必要）
            /*@Override
            public String toString() {
                return "[" + data + "-> " + (next == null ? "null" : next.data) + "]";
            }*/
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            //创建一个数据域的副本
            Node<E> current = head;
            //遍历所有的节点，要是数据域为null，跳出循环
            while (current != null) {
                stringBuilder.append("[");
                stringBuilder.append(current.data);
                stringBuilder.append("-> ");
                stringBuilder.append(current.next == null ? "null" : current.next.data);
                stringBuilder.append("] ");
                current = current.next;
            }
            return stringBuilder.toString();
        }

        private void addHead(E data) {
            //创建了一个新的节点，并重新设计新节点的data和next
            Node<E> newNode = new Node<>(data);
            newNode.next = this.head;
            //新的节点头就是newHead  重新定义head属性
            this.head = newNode;
        }
    }


    private SingleLinkedListDemo<String> linkList = new SingleLinkedListDemo<>("a");

    @Test
    public void addHead() {
        System.out.println(linkList);
        linkList.addHead("b");
        System.out.println(linkList);
        linkList.addHead("c");
        System.out.println(linkList);
    }
}
