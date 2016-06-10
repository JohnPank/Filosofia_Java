package com.john_pank.chapter8.task9;

/**
 * Filosofia_Java
 * Created by John Pank on 23.02.2016.
 */
class HomeOfRodent
{
    private static int quantity = 0;
    private final int id = quantity + 1;

    public HomeOfRodent()
    {
        quantity++;
        System.out.println("Домик №" + quantity);
    }

    public void dispose()
    {
        if(--quantity >= 0)
            System.out.println("Destroy home#" + id);
        else
            System.out.println("NO HOME FOR DESTROY!!!");

    }
}

class Rodent {

    HomeOfRodent home;

    public Rodent(){
        System.out.println("Создание Rodent");
        home = new HomeOfRodent();
    }
    public void description(){ System.out.println(""); }
    public String eatign() { return ""; }
    public void dispose(){
        System.out.println("Удаление базового класса");
        home.dispose();
    }
}

class Mouse extends Rodent {
    public Mouse(){ System.out.println("Создание Mouse"); }
    public void description(){ System.out.println("Мышь " + this.eatign()); }
    public String eatign() { return "Ест зерно"; }
    public void dispose(){
        System.out.println("Удаление Mouse");
        super.dispose();
    }

}

class Hamster extends Rodent {
    public Hamster(){ System.out.println("Создание Hamster"); }
    public void description(){ System.out.println("Хомяк " + this.eatign()); }
    public String eatign() {  return "Ест семечки и яблоки"; }
    public void dispose(){
        System.out.println("Удаление Hamster");
        super.dispose();
    }
}

class Rat extends Rodent {
    public Rat(){ System.out.println("Создание Rat"); }
    public void description(){ System.out.println("Крыса " + this.eatign()); }
    public String eatign() {  return "Ест всё, провода и бетон"; }
    public void dispose(){
        System.out.println("Удаление Rat");
        super.dispose();
    }
}

public class Rodents {
    public static void main(String[] args) {
        //Rodent roden = new Hamster();
        Rodent [] rod = {new Mouse(), new Hamster(), new Rat(), new Mouse(), new Hamster(),new Rat()};

        for (Rodent r : rod)
        {
            r.description();
        }

        for (Rodent r : rod)
        {
            r.dispose();
        }


    }



}
