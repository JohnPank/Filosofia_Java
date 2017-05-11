package com.john_pank.chapter18.task15;

import java.io.*;

/**
 * Filosofia_Java
 * Created by John Pank on 03.05.17.
 */
public class StoringAndRecoveringData {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Data.txt")));
        out.writeByte(100);
        out.writeBoolean(true);
        out.writeChar(33);
        out.writeDouble(10.2);
        out.writeLong(1000000);
        out.writeUTF("test");
        out.writeShort(123);
        out.close();

        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("Data.txt")));
        System.out.println(in.readByte());
        System.out.println(in.readBoolean());
        System.out.println((char) in.readChar());
        System.out.println(in.readDouble());
        System.out.println(in.readLong());
        System.out.println(in.readUTF());
        System.out.println(in.readShort());
    }
}
