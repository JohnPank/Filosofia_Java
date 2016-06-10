package com.john_pank.chapter9.task2;

/**
 * Filosofia_Java
 * Created by John Pank on 24.03.2016.
 */
abstract class AbstractClass {
    public void method1()
    {
        System.out.println("Method1");
    }
    public void method2()
    {
        System.out.println("Method2");
    }
}


public class WorcWithAbstract {
    public static void main(String[] args) {
        AbstractClass ac = new AbstractClass()
        {
            @Override
            public void method1()
            {
                super.method1();
            }
        };
    }
}