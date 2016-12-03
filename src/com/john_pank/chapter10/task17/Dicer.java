package com.john_pank.chapter10.task17;

/**
 * Filosofia_Java
 * Created by John Pank on 11.06.2016.
 */
import java.util.Random;
interface Dicerable{
    void dice();
}

class DicerableFactory{
    public Dicerable makeDicerable(int type){
        Dicerable d = null;
        if(type == 1)
            return new Dicerable(){
                //coin*********************
                public void dice() {
                    Random rnd = new Random();
                    boolean coinPict = rnd.nextBoolean();
                    if(coinPict)
                        System.out.println("Orel");
                    else
                        System.out.println("Reshka");
                }
            };

        if(type == 2)
            return new Dicerable(){
                public void dice() {
                    Random rnd = new Random();
                    int bonePoint = rnd.nextInt(6)+1;

                    System.out.println(bonePoint);
                }
            };

        return d;
    }

}

public class Dicer {

    public static void main(String[] args) {
        Dicerable dic = new DicerableFactory().makeDicerable(1);
        for (int i = 0; i<10; i++)
            dic.dice();
        dic = new DicerableFactory().makeDicerable(2);
        for (int i = 0; i<10; i++)
            dic.dice();
    }
}
