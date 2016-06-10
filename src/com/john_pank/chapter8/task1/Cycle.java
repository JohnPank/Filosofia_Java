package com.john_pank.chapter8.task1;

/**
 * Filosofia_Java
 * Created by John Pank on 23.02.2016.
 */
class Cycle {

    public void ride(){System.out.println(wheels());}
    public int wheels(){return 0;}
}

class Unicycle extends Cycle
{
    public void ride(){System.out.println(wheels());}
    public int wheels(){return 1;}
}

class Bicycle extends Cycle
{
    public void ride(){System.out.println(wheels());}
    public int wheels(){return 2;}
}

class Tricycle extends Cycle
{
    public void ride(){System.out.println(wheels());}
    public int wheels(){return 3;}
}


