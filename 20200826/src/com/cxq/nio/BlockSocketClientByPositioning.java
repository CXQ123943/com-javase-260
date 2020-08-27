package com.cxq.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @author CXQ
 * @version 1.0
 */
public class BlockSocketClientByPositioning {
    public static void main(String[] args) throws IOException {
        String ip = "127.0.0.1";
        int port = 9996;
        //创建一个socket地址连接
        SocketAddress socketAddress = new InetSocketAddress(ip, port);
        //打开的一个SocketChannel的通道并连接到指定Socket地址。
        SocketChannel socketChannel = SocketChannel.open(socketAddress);
        //创建一个缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        System.out.println("please input your message...");
        //向控制台插入一根读取的管子
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = bufferedReader.readLine()) != null) {
            //向缓冲区中写入需要客户端通道接收的数据
            byteBuffer.put(("> " + str).getBytes());
            byteBuffer.flip();
            //通道再从缓冲区写出数据
            socketChannel.write(byteBuffer);
            byteBuffer.clear();
            if ("exit".equalsIgnoreCase(str)) {
                break;
            }
        }
        bufferedReader.close();
        socketChannel.close();
    }
}
