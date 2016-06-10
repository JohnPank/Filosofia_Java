package com.john_pank.chapter10.task11;

/**
 * Filosofia_Java
 * Created by John Pank on 04.06.2016.
 */
interface ShowString{
    void show();
}

public class Show{

    private class ShString implements ShowString{
        public void show(){System.out.println("Test");}
    }

    public ShowString getShow(){
        return new ShString();
    }
    public static void main(String[] args){
        Show s = new Show();
        ShowString ss = s.getShow();
        ss.show();
        //FFE
        //ShString sst = ss;

    }
}
