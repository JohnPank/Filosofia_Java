package com.john_pank.chapter3.task10;

/**
 * Filosofia_Java
 * Created by John Pank on 03.02.2016.
 */
public class BinaryDigit {
    public static void main(String[] args) {
        int const1 = 0b10101010101010101010101010101010;
        int const2 = 0b01010101010101010101010101010101;

        System.out.println(Integer.toBinaryString(const1));
        System.out.println(Integer.toBinaryString(const2));
        System.out.println();
        System.out.println(Integer.toBinaryString(const1&const2));
        System.out.println(Integer.toBinaryString(const1|const2));
        System.out.println(Integer.toBinaryString(const1^const2));
    }
}
