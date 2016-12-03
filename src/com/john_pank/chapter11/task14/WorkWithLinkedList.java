package com.john_pank.chapter11.task14;

import java.util.LinkedList;
import java.util.List;

/**
 * Filosofia_Java
 * Created by John Pank on 26.06.2016.
 */
public class WorkWithLinkedList {
    public void showArray(List<Integer> list){
        for (int elem : list){
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public void showList(List<Integer> list){
        for(int i : list){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        WorkWithLinkedList wwll = new WorkWithLinkedList();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < 20; i++)
            linkedList.add((linkedList.size()/2),i);


        wwll.showArray(linkedList);

    }
}
