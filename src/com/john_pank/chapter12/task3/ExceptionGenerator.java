package com.john_pank.chapter12.task3;

/**
 * Filosofia_Java
 * Created by John Pank on 24.07.2016.
 */
public class ExceptionGenerator{
    public static void main(String[] args){
        int[] array = new int[10];
        try{
            System.out.println("Create Exception");
            for (int i = 0; i < 11; i++)
                array[i] = i;
        }

        catch(Exception e){
            //e.printStackTrace(System.out);
            System.out.println("DohuiTishc");
        }

    }
}

