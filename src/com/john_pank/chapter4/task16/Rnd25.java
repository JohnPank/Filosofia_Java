package com.john_pank.chapter4.task16;

import java.util.Random;

/**
 * Filosofia_Java
 * Created by John Pank on 04.02.2016.
 */
public class Rnd25 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int prew = rnd.nextInt(100);
        for (int i = 0; i<25; i++)
        {
            int next = rnd.nextInt(100);
            if (next > prew)
                System.out.println(next + " больше " + prew);
            if (next < prew)
                System.out.println(next + " меньше " + prew);
            if (next == prew)
                System.out.println(next + " равно " + prew);

            prew = next;
        }
    }
}
