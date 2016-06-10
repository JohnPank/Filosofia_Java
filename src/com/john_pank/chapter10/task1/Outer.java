package com.john_pank.chapter10.task1;

/**
 * Filosofia_Java
 * Created by John Pank on 23.05.2016.
 */
public class Outer {
    private  String str;
    Outer(String st){
        str = st;
    }

    Inner getInner(){return new Inner();}

    class Inner{
        public void showMes(){
            System.out.println("inner");
        }

        @Override
        public String toString(){
            return str;
        }

    }

    public static void main(String[] args) {
        Outer o = new Outer("john");
        Inner in = o.getInner();
        System.out.println(in.toString());
    }
}
