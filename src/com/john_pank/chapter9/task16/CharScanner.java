package com.john_pank.chapter9.task16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * Filosofia_Java
 * Created by John Pank on 09.05.2016.
 */

class CharSerGen implements Readable{
    private int lenght;
    char[] charArray = null;
    char[] data = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890".toCharArray();
    Random rnd = new Random(new Date().getTime());

    public CharSerGen(int len)
    {
        lenght = len;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {

        if(lenght-- == 0)
            return -1;

        for(int i = 0; i<6; i++)
        {
            cb.append(data[rnd.nextInt(data.length)]);
        }

        cb.append(" ");

        return 6;
    }
}

public class CharScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new CharSerGen(10));

        while(sc.hasNext())
        {
            System.out.println(sc.next());
        }

    }
}
