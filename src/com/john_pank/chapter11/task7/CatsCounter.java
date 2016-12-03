package com.john_pank.chapter11.task7;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Filosofia_Java
 * Created by John Pank on 19.06.2016.
 */
class Cat{
    private String catName;
    Cat(String name){
        catName = name;
    }

    public String toString(){
        return catName;
    }
}

public class CatsCounter {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Maha"), new Cat("Kisik"), new Cat("Vasilisa"), new Cat("Jana"), new Cat("Muzika")};
        List<Cat> catList = new ArrayList<>();
        List<Cat> subCatList = new ArrayList<>();
        Collections.addAll(catList,cats);
        System.out.println(catList);
        subCatList = catList.subList(2,4);
        System.out.println(subCatList);
        catList.removeAll(subCatList);
        System.out.println(catList);
    }
}
