package com.john_pank.chapter21.task11;

/**
 * Created by JohnPank on 06.07.17
 */
public class DecCounterThread implements Runnable {
    DecCounter decCounter;
    public DecCounterThread(DecCounter decCounter) {
        this.decCounter = decCounter;
    }

    public void run(){
        decCounter.showCounter();
        for (int i = 0; i < 25; i++) {
            decCounter.bdsmIncr();
        }


    }
}
