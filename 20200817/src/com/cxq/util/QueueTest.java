package com.cxq.util;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author CXQ
 * @version 1.0
 */
public class QueueTest {

    @Test
    public void api() {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue.add(1) ? "add success" : "add fail");
        System.out.println(queue.add(2) ? "add success" : "add fail");
        System.out.println(queue.offer(3) ? "offer success" : "offer fail");
        System.out.println(queue.offer(4) ? "offer success" : "offer fail");
        System.out.println("element: " + queue.element());
        System.out.println("peek: " + queue.peek());
        while (!queue.isEmpty()) {
            System.out.println("poll: " + queue.poll());
            // System.out.println("remove: " + queue.remove());
        }
    }
}
