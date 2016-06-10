package com.john_pank.chapter2.task6;

/**
 * Filosofia_Java
 * Created by John Pank on 29.01.2016.
 */
public class Storage {

    public static void main(String[] args)
    {
        String str = "John_pank";
        System.out.println(storage(str));
    }

    public static int storage(String s)
    {
        return s.length()*2;
    }
}
