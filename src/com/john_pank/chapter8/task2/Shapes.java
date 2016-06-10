package com.john_pank.chapter8.task2;

import java.util.Random;

/**
 * Filosofia_Java
 * Created by John Pank on 23.02.2016.
 */
class Shape
{
    public void draw(){}
    public void erase(){}
    public void showName(){ System.out.println("Shape"); }
}

class Circle extends Shape
{
    @Override
    public void draw(){ System.out.println("Circle.draw()"); }
    @Override
    public void erase(){ System.out.println("Circle.erase()"); }
    @Override
    public void showName(){ System.out.println("Circle"); }
}

class Square extends Shape
{
    @Override
    public void draw(){ System.out.println("Square.draw()"); }
    @Override
    public void erase(){ System.out.println("Square.erase()"); }
    @Override
    public void showName(){ System.out.println("Square"); }
}

class Triangle extends Shape
{
    @Override
    public void draw(){ System.out.println("Triangle.draw()"); }
    @Override
    public void erase(){ System.out.println("Triangle.erase()"); }
    @Override
    public void showName(){ System.out.println("Triangle"); }
}

class Glykalo extends Shape
{
    @Override
    public void draw(){ System.out.println("Glykalo.draw()"); }
    @Override
    public void erase(){ System.out.println("Glykalo.erase()"); }
    @Override
    public void showName(){ System.out.println("Glykalo"); }
}

class RandomShapeGenerator
{
    private Random rnd = new Random();
    public Shape next()
    {
        switch (rnd.nextInt(4))
        {
            default:
            case 0:return new Circle();
            case 1:return new Square();
            case 2:return new Triangle();
            case 3:return new Glykalo();

        }
    }
}


public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[5];

        for (int i = 0; i<s.length; i++)
            s[i] = gen.next();

        for (Shape shp : s)
            shp.draw();

        System.out.println();

        for (Shape shp : s)
            shp.showName();
    }
}
