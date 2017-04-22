package com.john_pank.chapter16.task22;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Filosofia_Java
 * Created by John Pank on 07.01.2017.
 */
public class IntegerArrayExperiment {

    public Integer[] randArrayCreate(int sz){
        Integer[] ints = new Integer[sz];
        Random rnd = new Random();
        for(int i = 0; i<sz; i++)
            ints[i] = rnd.nextInt(100);
        return ints;
    }

    public static void main(String[] args) {
        IntegerArrayExperiment iae = new IntegerArrayExperiment();

        Integer[] intArray = iae.randArrayCreate(10);
        System.out.println(Arrays.toString(intArray));
        //22
        //System.out.println(Arrays.binarySearch(intArray, 7));

        //23
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(intArray));
    }
}
