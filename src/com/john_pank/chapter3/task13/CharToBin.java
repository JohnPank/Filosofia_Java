package com.john_pank.chapter3.task13;

/**
 * Filosofia_Java
 * Created by John Pank on 03.02.2016.
 */
public class CharToBin {
    public static void main(String[] args) {
        showBin('s');
        showBin('y');
        showBin('m');
        showBin(' ');
        showBin('e');

    }
    public static void showBin(char c)
    {
        System.out.println(Integer.toBinaryString(c));
    }
}
