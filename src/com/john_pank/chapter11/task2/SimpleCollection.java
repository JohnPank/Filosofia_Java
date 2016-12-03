package com.john_pank.chapter11.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Filosofia_Java
 * Created by John Pank on 18.06.2016.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<>();
        for (int i = 0; i < 10; i++){
            c.add(i);
        }

        for (Integer i : c)
        {
            System.out.print(i + ", ");
        }
    }
}
