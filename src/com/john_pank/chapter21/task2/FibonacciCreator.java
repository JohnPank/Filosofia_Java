package com.john_pank.chapter21.task2;

/**
 * Created by JohnPank on 03.07.17
 */

public class FibonacciCreator implements Runnable{
    private static int threadCounter;
    private int threadID;
    private int n;

    public FibonacciCreator(int n){
        threadID = threadCounter++;
        this.n = n;
    }

    public void run() {
        int fib1 = 1;
        int fib2 = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Thread:" + threadID + " -> " + fib1);
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
        }
    }
}
