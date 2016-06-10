package com.john_pank.chapter5.task8;

/**
 * Filosofia_Java
 * Created by John Pank on 12.02.2016.
 */
public class Thiser {
    public void metod1()
    {
        System.out.println("Metod1");
    }

    public void metod2()
    {
        metod1();
        this.metod1();
        System.out.println("Metod2");

    }

    public static void main(String[] args) {
       Thiser thiser = new Thiser();
        thiser.metod2();

    }

}
