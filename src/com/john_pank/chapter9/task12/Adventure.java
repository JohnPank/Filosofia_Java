package com.john_pank.chapter9.task12;

/**
 * Filosofia_Java
 * Created by John Pank on 27.03.2016.
 */
interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}

interface CanClimb{
    void climb();
}

class ActionCharacter{
    public void fight(){};
}

class Hero extends ActionCharacter implements CanClimb, CanFight, CanFly, CanSwim {
    public void fly(){};
    public void swim(){};
    public void climb(){};
}

public class Adventure {
    public static void t(CanFight x){x.fight();}
    public static void u(CanSwim x){x.swim();}
    public static void v(CanFly x){x.fly();}
    public static void c(CanClimb x){x.climb();}
    public static void w(ActionCharacter x){x.fight();}

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        c(h);
        w(h);
    }

}
