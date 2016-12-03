package com.john_pank.chapter13.task6;

import java.util.Formatter;

/**
 * Filosofia_Java
 * Created by John Pank on 17.08.2016.
 */
public class FormatedClass {
    private int i;
    private long l;
    private float f;
    private double d;

    public FormatedClass(int i, long l, float f, double d){
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
    }

    public String toString(){
        String res = String.format("%-10d %10d %10f %10f\n", i, l, this.f, d);
        return res;
    }

    public static void main(String[] args) {
        FormatedClass fc1 = new FormatedClass(5,1000000,0.5484f,168.87);

        System.out.println(fc1);
    }

}
