package com.john_pank.chapter5.task10;

/**
 * Filosofia_Java
 * Created by John Pank on 12.02.2016.
 */
class Finish {
    Finish() {
        System.out.println("!!!NEW OBJECT CREATED!!!");
    }

    public void finalize() {
        System.out.println(":-( Object destroed :-(");
    }
}

class FinTest
{
    public static void main(String[] args) {
        Finish fin = new Finish();
        //fin = null;
        fin.finalize();
        System.gc();
    }
}
