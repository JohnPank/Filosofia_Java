package com.john_pank.chapter21.task11;

/**
 * Created by JohnPank on 06.07.17
 */

class DecCounter {
    private int dec = 0;
    private int halfDec = 0;

     public synchronized void bdsmIncr(){
        for (int i = 0; i < 5; i++) {
            dec++;
            halfDec++;
            Thread.yield();
        }
        for (int i = 0; i < 5; i++) {
            dec++;
            Thread.yield();
        }
    }

    public synchronized void showCounter() {
        System.out.println("dec->" + dec);
        System.out.println("halfDec->" + halfDec);
    }
}


