package com.john_pank.chapter21.task22;

import java.util.concurrent.TimeUnit;

/**
 * Created by JohnPank on 06.07.17
 */

class Waiter implements Runnable{
    private Object suncObj;
    Waiter(Object suncObj){
        this.suncObj = suncObj;
    }

    public void run() {
        synchronized (suncObj){
            System.out.println("Waiter wait");
            try {
                suncObj.wait();
            } catch (InterruptedException e) {
                System.out.println("Waiter Interrupted");
            }
            System.out.println("Waiter start");
        }
    }
}

class Starter implements Runnable{
    private Object suncObj;
    Starter(Object suncObj){
        this.suncObj = suncObj;
    }

    public void run() {
        synchronized (suncObj){
            System.out.println("Starter start");
            suncObj.notify();
        }
    }
}

public class Waiting {
    public static void main(String[] args) throws InterruptedException {
        Object suncObj = new Object();
        Thread w = new Thread(new Waiter(suncObj));
        Thread s = new Thread(new Starter(suncObj));
        w.start();
        TimeUnit.SECONDS.sleep(2);
        s.start();
    }
}
