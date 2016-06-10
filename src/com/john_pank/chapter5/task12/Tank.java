package com.john_pank.chapter5.task12;

/**
 * Filosofia_Java
 * Created by John Pank on 12.02.2016.
 */
public class Tank {

    int levelPersent;

    public Tank()
    {
        levelPersent = 0;
    }

    public Tank(int i)
    {
        if (i>100)
            levelPersent = 100;

        if (i<0)
            levelPersent = 0;

        levelPersent = i;
    }

    public void dumpWater()
    {
        levelPersent = 0;
    }

    public void addWater(int w)
    {
        levelPersent += w;
        if (levelPersent>100)
            levelPersent = 100;

        if (levelPersent<0)
            levelPersent = 0;
    }

    public void showLevel()
    {
        System.out.println("Level:" + levelPersent + "%");
    }

    public void finalize()
    {
        if (levelPersent > 0)
            System.out.println("!ERROR! Tank is not empty");
        else
            System.out.println("Vse rovno");
    }


}

