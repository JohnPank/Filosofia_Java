package com.john_pank.chapter21.task14;

import java.util.*;


/**
 * Created by JohnPank on 06.07.17
 */

public class Timers {
    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task 1000");
            }
        }, 1000);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task 3000");
            }
        }, 3000);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task 2000");
            }
        }, 2000);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task 4000");
            }
        }, 4000);

        //exit
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.exit(0);
            }
        }, 5000);
    }
}
