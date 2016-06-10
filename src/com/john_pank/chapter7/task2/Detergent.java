package com.john_pank.chapter7.task2;

/**
 * Filosofia_Java
 * Created by John Pank on 20.02.2016.
 */
public class Detergent {

    Cleanser cleanser = new Cleanser();
    public Detergent()
    {
        System.out.println("Detergent");
    }


    public void scrub() {
        cleanser.scrub();
    }
    public void apply() {
        cleanser.apply();
    }
    public void dilute() {
        cleanser.dilute();
    }



    public void foam()
    {
        cleanser.append("Detergent.foam()");
    }

    @Override
    public String toString() {
       return cleanser.toString();
    }

    public static void main(String[] args) {

        Detergent x = new Detergent();

        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Base class:");
        Cleanser.main(args);

    }

}
