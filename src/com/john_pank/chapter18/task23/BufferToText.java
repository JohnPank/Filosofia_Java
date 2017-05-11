package com.john_pank.chapter18.task23;


import sun.awt.CharsetString;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * Filosofia_Java
 * Created by John Pank on 03.05.17.
 */
public class BufferToText {
    public static void main(String[] args) throws IOException {
        //save file
        FileChannel fc = new FileOutputStream("Data2.txt").getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(50);
        buffer = ByteBuffer.wrap("по русски Some text".getBytes("UTF-8"));
        fc.write(buffer);
        fc.close();

        //read file
        fc = new FileInputStream("Data2.txt").getChannel();
        buffer.clear();
        fc.read(buffer);
        buffer.flip();
        System.out.println(buffer.asCharBuffer());  //ne katit!!!

        buffer.rewind();
        String encoding = System.getProperty("file.encoding");
        System.out.println(encoding + "--" + Charset.forName(encoding).decode(buffer));
    }
}
