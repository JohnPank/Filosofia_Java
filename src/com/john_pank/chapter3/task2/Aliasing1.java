package com.john_pank.chapter3.task2;

/**
 * Filosofia_Java
 * Created by John Pank on 01.02.2016.
 */
class Storage
{
    float fl;
}

public class Aliasing1 {

    public static void main(String[] args) {
        Storage st1 = new Storage();
        Storage st2 = new Storage();

        st1.fl = 3.14f;
        st2.fl = 9.8f;

        System.out.println(st1.fl + " " + st2.fl);

        st1 = st2;

        System.out.println(st1.fl + " " + st2.fl);
    }
}

