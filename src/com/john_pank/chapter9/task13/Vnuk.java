package com.john_pank.chapter9.task13;

/**
 * Filosofia_Java
 * Created by John Pank on 27.03.2016.
 */
interface Parent {
    void par();
}

interface Son extends Parent {
    void son();
}

interface Doter extends Parent {
    void doter();
}

public class Vnuk implements Son, Doter {
    public void son(){
        System.out.println("Son");
    }
    public void doter(){
        System.out.println("Doter");
    }
    public void par(){
        System.out.println("par");
    }

    public static void main(String[] args) {
        Vnuk v = new Vnuk();
        v.doter();
        v.par();
        v.son();
    }

}
