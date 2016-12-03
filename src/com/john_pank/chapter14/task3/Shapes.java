package com.john_pank.chapter14.task3;

import java.util.Arrays;
import java.util.List;

/**
 * Filosofia_Java
 * Created by John Pank on 31.10.2016.
 */

abstract class Shape{
    boolean inFocus;
    void draw(){
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle extends Shape{

    @Override
    public String toString() { return inFocus + "Circle"; }
}

class Square extends Shape{

    @Override
    public String toString() {
        return inFocus + "Square";
    }
}

class Triangle extends Shape{

    @Override
    public String toString() {
        return inFocus + "Triangle";
    }
}

class Rhomboid extends Shape{

    @Override
    public String toString() {
        return inFocus + "Rhomboid";
    }
}

public class Shapes {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        //task 6
        Shapes shapes = new Shapes();
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for(Shape shape : shapeList){
            if (shape instanceof Triangle)
                shape.inFocus = true;
            else
                shape.inFocus = false;
        }

        System.out.println(shapeList);
    }

    private boolean canRotate(Shape shape){
        if(shape instanceof Circle)
            return false;
        else
            return true;
    }
}


// insert in main
/*
task 3
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (Shape shape : shapeList)
        shape.draw();
*/

/*
task 4
        Rhomboid rhomboid = new Rhomboid();
        rhomboid.draw();
        Shape shape = rhomboid;
        shape.draw();

        if(shape instanceof Rhomboid) {
            System.out.println("to rhomboid");
            Rhomboid rhomboid1 = (Rhomboid) shape;
            rhomboid1.draw();
        }

        if(shape instanceof Circle) {
            System.out.println("to circle");
            Circle circle = (Circle) shape;
            circle.draw();
        }
*/

/*
task 5
        Shapes shapes = new Shapes();
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (Shape shape : shapeList)
            if (shapes.canRotate(shape)){
                shape.draw();
                System.out.println("Can rotate");
            }
        else {
                shape.draw();
                System.out.println("Can't rotate");
            }
*/

/*
task 6
        Shapes shapes = new Shapes();
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for(Shape shape : shapeList){
            if (shape instanceof Triangle)
                shape.inFocus = true;
            else
                shape.inFocus = false;
        }

        System.out.println(shapeList);

 */