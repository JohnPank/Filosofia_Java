package com.john_pank.chapter3.task4;

import java.util.Random;

/**
 * Filosofia_Java
 * Created by John Pank on 01.02.2016.
 */
public class Speed {


    public static void main(String[] args) {
        Random rnd = new Random();
        int time = rnd.nextInt(60);
        int dist = rnd.nextInt(100);
        float speed = (float)dist/(float)time;
        System.out.println(time + " " + dist + " " + speed);
    }

}
