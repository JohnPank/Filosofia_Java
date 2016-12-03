package com.john_pank.chapter13.task9;

/**
 * Filosofia_Java
 * Created by John Pank on 19.08.2016.
 */
public class Replaser {
    public static void main(String[] args) {
        String knights =
                "Then, when you have found the shrubbery, you must " +
                        "cut down the mightiest tree in the forest... " +
                        "with... a herring!";
        System.out.println(knights.replaceAll("[eEyYuUiIoOaA]","_"));
    }
}
