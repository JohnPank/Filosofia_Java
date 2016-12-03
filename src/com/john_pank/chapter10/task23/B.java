package com.john_pank.chapter10.task23;

/**
 * Filosofia_Java
 * Created by John Pank on 13.06.2016.
 */

interface U{
    public void method1();
    public void method2();
    public void method3();
}

class A{
    public U makeU(){
        return new U() {
            @Override
            public void method1() {
                System.out.println("U.method1");
            }

            @Override
            public void method2() {
                System.out.println("U.method2");
            }

            @Override
            public void method3() {
                System.out.println("U.method3");
            }
        };
    }
}

public class B {
    private int index = 0;
    private U[] uArr = new U[4];
    public void addUtoArray(U u){
        if(index < 3) {
            uArr[index] = u;
            index++;
            System.out.println("add to array");
        }
        else
        {
            System.out.println("Array overfull!!!");
        }
    }
    public void deleteU(int i){
        if(i >= 0 && i <=9)
            uArr[i] = null;
        else
            System.out.println("Index Error!!!");
    }
    public void showUArr(){

        for (int i = 0; i<uArr.length; i++) {
            uArr[i].method1();
            uArr[i].method2();
            uArr[i].method3();
        }
    }

    public static void main(String[] args) {
        A a1  = new A();
        A a2  = new A();
        A a3  = new A();

        B b = new B();

        b.addUtoArray(a1.makeU());
        b.addUtoArray(a2.makeU());
        b.addUtoArray(a3.makeU());

        b.showUArr();
    }
}


