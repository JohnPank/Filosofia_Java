package com.john_pank.chapter11.task12;

/**
 * Filosofia_Java
 * Created by John Pank on 26.06.2016.
 */
//12
import java.util.*;

public class SortArray{

    public ArrayList<Integer> createList(int size){
        ArrayList<Integer> sourceArray = new ArrayList<Integer>();
        for(int i = 0; i<size; i++){
            sourceArray.add(i);
        }
        return sourceArray;
    }

    public void showArray(ArrayList<Integer> list){
        for (int elem : list){
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public ArrayList<Integer> sortMethod1(ArrayList<Integer> list){
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();

        for(int i = 0; i<list.size(); i++){
            sortedArray.add(0);
        }

        ListIterator<Integer> li = list.listIterator(list.size());
        ListIterator<Integer> sortI = sortedArray.listIterator();


        while(li.hasPrevious()){

            sortI.next();
            sortI.set(li.previous());
        }
        return sortedArray;
    }

    public ArrayList<Integer> sortMethod2(ArrayList<Integer> list){
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();

        for(int i = 0; i<list.size(); i++){
            sortedArray.add(0);
        }

        ListIterator<Integer> li = list.listIterator();
        ListIterator<Integer> sortI = sortedArray.listIterator(sortedArray.size());


        while(li.hasNext()){

            sortI.previous();
            sortI.set(li.next());
        }
        return sortedArray;
    }

    public static void main(String[] args){
        SortArray sa = new SortArray();
        ArrayList<Integer> sourceArray = sa.createList(10);
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();

        System.out.println("Source:");
        sa.showArray(sourceArray);

        System.out.println("Sort1:");
        sortedArray = sa.sortMethod1(sourceArray);
        sa.showArray(sortedArray);

        System.out.println("Sort2:");
        sortedArray = sa.sortMethod2(sourceArray);
        sa.showArray(sortedArray);
    }
}
