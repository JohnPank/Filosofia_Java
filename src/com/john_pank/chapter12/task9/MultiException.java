package com.john_pank.chapter12.task9;

/**
 * Filosofia_Java
 * Created by John Pank on 05.08.2016.
 */
class JohnException1 extends Exception{
    String message;
    JohnException1(){
        message = "JohnException1";
    }
    public String getMessage(){
        return message;
    }
}

class JohnException2 extends Exception{
    String message;
    JohnException2(){
        message = "JohnException2";
    }
    public String getMessage(){
        return message;
    }
}

class JohnException3 extends Exception{
    String message;
    JohnException3(){
        message = "JohnException3";
    }
    public String getMessage(){
        return message;
    }
}

public class MultiException{

    public void exGen()throws Exception{
        System.out.println("Create Exception");

        //uncoment!!!
        throw new JohnException1();
        //throw new JohnException2();
        //throw new JohnException3();
    }

    public static void main(String[] args){
        MultiException me = new MultiException();
        try{
            me.exGen();
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
