package com.john_pank.chapter11.task17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Filosofia_Java
 * Created by John Pank on 29.06.2016.
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

public class GerbilMap {
    public static void main(String[] args) {
        Map<String,Gerbil> gerbilMap = new HashMap<>();
        gerbilMap.put("miki",new Gerbil(1));
        gerbilMap.put("mini",new Gerbil(2));
        gerbilMap.put("nyh",new Gerbil(3));
        gerbilMap.put("stepan",new Gerbil(4));

        Iterator<String> gerbilIterator = gerbilMap.keySet().iterator();
        while (gerbilIterator.hasNext()){
            gerbilMap.get(gerbilIterator.next()).hop();
        }
    }
}
