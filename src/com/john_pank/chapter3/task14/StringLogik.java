package com.john_pank.chapter3.task14;

/**
 * Filosofia_Java
 * Created by John Pank on 03.02.2016.
 */
public class StringLogik {
    public static void main(String[] args) {
        stringLogik("qqwer","asdf");
        stringLogik("asdf","asdf");
        stringLogik("john","pank");
        stringLogik("Mur","mur");
        stringLogik("hren","hren'");

    }

    public static void stringLogik(String str1, String str2) {
        System.out.println(str1 + " == " + str2 + " = " + (str1 == str2));
        System.out.println(str1 + " != " + str2 + " = " + (str1 != str2));
        System.out.println(str1 + " equlas() " + str2 + " = " + (str1.equals(str2)));
        System.out.println(str1 + " compareTo() " + str2 + " = " + (str1.compareTo(str2)));

    }
}
