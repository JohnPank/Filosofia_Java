package com.john_pank.chapter2.task8;

/**
 * Filosofia_Java
 * Created by John Pank on 29.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        StaticStorage ss1 = new StaticStorage();
        StaticStorage ss2 = new StaticStorage();
        ss1.i = 10;
        System.out.println(ss2.i);
    }
}
