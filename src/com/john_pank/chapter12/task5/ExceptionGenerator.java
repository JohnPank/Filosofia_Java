package com.john_pank.chapter12.task5;

/**
 * Filosofia_Java
 * Created by John Pank on 24.07.2016.
 */
class JohnException extends Exception{
    int message;
    JohnException(int msg){
        message = msg;
    }
    public int wtf(){
        return message;
    }
}

public class ExceptionGenerator{
    public static void main(String[] args){
        int i = 0;
        int counter = 0;
        while(counter<10){
            try{
                i++;
                throw new JohnException(i);
            }

            catch(JohnException e){
                if(i == 10)
                    counter = 10;
            }
        }

        System.out.println("i=10 " + i);

    }
}

