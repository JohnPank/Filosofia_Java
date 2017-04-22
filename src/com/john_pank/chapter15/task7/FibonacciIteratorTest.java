package com.john_pank.chapter15.task7;

import java.util.Iterator;

/**
 * Filosofia_Java
 * Created by John Pank on 26.12.2016.
 */
interface Generator<T> { T next(); }

class Fibonacci implements Generator<Integer> {
    private int count = 0;
    public Integer next() { return fib(count++); }
    private int fib(int n){
        if(n<2) return 1;
        return fib(n-2) + fib(n-1);
    }
/*
  public static void main(String[] args){
    Fibonacci gen = new Fibonacci();
    for(int i = 0; i < 18; i++)
      System.out.print(gen.next() + " ");
  }
*/
}

class FibonacciIterator implements Iterable<Integer>{
    Fibonacci fib = new Fibonacci();
    private int count = 0;
    FibonacciIterator(int lenght){ count = lenght; }

    @Override
    public Iterator<Integer> iterator() {
        //Write iterator code!!!!!
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext(){ return count>0; }

            @Override
            public Integer next() {
                count--;
                return fib.next();
            }
        };
    }
}

public class FibonacciIteratorTest{
    public static void main(String[] args){
        for(Integer i : new FibonacciIterator(10))
        System.out.print(i + " ");
    }
}

