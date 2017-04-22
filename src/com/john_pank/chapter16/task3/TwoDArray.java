package com.john_pank.chapter16.task3;

import java.util.Arrays;
import java.util.Random;

/**
 * Filosofia_Java
 * Created by John Pank on 07.01.2017.
 */
public class TwoDArray {

    public double[][] createTwoDArray(int i, int j, int min, int max){
        double[][] da = new double[i][j];
        Random rnd = new Random();
        double delta= max-min;
        for (int ii = 0; ii<i; ii++){
            for (int ij = 0; ij<j; ij++){
                da[ii][ij] = min + delta*rnd.nextDouble();
            }
        }
        return da;
    }

    public void showTwoDArray(double[][] tdarray){
        System.out.println(Arrays.deepToString(tdarray));
        System.out.println(tdarray.length);
    }

    public static void main(String[] args) {
        TwoDArray tda = new TwoDArray();
        tda.showTwoDArray(tda.createTwoDArray(4, 5, 10, 20));
        tda.showTwoDArray(tda.createTwoDArray(5, 3, 100, 200));
        tda.showTwoDArray(tda.createTwoDArray(2, 2, 1, 10));
        tda.showTwoDArray(tda.createTwoDArray(10, 10, 1, 100));
    }
}
