package com.john_pank.chapter15.task1;

/**
 * Filosofia_Java
 * Created by John Pank on 26.12.2016.
 */
class Base{}

class Deliver extends Base{}

public class Holder3<T>{
    private T a;
    public Holder3(T a){ this.a = a; }
    public void set(T a){ this.a = a; }
    public T get(){ return a; }
    public static void main(String[] args){
        Holder3<Base> hb = new Holder3<Base>(new Base());
        System.out.println(hb.get());
        Deliver d = new Deliver();
        hb.set(d);
        System.out.println(hb.get());
    }
}
