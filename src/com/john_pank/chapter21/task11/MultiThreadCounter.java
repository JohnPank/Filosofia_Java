package com.john_pank.chapter21.task11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by JohnPank on 06.07.17
 */

public class MultiThreadCounter {
    public static void main(String[] args) throws InterruptedException {
        DecCounter decCounter = new DecCounter();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new DecCounterThread(decCounter));
        executorService.execute(new DecCounterThread(decCounter));
        executorService.execute(new DecCounterThread(decCounter));
        executorService.execute(new DecCounterThread(decCounter));
        executorService.execute(new DecCounterThread(decCounter));
        executorService.shutdown();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("in main");
        decCounter.showCounter();
    }
}
