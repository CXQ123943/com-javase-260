package com.cxq.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author CXQ
 * @version 1.0
 */
public class BlockSocketServerByPositioning {
    public static void main(String[] args) throws IOException {
        int port = 9996;
        //开启一个ServerSocketChannel通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //创建一个socket地址链接：使用“new InetSocketAddress()”来构造
        InetSocketAddress inetSocketAddress = new InetSocketAddress(port);
        //ServerSocketChannel通道绑定一个socket地址
        serverSocketChannel.bind(inetSocketAddress);

//        System.out.println("ready to accept data...");
        //服务端通道等待接收数据
        SocketChannel accept = serverSocketChannel.accept();
        //创建一个缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        //接收的数据读到缓冲区里
        while (accept.read(byteBuffer) != -1) {
            //指针pos复位（归0）
            byteBuffer.flip();
            byteBuffer.position(4);
            byteBuffer.mark();
            for (int i = 0, j = 2; i < j; i++) {
                while (byteBuffer.position() < 6) {
                    System.out.print((char) byteBuffer.get());
                }
                //pos limit复位，为下一个数据的读和获取做准备
                byteBuffer.reset();
            }
            System.out.println();
            System.out.println();
        }
        accept.close();
        serverSocketChannel.close();
    }
}
