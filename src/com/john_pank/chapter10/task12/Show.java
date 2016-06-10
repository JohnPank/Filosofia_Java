package com.john_pank.chapter10.task12;

/**
 * Filosofia_Java
 * Created by John Pank on 04.06.2016.
 */
interface ShowString{
    void show();
}

public class Show{

    public ShowString getShow(){
        return new ShowString(){
            public void show(){System.out.println("Test");}
        };
    }

    public static void main(String[] args){
        Show s = new Show();
        ShowString ss = s.getShow();
        ss.show();
    }
}

