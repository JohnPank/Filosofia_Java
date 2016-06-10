package com.john_pank.chapter4.task18;

/**
 * Filosofia_Java
 * Created by John Pank on 04.02.2016.
 */
public class SimpleNumber {
    public static void main(String[] args) {
        int n=100;
        int div = 0;

        for (int i = 2; i<n; i++)
        {
            div = 0;
            for (int j = 2; j<=i; j++)
            {
                if (i%j==0)
                {
                    div++;
                }
            }
            if (div==1)
            {
                System.out.println(i);
            }
        }
    }
}
