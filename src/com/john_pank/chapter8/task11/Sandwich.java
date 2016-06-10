package com.john_pank.chapter8.task11;

/**
 * Filosofia_Java
 * Created by John Pank on 24.03.2016.
 */

interface FastFood{
    void eat();
    void puk();
    void fat();
}

class Meal{
    Meal(){ System.out.println("Meal()"); }
}

class Bread {
    Bread() { System.out.println("Bread()"); }
}

class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}

class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}

class Pickle {
    Pickle() { System.out.println("Pickle()"); }
}

class Lunch extends Meal{
    Lunch(){ System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch{
    PortableLunch(){ System.out.println("PortableLunch()"); }
}

public class Sandwich extends PortableLunch implements FastFood{
    private Bread  b = new Bread();
    private Cheese  c = new Cheese();
    private Lettuce l  = new Lettuce();
    private Pickle p = new Pickle();

    public Sandwich(){
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        Sandwich cw = new Sandwich();
        cw.eat();
        cw.puk();
        cw.fat();

    }

    @Override
    public void eat() {
        System.out.println("Om-om-om");
    }

    @Override
    public void puk() {
        System.out.println("PUK-PUK!");
    }

    @Override
    public void fat() {
        System.out.println("150kg!!!");
    }
}
