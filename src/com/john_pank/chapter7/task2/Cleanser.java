package com.john_pank.chapter7.task2;

/**
 * Filosofia_Java
 * Created by John Pank on 20.02.2016.
 */
class Cleanser {
    private String s = "Cleanser ";

    public Cleanser()
    {
        System.out.println("Cleanser");
    }

    public void append(String a){s += a;}
    public void dilute(){append("dilute() ");}
    public void apply(){append("apply() ");}
    public void scrub(){append("scrub() ");}

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();x.apply();x.scrub();
        System.out.println(x);
    }
}
