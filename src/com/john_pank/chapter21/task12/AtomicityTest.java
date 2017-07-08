package com.john_pank.chapter21.task12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by JohnPank on 06.07.17
 */
public class AtomicityTest implements Runnable {
    private int i = 0;
    public synchronized int getValue() { return i; }
    private synchronized void evenIncrement() { i++; i++; }
    public void run(){
        while (true)
            evenIncrement();
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicityTest at = new AtomicityTest();
        exec.execute(at);
        while (true){
            int val = at.getValue();
            if(val % 2 != 0 | val >= 50000000){
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
