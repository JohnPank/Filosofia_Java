package com.john_pank.chapter3.task12;

/**
 * Filosofia_Java
 * Created by John Pank on 03.02.2016.
 */
public class BinaryShift2 {
    public static void main(String[] args) {
        int const1 = 0xffff;
        System.out.println(Integer.toBinaryString(const1));
        const1<<=1;
        System.out.println(Integer.toBinaryString(const1));

        for(int i = 0;i<16;i++)
        {
            const1>>=1;
            System.out.println(Integer.toBinaryString(const1));
        }


    }
}
