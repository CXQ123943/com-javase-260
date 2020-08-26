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
public class BlockSocketServer {
    public static void main(String[] args) throws IOException {
        int port = 9999;
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(port);
        serverSocketChannel.bind(inetSocketAddress);
        System.out.println("ready to accept data...");
        SocketChannel accept = serverSocketChannel.accept();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        while (accept.read(byteBuffer) != -1) {
            byteBuffer.flip();
            for (int i = 0, j = byteBuffer.limit(); i < j; i++) {
                System.out.print((char) byteBuffer.get());
            }
            System.out.println();
            byteBuffer.clear();
        }
        accept.close();
        serverSocketChannel.close();
    }
}
