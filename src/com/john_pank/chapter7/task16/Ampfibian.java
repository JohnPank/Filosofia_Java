package com.john_pank.chapter7.task16;

/**
 * Filosofia_Java
 * Created by John Pank on 22.02.2016.
 */
public class Ampfibian {

    protected int oxigenLewel;

    public Ampfibian()
    {
        oxigenLewel = 50;
    }

    public void waterBreath(int i)
    {
        oxigenLewel = oxigenLewel + i;
        System.out.println("Ampfibian");

    }

    public void airBreath(int i)
    {
        oxigenLewel = oxigenLewel + i;
        System.out.println("Ampfibian");
    }

    public void showOxigenLewel()
    {
        System.out.println(oxigenLewel);
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        Ampfibian ampfibian = (Ampfibian) frog;
        ampfibian.showOxigenLewel();
        ampfibian.airBreath(1);
        ampfibian.showOxigenLewel();
        ampfibian.waterBreath(1);
        ampfibian.showOxigenLewel();


    }

}

class Frog extends Ampfibian
{
    public void waterBreath(int i)
    {
        oxigenLewel = oxigenLewel + i;
        System.out.println("Frog");

    }


}
