package com.john_pank.chapter12.task4;

/**
 * Filosofia_Java
 * Created by John Pank on 24.07.2016.
 */
class JohnException extends Exception{
    String message;
    JohnException(String msg){
        message = msg;
    }
    public String wtf(){
        return message;
    }
}

public class ExceptionGenerator{
    public static void main(String[] args){
        try{
            System.out.println("Create Exception");
            throw new JohnException("Facking error!!!");
        }

        catch(JohnException e){
            //e.printStackTrace(System.out);
            System.out.println(e.wtf());
        }

    }
}

