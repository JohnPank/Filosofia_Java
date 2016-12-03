package com.john_pank.chapter11.task1;

import java.util.ArrayList;

/**
 * Filosofia_Java
 * Created by John Pank on 18.06.2016.
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

public class WorkWithGerbil {
    public static void main(String[] args) {
        ArrayList<Gerbil> gbr = new ArrayList<>();
        gbr.add(new Gerbil(1));
        gbr.add(new Gerbil(2));
        gbr.add(new Gerbil(3));
        gbr.add(new Gerbil(4));
        gbr.add(new Gerbil(5));

        gbr.get(0).hop();
        gbr.get(1).hop();
        gbr.get(2).hop();
        gbr.get(3).hop();
        gbr.get(4).hop();
    }
}
