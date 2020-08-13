package com.cxq.test;

import java.lang.ref.SoftReference;
import java.util.concurrent.TimeUnit;

/**
 * @author CXQ
 * @version 1.0
 */
public class SoftReferenceTest {
    public static void main(String[] args) throws InterruptedException {
        // -Xms20M -Xmx20M 修改内存最大和最小都为20M
        //当只有内存不够大的时候，软引用才会被回收，内存足够的时候是不会呗回收的
        System.gc();
        TimeUnit.SECONDS.sleep(1L);
        SoftReference<byte[]> softReference = new SoftReference<>(new byte[1024 * 1024 * 10]);
        System.out.println(softReference.get() == null ? "gc" : "exists");
        System.gc();
        TimeUnit.SECONDS.sleep(1L);
        System.out.println(softReference.get() == null ? "gc" : "exists");
        byte[] bsB = new byte[1024 * 1024 * 11];
        System.out.println(softReference.get() == null ? "gc" : "exists");
        System.out.println(bsB);
    }
}
