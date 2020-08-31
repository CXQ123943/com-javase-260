package com.cxq.sync;

import lombok.SneakyThrows;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author CXQ
 * @version 1.0
 */
public class TicketSellTest {

    private static class Ticket implements Runnable {

        private int ticketNo;

        @SneakyThrows
        @Override
        public void run() {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(300L);
                sellTicket();
            }
        }

        private void sellTicket() {
            int maxNo = 100;
            synchronized (this) {
                if (ticketNo < maxNo) {
                    ticketNo ++;
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "卖票: " + ticketNo);
                }
            }
        }
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket, "threadA").start();
        new Thread(ticket, "threadB").start();
    }
}
