package com.john_pank.chapter10.task10;

/**
 * Filosofia_Java
 * Created by John Pank on 04.06.2016.
 */

interface ShowString{
    void show();
}

public class Show{
    public static ShowString getShow(boolean b){
        if (b){
            class ShString implements ShowString{
                public void show(){System.out.println("Test");}
            }

            return new ShString();
        }
        return null;
    }

    public static void main(String[] args){
        ShowString ss = getShow(true);
        ss.show();
    }
}

