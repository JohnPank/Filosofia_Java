package com.john_pank.chapter3.task7;

import java.util.Date;
import java.util.Random;

/**
 * Filosofia_Java
 * Created by John Pank on 02.02.2016.
 */
public class Coin {
    public static void main(String[] args) {
        Random rnd = new Random();
        for (int i = 0;i<10;i++)
        {
            if(rnd.nextBoolean())
                System.out.println("Avers");
            else
                System.out.println("Revers");
        }

    }
}
