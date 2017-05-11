package com.john_pank.chapter18.task16;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Filosofia_Java
 * Created by John Pank on 03.05.17.
 */
public class UsingRandomAccessFile {
    static String file = "rtest.dat";

    public static void main(String[] args) throws IOException {
        //create file
        RandomAccessFile rf = new RandomAccessFile(file, "rw");
        rf.writeUTF("Start");
        rf.writeByte(10);
        rf.writeByte(20);
        rf.writeByte(30);
        rf.writeDouble(30.5);
        rf.writeUTF("End");
        rf.close();

        //read file
        RandomAccessFile rfo = new RandomAccessFile(file, "rw");
        System.out.println(rfo.readUTF());
        System.out.println(rfo.readByte());
        System.out.println(rfo.readByte());
        System.out.println(rfo.readByte());
        System.out.println(rfo.readDouble());
        System.out.println(rfo.readUTF());
        rfo.seek(9);
        System.out.println(rfo.readByte());
        rfo.close();


    }
}
