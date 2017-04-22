package com.john_pank.chapter16.task18;

import java.util.Arrays;

/**
 * Filosofia_Java
 * Created by John Pank on 07.01.2017.
 */

class BerylliymSphere{
    private static long counter;
    private final long id = counter++;
    public String toString() {return "Sphere" + id;}
}


public class CopyArray {
    public static void main(String[] args) {
        BerylliymSphere[] a1 = new BerylliymSphere[]{new BerylliymSphere(), new BerylliymSphere(), new BerylliymSphere(), new BerylliymSphere(), new BerylliymSphere(),};
        BerylliymSphere[] a2 = new BerylliymSphere[5];

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        System.arraycopy(a1, 0, a2, 0, 5);

        System.out.println("after copy");
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        a1[1] = new BerylliymSphere();

        System.out.println("after change");
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));


    }
}
