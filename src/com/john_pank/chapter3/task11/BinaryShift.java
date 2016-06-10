package com.john_pank.chapter3.task11;

/**
 * Filosofia_Java
 * Created by John Pank on 03.02.2016.
 */
public class BinaryShift {
    public static void main(String[] args) {
        int const1 = 0x1;
        for(int i = 0;i<32;i++)
        {
            const1<<=1;
            System.out.println(Integer.toBinaryString(const1));
        }


    }
}
