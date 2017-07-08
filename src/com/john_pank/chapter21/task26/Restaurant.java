package com.john_pank.chapter21.task26;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by JohnPank on 07.07.17
 */

class Meal{
    private final int orderNum;
    public Meal(int orderNum) {
        this.orderNum = orderNum;
    }
    public String toString(){ return "Meal " + orderNum; }
    public int getOrderNum(){ return orderNum; }
}

class Trash{
    private final int orderNum;
    public Trash(int orderNum) {
        this.orderNum = orderNum;
    }
    public String toString(){ return "Trash " + orderNum; }
}

class WaitPerson implements Runnable{
    private Restaurant restaurant;
    public WaitPerson(Restaurant restaurant){ this.restaurant = restaurant; }
    public void run(){
        try {
            while (!Thread.interrupted()) {
                synchronized (this) {
                    while (restaurant.meal == null)
                        wait();
                }
                System.out.print("WaitPerson got " + restaurant.meal);
                synchronized (restaurant.busBoy) {
                    restaurant.trash = new Trash(restaurant.meal.getOrderNum());
                    restaurant.meal = null;
                    restaurant.busBoy.notifyAll();
                }
            }
        }catch (InterruptedException e){
            System.out.println("WaitPerson interrupted");
        }
    }
}

class Chef implements Runnable{
    private Restaurant restaurant;
    private int count = 0;
    public Chef(Restaurant restaurant){ this.restaurant = restaurant; }
    public void run(){
        try{
            while (!Thread.interrupted()){
                synchronized (this){
                    while (restaurant.meal != null)
                        wait();
                }
                if(++count == 10){
                    System.out.println("Out of food, closing");
                    restaurant.exec.shutdownNow();
                }
                System.out.print("Order up! ");
                synchronized (restaurant.waitPerson){
                    restaurant.meal = new Meal(count);
                    restaurant.waitPerson.notifyAll();
                }
                TimeUnit.MILLISECONDS.sleep(100);
            }
        }catch (InterruptedException e){
            System.out.println("Chef interrupted");
        }
    }
}

class BusBoy implements Runnable{
    private Restaurant restaurant;
    public BusBoy(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void run(){
        try{
            while (!Thread.interrupted()){
                synchronized (this){
                    while (restaurant.trash == null)
                        wait();
                }
                System.out.println(" BusBoy cleaning " + restaurant.trash);
                synchronized (restaurant.chef){
                    restaurant.trash = null;
                    restaurant.chef.notifyAll();
                }
            }
        }catch (InterruptedException e){
            System.out.println("BusBoy interrupted");
        }
    }
}

public class Restaurant {
    Meal meal;
    Trash trash;
    ExecutorService exec = Executors.newCachedThreadPool();
    WaitPerson waitPerson = new WaitPerson(this);
    Chef chef = new Chef(this);
    BusBoy busBoy = new BusBoy(this);
    public Restaurant(){
        exec.execute(chef);
        exec.execute(waitPerson);
        exec.execute(busBoy);
    }

    public static void main(String[] args) {
        new Restaurant();
    }
}
