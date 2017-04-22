package com.john_pank.chapter16.task19;

import java.util.Arrays;

/**
 * Filosofia_Java
 * Created by John Pank on 07.01.2017.
 */

class IntContainer{
    public int a;

    IntContainer(int arg){
        a = arg;
    }

    public String toString(){
        return "IC " + a;
    }
}

public class ArrayEqulas {

    public boolean equals(IntContainer[] arr1, IntContainer[] arr2){
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++)
            if(arr1[i].a != arr2[i].a)
                return false;

        return true;
    }

    public static void main(String[] args) {
        ArrayEqulas ae = new ArrayEqulas();
        IntContainer[] ic1 = new IntContainer[]{new IntContainer(4), new IntContainer(7), new IntContainer(9), new IntContainer(2), new IntContainer(5),};
        IntContainer[] ic2 = new IntContainer[]{new IntContainer(4), new IntContainer(7), new IntContainer(9), new IntContainer(2), new IntContainer(5),};

        System.out.println(Arrays.toString(ic1));
        System.out.println(Arrays.toString(ic2));

        System.out.println(Arrays.equals(ic1, ic2));
        System.out.println(ae.equals(ic1, ic2));

    }
}
