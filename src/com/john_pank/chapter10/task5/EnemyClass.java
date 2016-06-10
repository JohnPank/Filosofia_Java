package com.john_pank.chapter10.task5;

/**
 * Filosofia_Java
 * Created by John Pank on 30.05.2016.
 */

class Outer{

    class Inner{
        private String ist;
        public Inner(String str){
            ist = str;
        }
        public void iShow(){
            System.out.println(ist);
        }
    }
}

public class EnemyClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner  i = o.new Inner("John");
        i.iShow();
    }
}
