package com.john_pank.chapter9.task19;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Timer;

/**
 * Filosofia_Java
 * Created by John Pank on 19.05.2016.
 */

interface Dicerable{
    void dice();
}

interface DiceFactory{
    Dicerable getDice();
}

class Coin implements Dicerable{
    @Override
    public void dice() {
        Random rnd = new Random();
        boolean coinPict = rnd.nextBoolean();
        if(coinPict)
            System.out.println("Бросаем монетку.... Выпал орёл");
        else
            System.out.println("Бросаем монетку.... Выпала решка");
    }
}

class Bone implements Dicerable{
    @Override
    public void dice() {
        Random rnd = new Random();
        int bonePoint = rnd.nextInt(6)+1;

        System.out.println("Бросаем кость.... Выпало: " + bonePoint);
    }
}

class BoneFactory implements DiceFactory{
    @Override
    public Dicerable getDice() {
        return new Bone();
    }
}

class CoinFactory implements DiceFactory{
    @Override
    public Dicerable getDice() {
        return new Coin();
    }
}

public class Dicer {
    public static void diced(DiceFactory df){
        df.getDice().dice();
    }

    public static void main(String[] args) {
        for (int i = 0; i<10; i++)
            diced(new BoneFactory());

        for (int i = 0; i<10; i++)
            diced(new CoinFactory());
    }
}
