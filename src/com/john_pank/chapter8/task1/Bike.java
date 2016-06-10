package com.john_pank.chapter8.task1;

import java.util.Random;

public class Bike
{
    public static void main(String[] args) {
        Random rnd = new Random();
        Cycle c [] = new Cycle[5];
        for (int i = 0;i<5;i++)
        {
            c[i] = getBike(rnd.nextInt(3));
            c[i].ride();
        }
    }

    public static Cycle getBike(int i)
    {
        switch (i)
        {
            case 0: return new Unicycle();
            case 1:return new Bicycle();
            case 2:return new Tricycle();
            default:return null;
        }
    }
}
