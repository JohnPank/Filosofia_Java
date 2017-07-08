package com.john_pank.chapter21.task5;

import java.util.concurrent.*;

/**
 * Created by JohnPank on 03.07.17
 */

class FibonacciSummator implements Callable<Integer> {

    private static int threadCounter;
    private int threadID;
    private int n;

    public FibonacciSummator(int n){
        threadID = threadCounter++;
        this.n = n;
    }

    public Integer call() {
        int totalSum = 0;
        int fib1 = 1;
        int fib2 = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += fib1;
            //System.out.println("Thread:" + threadID + " -> " + fib1);
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
        }
        return totalSum;
    }
}

public class MultiFibSumm {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try {
            ExecutorService executorService = Executors.newCachedThreadPool();
            for (int i = 0; i < 7; i++) {
                Future<Integer> fi = executorService.submit(new FibonacciSummator(8));
                System.out.println("Result:" + fi.get());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
