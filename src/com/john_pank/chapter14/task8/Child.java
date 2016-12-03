package com.john_pank.chapter14.task8;

import java.io.FileReader;
import java.lang.reflect.Field;

/**
 * Filosofia_Java
 * Created by John Pank on 07.11.2016.
 */

class Granny{
    int a;
    public String toString(){
        return "Granny";
    }
}
class Parent extends Granny{
    int b;
    public String toString(){
        return "Parent";
    }
}

public class Child extends Parent{
    int c;
    int d;
    int e;
    public static void main(String[] args) throws NullPointerException{
        Child child = new Child();
        Class ch = child.getClass();

        //System.out.println(ch.getSimpleName());
        try {
            while (!child.showSuperClass(ch).equals("Object")) {
                System.out.println(child.showSuperClass(ch));
                child.showFields(ch);
                ch = ch.getSuperclass();
            }
        }
        catch (NullPointerException e){
            System.out.println("Exception!!!");
        }

    }

    public String showSuperClass(Class cl){
        return cl.getSuperclass().getSimpleName();
    }

    public void showFields(Class cl){
        Field[] fields = cl.getDeclaredFields();
        for (Field f : fields)
            System.out.println(f.getName());
    }
}
