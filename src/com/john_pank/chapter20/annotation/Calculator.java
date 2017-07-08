package com.john_pank.chapter20.annotation;

/**
 * Created by JohnPank on 29.05.17
 */

public class Calculator {

    @SomeComment(comment = "Summa")
    public double sum(double a, double b){
        return a + b;
    }

    @SomeComment(comment = "Umnojenie")
    public double mul(double a, double b){
        return a * b;
    }

    @SomeComment(comment = "Delnie")
    public double div(double a, double b){
        return a / b;
    }

    @SomeComment(comment = "Vichitanie")
    public double raz(double a, double b){
        return a - b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.div(5, 2));
        System.out.println(c.sum(5, 2));
        System.out.println(c.mul(5, 2));
        System.out.println(c.raz(5, 2));
    }
}
