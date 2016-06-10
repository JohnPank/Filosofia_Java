package com.john_pank.chapter9.task14;

/**
 * Filosofia_Java
 * Created by John Pank on 27.03.2016.
 */

interface Peon{
    void getWood();
    void getGold();
}
interface Warrior{
    void attack();
    void patrol();
}
interface Troll{
    void throwing();
    void scream();
}

interface WarCraftCharacter extends Peon, Warrior, Troll{
    void move();
}

class Person{
    int hp;
    public Person(int hp){
        this.hp = hp;

    }
}

class LandWarrior extends Person implements Peon, Warrior, Troll, WarCraftCharacter{
    public LandWarrior(int hp){
        super(hp);
    }
    public void getWood(){
        System.out.println("Рубим деревья");
    };
    public void getGold(){
        System.out.println("Добываем золото");
    };
    public void attack(){
        System.out.println("Атакую");
    };
    public void patrol(){
        System.out.println("Патрулирую");
    };
    public void throwing(){
        System.out.println("Метаю топор");
    };
    public void scream(){
        System.out.println("Кричу");
    };
    public void move(){
        System.out.println("Бегу уже");
    };
}

public class Orda {
    public void farm(Peon p){
        p.getGold();
        p.getWood();
    }
    public void battle(Warrior w){
        w.attack();
    }
    public void thrw (Troll t){
        t.throwing();
    }
    public void mov(WarCraftCharacter wc){
        wc.move();
    }
    public static void main(String[] args) {
        Orda o = new Orda();
        LandWarrior lw = new LandWarrior(100);
        o.farm(lw);
        o.battle(lw);
        o.thrw(lw);
    }
}
