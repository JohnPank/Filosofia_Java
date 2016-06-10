package com.john_pank.chapter3.task6;

import com.john_pank.chapter3.task5.Dog;

/**
 * Filosofia_Java
 * Created by John Pank on 01.02.2016.
 */
public class Dog2 {
    String name;
    String says;

    public static void main(String[] args) {
        Dog2 spot = new Dog2();
        Dog2 scruffy = new Dog2();

        spot.name = "Spot";
        spot.says = "Gav";

        scruffy.name = "Scruffy";
        scruffy.says = "Rrrrrr";

        System.out.println(spot.name + " say " + spot.says);
        System.out.println(scruffy.name + " say " + scruffy.says);

        Dog2 dog;

        dog = spot;
        System.out.println(dog == spot);
        System.out.println(dog.equals(spot));
    }
}

