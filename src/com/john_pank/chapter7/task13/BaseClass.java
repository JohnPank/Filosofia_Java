package com.john_pank.chapter7.task13;

/**
 * Filosofia_Java
 * Created by John Pank on 22.02.2016.
 */
public class BaseClass {

    protected void forFriend(){
        System.out.println("Protected method");
    }

    public void method(int i){
        System.out.println("int" + i);
    }

    public void method(float i){
        System.out.println("float" + i);
    }

    public void method(String i){
        System.out.println("String" + i);
    }
}
