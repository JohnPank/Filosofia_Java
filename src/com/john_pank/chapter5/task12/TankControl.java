package com.john_pank.chapter5.task12;

public class TankControl
{
    public static void main(String[] args) {
        Tank tank = new Tank(30);
        tank.showLevel();
        tank.addWater(20);
        tank.showLevel();
        //tank.dumpWater();
        tank.showLevel();
        tank=null;
        System.gc();
    }

}
