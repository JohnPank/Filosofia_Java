package com.john_pank.chapter11.task11;

import java.util.*;

/**
 * Filosofia_Java
 * Created by John Pank on 23.06.2016.
 */


public class WorkWithAnyCollection {

    public void showAnyCollection(Collection collection){
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    public static void main(String[] args) {
        WorkWithAnyCollection wwac = new WorkWithAnyCollection();
        List<String> al = new ArrayList<String>();
        List<String> ll = new LinkedList<>();

        al.add("odin");
        al.add("dva");
        al.add("tri");
        al.add("chetire");
        al.add("pyat");
        al.add("shest");
        al.add("sem");

        ll.add("vosem");
        ll.add("devyat");
        ll.add("desat");
        ll.add("odinadcat");
        ll.add("dvenadcat");
        ll.add("trinadsat");
        ll.add("chetirnasat");

        wwac.showAnyCollection(al);
        wwac.showAnyCollection(ll);
    }
}
