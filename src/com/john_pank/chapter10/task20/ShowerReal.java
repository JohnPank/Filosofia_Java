package com.john_pank.chapter10.task20;

/**
 * Filosofia_Java
 * Created by John Pank on 04.06.2016.
 */
interface Shower{
    void show();
    class ShowClass{
        void test(){
            System.out.println("Test class");
        }
    }
}

public class ShowerReal implements Shower {

    public void show(){System.out.println("realization");}

    public static void main(String[] args){
        ShowerReal sr = new ShowerReal();
        ShowerReal.ShowClass sc = new ShowClass();
        sr.show();
        sc.test();
    }
}

