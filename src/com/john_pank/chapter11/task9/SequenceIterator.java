package com.john_pank.chapter11.task9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Filosofia_Java
 * Created by John Pank on 20.06.2016.
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

public class SequenceIterator {

    public static void main(String[] args) {
        List<SomeString> sequence = new ArrayList<SomeString>();

        sequence.add(new SomeString("string1"));
        sequence.add(new SomeString("string2"));
        sequence.add(new SomeString("string3"));

        Iterator<SomeString> someStringIterator = sequence.iterator();

        while (someStringIterator.hasNext()){
            System.out.println(someStringIterator.next() + " ");
        }
    }
}