package com.john_pank.chapter5.task19;

/**
 * Filosofia_Java
 * Created by John Pank on 13.02.2016.
 */
public class StringArgs {
    public static void printArray(String...args)
    {
        for(String arg : args)
            System.out.println(arg);
    }

    public static void main(String[] args) {
        printArray("qw","we","er","rt","ty");

        String[] sa = {"zx","zx","xc","cv","vb"};

        printArray(sa);
    }
}
