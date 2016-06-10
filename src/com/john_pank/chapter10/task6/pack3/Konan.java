package com.john_pank.chapter10.task6.pack3;
import com.john_pank.chapter10.task6.pack1.DiabloPersone;
import com.john_pank.chapter10.task6.pack2.Diablo;
/**
 * Filosofia_Java
 * Created by John Pank on 30.05.2016.
 */
public class Konan extends Diablo {

    public static void main(String[] args) {
        Konan konan = new Konan();
        DiabloPersone persone = konan.getBarbarian();
        persone.attack();
    }
}
