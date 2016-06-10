package com.john_pank.chapter3.task5;

/**
 * Filosofia_Java
 * Created by John Pank on 01.02.2016.
 */
public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();

        spot.name = "Spot";
        spot.says = "Gav";

        scruffy.name = "Scruffy";
        scruffy.says = "Rrrrrr";

        System.out.println(spot.name + " say " + spot.says);
        System.out.println(scruffy.name + " say " + scruffy.says);
    }
}
