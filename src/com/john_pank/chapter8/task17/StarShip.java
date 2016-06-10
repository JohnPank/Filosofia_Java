package com.john_pank.chapter8.task17;

/**
 * Filosofia_Java
 * Created by John Pank on 28.02.2016.
 */
class AlertStatus
{
   public void showStatus() {
       System.out.println("");
   }
}

class Silent extends AlertStatus
{
    public void showStatus(){
        System.out.println("Все тихо");
    }
}

class Attention extends AlertStatus
{
    public void showStatus(){
        System.out.println("Внимание");
    }
}

class Alarm extends AlertStatus
{
    public void showStatus(){
        System.out.println("Пиздец всему!!!");
    }
}

class Status
{
    private AlertStatus alertStatus = new AlertStatus();
    public void setSilent(){alertStatus = new Silent();}
    public void setAttention(){alertStatus = new Attention();}
    public void setAlarm(){alertStatus = new Alarm();}
    public void show(){alertStatus.showStatus();}
}

public class StarShip {
    public static void main(String[] args) {
        Status status = new Status();
        status.setAlarm();
        status.show();
        status.setSilent();
        status.show();
    }
}
