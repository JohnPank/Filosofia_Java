package com.john_pank.chapter11.task18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * Filosofia_Java
 * Created by John Pank on 29.06.2016.
 */
public class HashVSLinked {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        //LinkedHashMap<String,String> hashMap = new LinkedHashMap<>();

        hashMap.put("6","test6");
        hashMap.put("2","test2");
        hashMap.put("3","test3");
        hashMap.put("1","test1");
        hashMap.put("5","test5");
        hashMap.put("4","test4");

        Iterator<String> hashIterator = hashMap.keySet().iterator();
        while (hashIterator.hasNext()){
            System.out.println(hashMap.get(hashIterator.next()));
        }
    }
}
