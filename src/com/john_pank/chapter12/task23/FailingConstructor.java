package com.john_pank.chapter12.task23;

/**
 * Filosofia_Java
 * Created by John Pank on 05.08.2016.
 */
class LajaException extends Exception{
    public String toString(){
        return "LajaException";
    }
}

class Disposer{
    Disposer() throws LajaException{
        System.out.println("In Disposed constructor");
        //throw new LajaException();
    }
    void dispose(){
        System.out.println("Disposed");
    }
}

public class FailingConstructor{

    Disposer disp;

    FailingConstructor() throws LajaException {
        try{
            disp = new Disposer();
            System.out.println("Disposed construct");
            try{
                throw new LajaException();
            }
            catch(Exception e){
                System.out.println("Disposed err");
            }
            finally{
                disp.dispose();
            }
        }
        catch(Exception e){
            System.out.println("Construction error!");
        }
    }

    public static void main(String[] args){
        try{
            FailingConstructor fc = new FailingConstructor();
        }
        catch(Exception e){

        }
    }
}
