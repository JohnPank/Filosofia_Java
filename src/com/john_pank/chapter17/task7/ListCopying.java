package com.john_pank.chapter17.task7;

import java.util.*;

/**
 * Filosofia_Java
 * Created by John Pank on 23.01.2017.
 */
public class ListCopying {
    public static void main(String[] args) {

        Random rnd = new Random();

        ArrayList<Integer> aList = new ArrayList<>(20);
        LinkedList<Integer> lList = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            aList.add(rnd.nextInt(100));
            lList.add(rnd.nextInt(100));
        }

        System.out.println(aList);
        System.out.println(lList);

        Iterator<Integer> aIter = aList.iterator();
        ListIterator<Integer> lIter = lList.listIterator(0);

        while (aIter.hasNext())
            System.out.print(aIter.next() + " ");

        System.out.println("");

        while (lIter.hasNext())
            System.out.print(lIter.next() + " ");

        System.out.println("");
        System.out.println("Copy from begin  ******************************************************");

        while(aIter.hasNext()){
            lIter.add(aIter.next());
            lIter.next();
            lIter.remove();
        }

        System.out.println(aList);
        System.out.println(lList);

        //System.out.println("");
        System.out.println("Copy from finish  ******************************************************");

        aIter = aList.iterator();
        lIter = lList.listIterator(lList.size());

        while (aIter.hasNext() & lIter.hasPrevious()){
            lIter.previous();
            lIter.remove();
            lIter.add(aIter.next());
            lIter.previous();
        }
        System.out.println("");
        System.out.println(aList);
        System.out.println(lList);

    }
}
