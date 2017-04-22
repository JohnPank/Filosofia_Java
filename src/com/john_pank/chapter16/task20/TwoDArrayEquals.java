package com.john_pank.chapter16.task20;

import java.util.Arrays;

/**
 * Filosofia_Java
 * Created by John Pank on 07.01.2017.
 */
public class TwoDArrayEquals {
    public static void main(String[] args) {
        int[][] a1 = new int[][]{{1, 2, 3,},{4, 5, 6,}};
        int[][] a2 = new int[][]{{1, 2, 3,},{4, 5, 6,}};

        System.out.println(Arrays.deepEquals(a1, a2));
    }
}
