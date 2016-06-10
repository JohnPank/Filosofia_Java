package com.john_pank.chapter8.task18;

/**
 * Filosofia_Java
 * Created by John Pank on 17.03.2016.
 */

class Cycle {

    public void ride(){System.out.println(wheels());}
    public int wheels(){return 0;}
}

class Unicycle extends Cycle
{
    public void ride(){System.out.println(wheels());}
    public int wheels(){return 1;}
    public void balance(){System.out.println("Балансируем!!!");}
}

class Bicycle extends Cycle
{
    public void ride(){System.out.println(wheels());}
    public int wheels(){return 2;}
    public void balance(){System.out.println("Балансируем!!!");}
}

class Tricycle extends Cycle
{
    public void ride(){System.out.println(wheels());}
    public int wheels(){return 3;}
}


public class BalanceOnCycle
{
    public static void main(String[] args)
    {
        Unicycle uni = new Unicycle();
        Bicycle bi = new Bicycle();
        Tricycle tri = new Tricycle();

        Cycle cycles[] = {uni,bi,tri};

        uni.balance();
        bi.balance();

        Unicycle unic = (Unicycle) cycles[0];
        Tricycle tric = (Tricycle) cycles[2];


    }
}
