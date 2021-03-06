package com.john_pank.chapter10.task2;

/**
 * Filosofia_Java
 * Created by John Pank on 25.05.2016.
 */

class SomeString{
    private String str;
    SomeString(String str){
        this.str = str;
    }
    @Override
    public String toString(){
        return str;
    }
}

interface Selector{
    boolean end();
    Object current();
    void next();
    //ссылка на внешний класс
    //Sequence newSequense();
}

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){ items = new Object[size]; }
    public void add(Object x){
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector{
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return  items[i];}
        public void next() {if(i < items.length) i++; }
        public Sequence newSequense(){ return Sequence.this; }
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(3);

        sequence.add(new SomeString("string1"));
        sequence.add(new SomeString("string2"));
        sequence.add(new SomeString("string3"));

        //for (int i = 0; i<10; i++)
            //sequence.add(Integer.toString(i));

        Selector selector = sequence.selector();

        //ссылка на внешний класс
        //sequence = selector.newSequense();
        while (!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
