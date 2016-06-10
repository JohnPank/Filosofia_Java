package com.john_pank.chapter9.task17;

/**
 * Filosofia_Java
 * Created by John Pank on 09.05.2016.
 */

interface Const{
    double PI = 3.14, G = 9.8, HRN = 40.54;
    }

public class StaticInterface implements Const {
    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(G);
        System.out.println(HRN);
        //FFE
        //HRN = 121.36;
    }
}
