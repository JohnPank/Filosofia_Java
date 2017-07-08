package com.john_pank.chapter21.task2;

public class MultiFibonacci {
    public static void main(String[] args) {
        Thread[] tr = new Thread[5];
        System.out.println("5 threads start");
        for (int i = 0; i < 5; i++) {
            tr[i] = new Thread(new FibonacciCreator(10));
            tr[i].start();
        }
        System.out.println("5 threads started");
    }
}
