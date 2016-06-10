package com.john_pank.chapter4.task23;

import java.util.List;

/**
 * Filosofia_Java
 * Created by John Pank on 07.02.2016.
 */
public class Fibonacci {
    public static void main(String[] args)
        {
            fibonacci(10);
        }

    public static void fibonacci(int max)
        {
            int prev = 0;
            int sec = 1;
            int temp = sec;
            while (sec<max)
            {
                temp = sec;
                sec = sec + prev;
                prev = temp;
                System.out.println(sec);

            }
        }
    }

