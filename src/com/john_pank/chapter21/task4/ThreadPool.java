package com.john_pank.chapter21.task4;

import com.john_pank.chapter21.task2.FibonacciCreator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by JohnPank on 03.07.17
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 7; i++)
            executorService.execute(new FibonacciCreator(10));
        executorService.shutdown();
    }
}
