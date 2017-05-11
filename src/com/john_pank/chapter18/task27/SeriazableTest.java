package com.john_pank.chapter18.task27;

import java.io.*;

/**
 * Filosofia_Java
 * Created by John Pank on 05.05.17.
 */

class Axe implements Serializable{
    private int damage;

    public Axe(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}

class Troll implements Serializable{
    private int ID;
    private Axe axe;

    public Troll(int id, Axe axe){
        ID = id;
        this.axe = axe;
    }

    public void atak(){
        System.out.println("Troll " + ID + " make damage " + axe.getDamage());
    }
}

public class SeriazableTest {
    public static void main(String[] args) {
        Axe dvemericAxe = new Axe(20);
        Troll troll = new Troll(0, dvemericAxe);
        //before serialization
        troll.atak();

        System.out.println("Serialization");

        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Trolls.ser"));
            out.writeObject(troll);
            out.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Deserialization");

        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Trolls.ser"));
            troll = (Troll)in.readObject();
            in.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //after serialization
        troll.atak();
    }
}
