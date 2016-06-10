package com.john_pank.chapter7.task13;

/**
 * Filosofia_Java
 * Created by John Pank on 22.02.2016.
 */
public class ExtendClass extends BaseClass {
    public void method(double i){
        System.out.println("double" + i);
    }

    public static void main(String[] args) {
        ExtendClass ec = new ExtendClass();
        ec.method(5);
        ec.method(5.0f);
        ec.method(5.3d);
        ec.method("5");
        ec.forFriend();
    }
}
