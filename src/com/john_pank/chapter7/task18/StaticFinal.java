package com.john_pank.chapter7.task18;

/**
 * Filosofia_Java
 * Created by John Pank on 22.02.2016.
 */
public class StaticFinal {
    final static int fs = 3;
    final int f;

    public StaticFinal(int i)
    {
        f = i;
    }

    public static void main(String[] args) {
        StaticFinal sf = new StaticFinal(6);
        System.out.println(sf.f);
        System.out.println(sf.fs);

        //sf.f = 8;  FFE
        StaticFinal sf2 = new StaticFinal(7);
        System.out.println(sf2.f);
        System.out.println(sf2.fs);
    }

}
