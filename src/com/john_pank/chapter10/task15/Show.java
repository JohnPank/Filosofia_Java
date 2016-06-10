package com.john_pank.chapter10.task15;

/**
 * Filosofia_Java
 * Created by John Pank on 04.06.2016.
 */
abstract class ShowString{
    public String pstr;
    public ShowString(String str){
        pstr = str;
        System.out.println("in base");
    }
    public abstract void show();
}

public class Show{
    public ShowString getShowString(String str){
        return new ShowString(str){
            {System.out.println("in anonim");}
            public void show(){
                System.out.println(pstr);
            }
        };
    }
    public static void main(String[] args){
        Show s = new Show();
        ShowString ss = s.getShowString("Test");
        ss.show();
    }
}
