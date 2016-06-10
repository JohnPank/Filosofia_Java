package com.john_pank.chapter3.task3;

/**
 * Filosofia_Java
 * Created by John Pank on 01.02.2016.
 */
class Storage
{
    float fl;
}

public class Aliasing2 {

    public static void main(String[] args) {
        Storage st1 = new Storage();

        st1.fl = 3.14f;

        System.out.println(st1.fl);

        met(st1);

        System.out.println(st1.fl);
    }

    static void met(Storage s)
    {
        s.fl = 4.5f;
    }
}
