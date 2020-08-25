package com.cxq.nio;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * @author CXQ
 * @version 1.0
 */
public class BufferTest {

    /**
     * 创建一个非阻塞缓冲区
     */
    @Test
    public void build() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        //判断是否位直接缓冲区
        System.out.println(byteBuffer.isDirect() ? "direct..." : "heap...");
    }

    @Test
    public void coreAttributes() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.position(0).limit(22);
        System.out.println(byteBuffer.capacity());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.position());
    }

    @Test
    public void bufferApi() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put("hello".getBytes());
        byteBuffer.put("world".getBytes(), 0, 5);
        System.out.println("data: " + new String(byteBuffer.array()));

        /*limit = position;
        position = 0;
        mark = -1;*/
        byteBuffer.flip();
        System.out.print("flip：");
        System.out.print((char) byteBuffer.get(3) + "\0");
        System.out.print((char) byteBuffer.get() + "\0");
        System.out.println((char) byteBuffer.get());

        byteBuffer.rewind();
        System.out.print("rewind: ");
        System.out.print((char) byteBuffer.get() + "\0");
        System.out.println((char) byteBuffer.get());

        byteBuffer.clear();
        System.out.print("clear: ");
        System.out.print((char) byteBuffer.get() + "\0");
        System.out.println((char) byteBuffer.get());

        System.out.print("remaining: ");
        if (byteBuffer.hasRemaining()) {
            System.out.println(byteBuffer.remaining() + "(缓冲区中未读取的个数)");
        }
    }
}
