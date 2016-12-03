package com.john_pank.chapter12.task2;

/**
 * Filosofia_Java
 * Created by John Pank on 24.07.2016.
 */
import java.util.Random;

public class ExceptionGenerator{
    public static void main(String[] args){

        Random rnd = new Random();
        //rnd = null;
        //System.out.println(rnd.nextInt());
        try{
            System.out.println(rnd.nextInt());
        }

        catch(Exception e){
            //e.printStackTrace(System.out);
            System.out.println("Error");
        }

    }
}
