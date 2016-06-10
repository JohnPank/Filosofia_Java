package com.john_pank.chapter7.task9;
import com.john_pank.chapter7.task13.*;
/**
 * Filosofia_Java
 * Created by John Pank on 21.02.2016.
 */
public class Stem extends Root{

    Stem(int i)
    {
        super(i);
        System.out.println("Stem created!");
    }

    public void dispose(){
        super.dispose();
        System.out.println("Stem disposed");
    }

    public static void main(String[] args) {
        BaseClass bc = new BaseClass();
        //bc.forFriend();  //FFE
        ExtendClass ec = new ExtendClass();
        //ec.forFriend();  //FFE

        Stem stm = new Stem(5);
        try
        {
            //code
        }
        finally
        {
            stm.dispose();
        }



    }
}
