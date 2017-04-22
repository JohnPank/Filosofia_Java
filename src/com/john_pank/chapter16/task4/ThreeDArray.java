package com.john_pank.chapter16.task4;

import java.util.Arrays;
import java.util.Random;

/**
 * Filosofia_Java
 * Created by John Pank on 07.01.2017.
 */
public class ThreeDArray {

    public double[][][] createThreeDArray(int i, int j, int z, int min, int max){
        double[][][] da = new double[i][j][z];
        Random rnd = new Random();
        double delta= max-min;
        for (int ii = 0; ii<i; ii++){
            for (int ij = 0; ij<j; ij++){
                for (int iz = 0; iz<z; iz++){
                    da[ii][ij][iz] = min + delta*rnd.nextDouble();
                }
            }
        }
        return da;
    }

    public void showThreeDArray(double[][][] tdarray){
        System.out.println(Arrays.deepToString(tdarray));
        System.out.println(tdarray.length);
    }

    public static void main(String[] args) {
        ThreeDArray tda = new ThreeDArray();
        tda.showThreeDArray(tda.createThreeDArray(3, 4, 5, 10, 20));
    }
}
