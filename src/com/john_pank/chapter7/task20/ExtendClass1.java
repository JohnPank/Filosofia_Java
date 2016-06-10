package com.john_pank.chapter7.task20;

public class ExtendClass1 extends ClassWithFinalMethod
{
/*
    @Override
    private void method(String str)
    {
        System.out.println("Base");
        System.out.println(str);
    }
*/
    public static void main(String[] args) {
        ExtendClass1 ec= new ExtendClass1();
        ec.method("text");
    }
}
