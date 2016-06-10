package com.john_pank.chapter10.task19;

/**
 * Filosofia_Java
 * Created by John Pank on 04.06.2016.
 */
public class Outer{
    class Inner{
        class Ininner{
            public void showText(){
                System.out.println("Text");
            }
        }
    }

    public static void main(String[] args){
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        Outer.Inner.Ininner ii = i.new Ininner();
        ii.showText();
    }
}
