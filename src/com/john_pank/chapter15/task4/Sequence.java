package com.john_pank.chapter15.task4;

/**
 * Filosofia_Java
 * Created by John Pank on 26.12.2016.
 */

import java.util.ArrayList;

interface Selector<A> {
    boolean end();
    A current();
    void next();
}

public class Sequence<T> {
    private ArrayList<T> items;
    public Sequence(int size) { items = new ArrayList<T>(size); }
    public void add(T x) {
        items.add(x);
    }

    private class SequenceSelector implements Selector<T> {
        private int i = 0;
        public boolean end() { return i == items.size(); }
        public T current() { return items.get(i); }
        public void next() { if(i < items.size()) i++; }
    }

    public Selector<T> selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence<String> sequence = new Sequence<String>(10);
        for(int i = 0; i < 10; i++){
            sequence.add(Integer.toString(i));
            //System.out.println(sequence.items);
        }
        Selector<String> selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
