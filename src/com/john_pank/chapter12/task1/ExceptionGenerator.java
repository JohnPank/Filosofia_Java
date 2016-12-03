package com.john_pank.chapter12.task1;

/**
 * Filosofia_Java
 * Created by John Pank on 24.07.2016.
 */
public class ExceptionGenerator{
    public static void main(String[] args){
        try{
            throw new Exception("Error!!!");
        }
        catch(Exception e){
            e.printStackTrace(System.out);
            System.out.println("Catch");
        }

        finally{
            System.out.println("Finally");
        }

    }
}
