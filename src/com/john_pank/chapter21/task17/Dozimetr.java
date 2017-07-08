package com.john_pank.chapter21.task17;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by JohnPank on 06.07.17
 */

class XRayCounter{
    private int count = 0;
    public synchronized void increment() { count++; }
    public synchronized int getCount() { return count; }
}

class Sensor implements Runnable{
    private static Integer suncObj = new Integer(1);
    private static XRayCounter xRayCounter = new XRayCounter();
    private static ArrayList<Sensor> sensors = new ArrayList<>();

    private final int id;
    private int dose = 0;
    private static volatile boolean canceled = false;

    public static void cancel() { canceled = true; }

    Sensor(int id) {
        this.id = id;
        sensors.add(this);
    }

    public void run() {
        while (!canceled){
            if(Thread.interrupted()){
                System.out.println("Sensor:" + id + " stopped");
                cancel();
            }

            synchronized (suncObj){
                dose++;
                xRayCounter.increment();
                System.out.println("Sensor:" + id + " Dose:" + dose + " Total:" + xRayCounter.getCount());
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                }catch (InterruptedException e){
                    System.out.println("Sensor:" + id + " interrupted");
                    cancel();
                }
            }
        }
    }
}

public class Dozimetr {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new Sensor(i));
            threads[i].start();
        }
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            threads[i].interrupt();
        }
        System.out.println("end");
    }
}
