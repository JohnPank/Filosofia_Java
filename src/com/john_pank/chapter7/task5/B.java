package com.john_pank.chapter7.task5;

/**
 * Filosofia_Java
 * Created by John Pank on 20.02.2016.
 */
class B extends A{
    public B()
    {
        System.out.println("WOW!!!! Object B created!!!");
    }

    public B(int b)
    {
        super(b);
        System.out.println("WOW!!!! Object B created!!!" + b);

    }
}
