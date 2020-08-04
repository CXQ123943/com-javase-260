package com.cxq.io;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author CXQ
 * @version 1.0
 */
public class RandomAccessFileTest {

    @Test
    public void wrideAndRead() throws IOException {
        String name = "D:\\idea2018\\idea\\ideacode\\io\\emp.txt";
        RandomAccessFile randomAccessFile = new RandomAccessFile(name,"rw");

        // 写
        randomAccessFile.writeUTF("赵四");
        randomAccessFile.writeInt(18);
        randomAccessFile.writeUTF("刘能");
        randomAccessFile.writeInt(28);
        randomAccessFile.writeUTF("广坤");
        randomAccessFile.writeInt(38);

        // 移动指针位置为0
        randomAccessFile.seek(24);

        // 读
        System.out.println(randomAccessFile.readUTF());
        System.out.println(randomAccessFile.readInt());

        //指针跳过指定的字节长度
        randomAccessFile.skipBytes(12);

        randomAccessFile.seek(0);
        System.out.println(randomAccessFile.readUTF());
        System.out.println(randomAccessFile.readInt());
        randomAccessFile.close();
    }
}
