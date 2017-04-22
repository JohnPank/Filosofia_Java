package com.john_pank.chapter16.task1;

/**
 * Filosofia_Java
 * Created by John Pank on 07.01.2017.
 */

class BerylliymSphere{
    private static long counter;
    private final long id = counter++;
    public String toString() {return "Sphere" + id;}
}

public class DynamicArrayMethod {

    public BerylliymSphere[] createArray(int sz){
        BerylliymSphere[] bsa = new BerylliymSphere[sz];
        for (int i = 0; i<sz; i++) {
            bsa[i] = new BerylliymSphere();
        }
        return bsa;
    }

    public void showArray(BerylliymSphere[] berylliymSpheres){
        for (int i = 0; i<berylliymSpheres.length; i++){
            System.out.println(berylliymSpheres[i]);
        }
    }

    public static void main(String[] args) {
        DynamicArrayMethod dam = new DynamicArrayMethod();
        dam.showArray(new BerylliymSphere[]{new BerylliymSphere(), new BerylliymSphere(), new BerylliymSphere(),});

        System.out.println("***************");
        //2
        dam.showArray(dam.createArray(5));
    }
}
