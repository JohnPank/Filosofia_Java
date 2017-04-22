package com.john_pank.chapter17.task10;

import java.util.LinkedList;

/**
 * Filosofia_Java
 * Created by John Pank on 26.01.2017.
 */

class MySortedSet<T extends Comparable>{
    class MyComparator{
        private int compare(T a, T b){
            if(a.compareTo(b) > 0)
                return +1;

            if(a.compareTo(b) < 0)
                return -1;

            if(a.compareTo(b) == 0)
                return 0;

            return 0;
        }
    }

    private LinkedList<T> base;
    private MyComparator comparator;

    MySortedSet(){
        base = new LinkedList<>();
        comparator = new MyComparator();
    }

    public boolean add(T a){
        LinkedList<T> temp = new LinkedList<>();
        boolean finded = false;

        if(base.size() == 0){
            base.add(a);
            return true;
        }

        for (T t : base){
            if(comparator.compare(a, t) == 0)
                return false;
            if(comparator.compare(a, t)>0){
                if(!finded) {
                    temp.add(a);
                    temp.add(t);
                    finded = true;
                }
                else{
                    temp.add(t);
                }
            }
            else{
                temp.add(t);
            }
        }

        base = temp;
        System.out.println(temp);
        return true;
    }

    public boolean contains(T a){
        for(T t : base){
            if (t.equals(a))
                return true;
        }
        return false;
    }

    public void clear(){
        base.clear();
    }

    public boolean isEmpty(){
        return base.size() == 0;
    }

    public int size(){
        return base.size();
    }

    public String toString(){
        return base.toString();
    }

}

public class TestMySortedSet {
    public static void main(String[] args) {
        MySortedSet<Integer> mss = new MySortedSet<>();
        mss.add(2);
        mss.add(5);
        mss.add(8);
        mss.add(3);
        mss.add(3);
        mss.add(6);
        System.out.println(mss.contains(5));
        System.out.println(mss.size());
        System.out.println(mss);
        mss.clear();
        System.out.println(mss);
    }
}
