package com.john_pank.chapter14.task1;



/**
 * Filosofia_Java
 * Created by John Pank on 24.10.2016.
 */

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
interface Danger{}

class Toy{
    //Toy(){}
    Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, Danger{
    FancyToy(){
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc){
        System.out.println("Class name: " + cc.getName());
        System.out.println("Class simple name: " + cc.getSimpleName());
        System.out.println("Class canonical name: " + cc.getCanonicalName());
        System.out.println("Is interface?: " + cc.isInterface());
        System.out.println("-----------------------------------------------");
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class c = null;
        try{
            c = Class.forName("com.john_pank.chapter14.task1.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("FancyToy not found");
            System.exit(1);
        }
        printInfo(c);

        for(Class face : c.getInterfaces())
            printInfo(face);

        Class up = c.getSuperclass();
        Object obj = null;
        try{
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Can't create instance");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Access denied ");
            System.exit(1);
        }
        printInfo(obj.getClass());

    }
}

