package com.john_pank.chapter9.task3;

/**
 * Filosofia_Java
 * Created by John Pank on 24.03.2016.
 */

abstract class BaseCount{
    public BaseCount(){
        this.print();
    }
    abstract void print();
}

class RealCounter extends BaseCount{
    private int i = 5;


    @Override
    void print() {
        System.out.println("vol = " + i);
    }
}

public class ShowCounter {
    public static void main(String[] args) {
        RealCounter rc = new RealCounter();
        rc.print();
    }
}
