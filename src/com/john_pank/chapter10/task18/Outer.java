package com.john_pank.chapter10.task18;

/**
 * Filosofia_Java
 * Created by John Pank on 04.06.2016.
 */
public class Outer{
    public static class Inner{
        public void showText(){
            System.out.println("Text");
        }
    }

    public static void main(String[] args){
        Inner i = new Inner();
        i.showText();
    }
}

