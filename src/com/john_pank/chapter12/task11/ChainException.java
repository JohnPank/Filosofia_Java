package com.john_pank.chapter12.task11;

/**
 * Filosofia_Java
 * Created by John Pank on 05.08.2016.
 */
class FirstException extends Exception{
    String message;
    FirstException(){
        message = "FirstException";
    }
    public String getMessage(){
        return message;
    }
}

class SecondException extends Exception{
    String message;
    SecondException(){
        message = "SecondException";
    }
    public String getMessage(){
        return message;
    }
}

public class ChainException{

    public void f() throws FirstException{
        throw new FirstException();
    }

    public void g(){
        try{
            f();
        }
        catch(FirstException fe){
            RuntimeException se = new RuntimeException();
            se.initCause(fe);
            throw se;
        }
    }

    public static void main(String[] args){
        ChainException ce = new ChainException();
        ce.g();
    }
}
