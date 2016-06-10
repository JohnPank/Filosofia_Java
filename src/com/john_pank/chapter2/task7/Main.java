package com.john_pank.chapter2.task7;

/**
 * Filosofia_Java
 * Created by John Pank on 29.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        StaticTest.i++;
        System.out.println(st1.i);
        System.out.println(st2.i);

        increment();

        System.out.println(st1.i);
        System.out.println(st2.i);

    }

    static void increment()
    {
        StaticTest.i++;
    }
}
