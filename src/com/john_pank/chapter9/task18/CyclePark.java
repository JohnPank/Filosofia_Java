package com.john_pank.chapter9.task18;

/**
 * Filosofia_Java
 * Created by John Pank on 19.05.2016.
 */

interface Cycle{ void drive();}

interface CycleFactory{ Cycle getCycle();}

class Unicycle implements Cycle{
    public void drive()
    {
        System.out.println("Unicycle");
    }
}

class BiCycle implements Cycle{

    @Override
    public void drive() {
        System.out.println("BiCycle");
    }
}

class TriCycle implements Cycle{

    @Override
    public void drive() {
        System.out.println("TriCycle");
    }
}


class UnicycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new BiCycle();
    }
}

class TricycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new TriCycle();
    }
}

public class CyclePark {
    public static Cycle cycleCreator(CycleFactory factory){
        return factory.getCycle();
    }

    public static void main(String[] args) {
        Cycle cycle = cycleCreator(new BicycleFactory());
        cycle.drive();
        cycle = cycleCreator(new UnicycleFactory());
        cycle.drive();
    }
}
