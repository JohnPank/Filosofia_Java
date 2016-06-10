package com.john_pank.chapter10.task6.pack2;

import com.john_pank.chapter10.task6.pack1.DiabloPersone;

/**
 * Filosofia_Java
 * Created by John Pank on 30.05.2016.
 */
public class Diablo {
    protected class Barbarian implements DiabloPersone{
        public void attack(){
            System.out.println("Берегитесь демоны и нечистые твари!!!");
        }
    }
    public DiabloPersone getBarbarian(){return new Barbarian();}
}
