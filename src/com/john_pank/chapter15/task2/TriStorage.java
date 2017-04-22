package com.john_pank.chapter15.task2;

/**
 * Filosofia_Java
 * Created by John Pank on 26.12.2016.
 */
class SomeTrash{}

public class TriStorage<T>{
    private T one;
    private T two;
    private T three;

    TriStorage(){
        one = null;
        two = null;
        three = null;
    }

    TriStorage(T a, T b, T c){
        one = a;
        two = b;
        three = c;
    }

    public void setOne(T a){
        one = a;
    }

    public void setTwo(T a){
        two = a;
    }

    public void setThree(T a){
        three = a;
    }

    public T getOne() { return one; }
    public T getTwo() { return two; }
    public T getThree() { return three; }

    public String toString(){
        return "a: " + one + " b: " + two + " c: "+ three;
    }

    public static void main(String[] args){
        TriStorage<SomeTrash> ts = new TriStorage<SomeTrash>();
        ts.setOne(new SomeTrash());
        ts.setTwo(new SomeTrash());
        ts.setThree(new SomeTrash());

        System.out.println(ts);
    }
}

