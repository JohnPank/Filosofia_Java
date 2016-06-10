package com.john_pank.chapter5.task5;

/**
 * Filosofia_Java
 * Created by John Pank on 11.02.2016.
 */
public class Dog {

    public void bark(int i, String str)
    {
        System.out.println("Gav-gav");
    }

    public void bark(String s, int i)
    {
        System.out.println("Uuuuuu");
    }

    public static void main(String[] args) {
        Dog um = new Dog();

        um.bark("w",5);
        um.bark(5,"w");
    }
}
