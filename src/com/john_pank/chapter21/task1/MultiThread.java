package com.john_pank.chapter21.task1;

/**
 * Created by JohnPank on 03.07.17
 */

class TextPrinter implements Runnable{
    private static int counter;
    private int threadID;

    TextPrinter(){ threadID = counter++; }

    public void run() {
        System.out.println("Thread:" + threadID + " Text1");
        //Thread.yield();
        System.out.println("Thread:" + threadID + " Text2");
        //Thread.yield();
        System.out.println("Thread:" + threadID + " Text3");
        //Thread.yield();
    }
}

public class MultiThread {
    public static void main(String[] args) {
        Thread[] tr = new Thread[5];
        System.out.println("5 threads start");
        for (int i = 0; i < 5; i++) {
            tr[i] = new Thread(new TextPrinter());
            tr[i].start();
        }
        System.out.println("5 threads started");
    }
}
