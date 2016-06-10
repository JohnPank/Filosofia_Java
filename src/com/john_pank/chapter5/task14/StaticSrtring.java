package com.john_pank.chapter5.task14;

/**
 * Filosofia_Java
 * Created by John Pank on 13.02.2016.
 */
public class StaticSrtring {

    int i1 = 3;
    int i2;
    {
        i2 = 4;
    }

    static String str1 = "strrrr1";
    static String str2;
    static
    {
        str2 = "strrrrrr2";
    }

    public static void main(String[] args) {
        StaticSrtring stst = new StaticSrtring();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(stst.i1);
        System.out.println(stst.i2);

    }
}
