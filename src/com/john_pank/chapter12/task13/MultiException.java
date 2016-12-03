package com.john_pank.chapter12.task13;

/**
 * Filosofia_Java
 * Created by John Pank on 05.08.2016.
 */
class Je extends Exception{}

class JohnException1 extends Je{
    String message;
    JohnException1(){
        message = "JohnException1";
    }
    public String getMessage(){
        return message;
    }
}

class JohnException2 extends Je{
    String message;
    JohnException2(){
        message = "JohnException2";
    }
    public String getMessage(){
        return message;
    }
}

class JohnException3 extends Je{
    String message;
    JohnException3(){
        message = "JohnException3";
    }
    public String getMessage(){
        return message;
    }
}

public class MultiException{

    public void exGen()throws Je{
        System.out.println("Create Exception");

        //uncoment!!!
        //throw new JohnException1();
        throw new JohnException2();
        //throw new JohnException3();
        //throw new NullPointerException();
    }

    public static void main(String[] args){
        MultiException me = new MultiException();
        try{
            me.exGen();
        }

        catch(Je e){
            System.out.println(e.getMessage());
        }

        finally{
            System.out.println("Finally");
        }

    }
}
