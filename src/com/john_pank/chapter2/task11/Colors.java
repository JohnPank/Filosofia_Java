package com.john_pank.chapter2.task11;

/**
 * Filosofia_Java
 * Created by John Pank on 31.01.2016.
 */
public class Colors {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();
        rainbow.anIntegerRepresentingColors = 2;
        System.out.println(rainbow.anIntegerRepresentingColors);
        rainbow.changeTheHueOfTheColor(3);
        System.out.println(rainbow.anIntegerRepresentingColors);
    }

}
