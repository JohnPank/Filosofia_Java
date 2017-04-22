package com.john_pank.chapter16.task21;

import java.util.Arrays;
import java.util.Collections;

/**
 * Filosofia_Java
 * Created by John Pank on 07.01.2017.
 */

class BerylliymSphere implements Comparable<BerylliymSphere>{
    private static long counter;
    private final long id = counter++;
    public String toString() {return "Sphere" + id;}

    @Override
    public int compareTo(BerylliymSphere o) {
        if (this.id < o.id)
            return 1;
        if (this.id > o.id)
            return -1;
        return 0;
    }
}

public class CompareBerylliymSphere {
    public static void main(String[] args) {
        BerylliymSphere[] a1 = new BerylliymSphere[]{new BerylliymSphere(), new BerylliymSphere(), new BerylliymSphere(), new BerylliymSphere(), new BerylliymSphere(),};
        System.out.println(Arrays.toString(a1));
        Arrays.sort(a1);
        System.out.println("after sort");
        System.out.println(Arrays.toString(a1));
        Arrays.sort(a1, Collections.reverseOrder());
        System.out.println("after revers sort");
        System.out.println(Arrays.toString(a1));
    }
}
