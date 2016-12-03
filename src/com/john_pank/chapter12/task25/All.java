package com.john_pank.chapter12.task25;

/**
 * Filosofia_Java
 * Created by John Pank on 05.08.2016.
 */
class Exc1 extends Exception{
    public String toString(){
        return "Exc1";
    }
}
class Exc2 extends Exc1{
    public String toString(){
        return "Exc2";
    }
}
class Exc3 extends Exc2{
    public String toString(){
        return "Exc3";
    }
}

class A{
    public void getExc() throws Exc1{
        throw new Exc1();
    }
}
class B extends A{
    public void getExc() throws Exc2{
        throw new Exc2();
    }
}
class C extends B{
    public void getExc() throws Exc3{
        throw new Exc3();
    }
}

public class All{
    public static void main(String[] args){
        C c = new C();
        A a = c;
        try{
            a.getExc();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
