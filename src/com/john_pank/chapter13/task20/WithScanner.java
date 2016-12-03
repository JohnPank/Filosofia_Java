package com.john_pank.chapter13.task20;

import java.util.Scanner;

/**
 * Filosofia_Java
 * Created by John Pank on 15.10.2016.
 */
public class WithScanner {
    int i;
    long l;
    float f;
    double d;
    String s;

    WithScanner(String srs){
        Scanner scan = new Scanner(srs);
        i = scan.nextInt();
        l = scan.nextLong();
        //f = scan.nextFloat();
        //d = scan.nextDouble();
        s = scan.nextLine();
    }

    @Override
    public String toString(){
        return "int=" + i + "\nlong=" + l + "\nfloat=" + f + "\ndouble=" + d + "\nString=" + s;
    }


    public static void main(String[] args) {
        WithScanner ws = new WithScanner("5 46565465 Numbers");
        System.out.println(ws);
    }
}
