package com.john_pank.chapter9.task9;

/**
 * Filosofia_Java
 * Created by John Pank on 25.03.2016.
 */

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

interface Playable{
    void play(Note n);
}

abstract class Instrument{
    public void play(Note n){
        System.out.println(this + ".play()" + n);
    }
    public void adjust(){
        System.out.println(this + ".adjust()");
    }

}

class Wind extends Instrument implements Playable{
    public String toString(){ return "Wind"; }
}

class Percussion extends Instrument implements Playable{
    public String toString(){ return "Percussion"; }
}

class Stringed extends Instrument implements Playable{
    public String toString(){ return "Stringed"; }
}

class Brass extends Wind{
    public String toString(){ return "Brass"; }
}

class Woodwind extends Wind{
    public String toString(){ return "Woodwind"; }
}

public class Music5 {
    static void tune(Playable i){
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Playable[] e){
        for(Playable i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };

        tuneAll(orchestra);
    }
}
