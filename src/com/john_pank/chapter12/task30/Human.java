package com.john_pank.chapter12.task30;

/**
 * Filosofia_Java
 * Created by John Pank on 05.08.2016.
 */
class Annoyance extends Exception{}
class Sneeze extends Annoyance{}

public class Human{
    public static void main(String[] args){
        try{
            try{
                throw new Sneeze();
            }
            catch(Sneeze e){
                throw new RuntimeException(e);
            }
        }
        catch(Exception e){
            System.out.println(e.getCause());
        }

    }
}
