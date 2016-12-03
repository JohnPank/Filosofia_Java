package com.john_pank.chapter11.task4;

import java.util.*;

/**
 * Filosofia_Java
 * Created by John Pank on 18.06.2016.
 */
class Generator{
    private int index = 0;
    private String[] arr = {"Geralt", "Ennifer", "Lutik", "Triss", "Vessemir"};
    public String next(){
        String tmp;
        if(index < arr.length)
            tmp = arr[index++];
        else
        {
            index = 0;
            tmp = arr[index++];
        }
        return tmp;
    }
}

public class Outer {
    public static void main(String[] args) {
        Generator g = new Generator();

        List<String> al = new ArrayList<>();
        List<String> ll = new LinkedList<>();
        Set<String> hs = new HashSet<>();
        Set<String> lhs = new LinkedHashSet<>();
        Set<String> ts = new TreeSet<>();

        for (int i = 0; i < 10; i++){
            String tmp = g.next();
            al.add(tmp);
            ll.add(tmp);
            hs.add(tmp);
            lhs.add(tmp);
            ts.add(tmp);
        }
        System.out.println(al);
        System.out.println(ll);
        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);
    }
}
