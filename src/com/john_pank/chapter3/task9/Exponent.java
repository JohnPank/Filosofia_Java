package com.john_pank.chapter3.task9;

/**
 * Filosofia_Java
 * Created by John Pank on 02.02.2016.
 */
public class Exponent {
    public static void main(String[] args) {
        float expFloatMin = 3.14f;
        double expDoubleMin = 0b1111111111111111111111111111111;
        Float expFloatMax = 10e-20f;
        double expDoubleMax = 10e20d;
        System.out.println(Float.floatToRawIntBits(expFloatMin));
        System.out.println(expDoubleMin);
    }
}
