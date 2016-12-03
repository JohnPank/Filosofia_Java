package com.john_pank.chapter12.task18;

/**
 * Filosofia_Java
 * Created by John Pank on 05.08.2016.
 */
class ImportantException extends Exception{
    public String toString(){
        return "ImportantException";
    }
}

class HoHumException extends Exception{
    public String toString(){
        return "HoHumException";
    }
}

class LajaException extends Exception{
    public String toString(){
        return "LajaException";
    }
}

public class LostMessage{

    void f() throws ImportantException{
        throw new ImportantException();
    }

    void dispose() throws HoHumException{
        throw new HoHumException();
    }

    void l() throws LajaException{
        throw new LajaException();
    }

    public static void main(String[] args){
        try{
            LostMessage lm = new LostMessage();
            try{
                lm.f();
            }
            finally{
                try{
                    lm.dispose();
                }

                finally{
                    lm.l();
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
