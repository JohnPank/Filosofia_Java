package com.john_pank.chapter11.task8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Filosofia_Java
 * Created by John Pank on 20.06.2016.
 */
class Gerbil {
    private int gerbilNumber;
    Gerbil(int gn){
        gerbilNumber = gn;
    }
    public void hop(){
        System.out.println("mouse #" + gerbilNumber);
    }

}

public class GerbilIterator {
    public static void main(String[] args) {
        ArrayList<Gerbil> gbr = new ArrayList<>();

        gbr.add(new Gerbil(1));
        gbr.add(new Gerbil(2));
        gbr.add(new Gerbil(3));
        gbr.add(new Gerbil(4));
        gbr.add(new Gerbil(5));

        Iterator<Gerbil> itg = gbr.iterator();

       while (itg.hasNext())
       {
           Gerbil temp = itg.next();
           temp.hop();
       }
    }
}
