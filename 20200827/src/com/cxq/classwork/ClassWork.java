package com.cxq.classwork;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * @author CXQ
 * @version 1.0
 */
public class ClassWork {

    @Test
    public void markAndReset() {
        String str = "encoder";
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put(str.getBytes());
        byteBuffer.flip();
        byteBuffer.position(2).mark();
        System.out.print((char) byteBuffer.get());
        System.out.print((char) byteBuffer.get());
        byteBuffer.reset();
        System.out.print((char) byteBuffer.get());
        System.out.print((char) byteBuffer.get());
    }
}
