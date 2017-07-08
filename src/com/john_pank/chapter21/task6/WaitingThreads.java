package com.john_pank.chapter21.task6;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by JohnPank on 03.07.17
 */

class Sleeper implements Runnable{
    private static int threadCounter;
    private int threadID;

    public Sleeper(){
        threadID = threadCounter++;
    }

    public void run() {
        System.out.println("Thread " + threadID + " started");
        try {
            int delay = new Random().nextInt(10);
            TimeUnit.SECONDS.sleep(delay);
            System.out.println( "Thread:" + threadID + " sleeping " + delay + " sec");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class WaitingThreads {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try {
            ExecutorService executorService = Executors.newCachedThreadPool();

            for (int i = 0; i < 10; i++) {
                executorService.execute(new Sleeper());
            }

            executorService.shutdown();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
