package com.cxq.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @author CXQ
 * @version 1.0
 */
public class NonBlockSocketServer {
    public static void main(String[] args) throws IOException {
        int port = 9997;
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open().bind(new InetSocketAddress(port));
        serverSocketChannel.configureBlocking(false);
        System.out.println("ready to accept data...");
        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        SocketChannel socketChannel = null;
        while (selector.select() > 0) {
            Iterator<SelectionKey> it = selector.selectedKeys().iterator();
            while (it.hasNext()) {
                SelectionKey selectionKey = it.next();
                if (selectionKey.isAcceptable()) {
                    socketChannel = serverSocketChannel.accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector, SelectionKey.OP_READ);
                } else if (selectionKey.isReadable()) {
                    socketChannel = (SocketChannel) selectionKey.channel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    while (socketChannel.read(byteBuffer) > 0) {
                        byteBuffer.flip();
                        for (int i = 0, j = byteBuffer.limit(); i < j; i++) {
                            System.out.print((char) byteBuffer.get());
                        }
                        System.out.println();
                        byteBuffer.clear();
                    }
                }
                it.remove();
            }
        }
        if (socketChannel != null) {
            socketChannel.close();
        }
        serverSocketChannel.close();
    }
}
