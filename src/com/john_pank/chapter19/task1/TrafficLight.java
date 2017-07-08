package com.john_pank.chapter19.task1;

/**
 * Created by JohnPank on 12.05.17  12:27
 */

import com.john_pank.chapter19.Signal;

import static com.john_pank.chapter19.Signal.*;

public class TrafficLight {

    Signal color = RED;
    public void change(){
        switch (color){
            case RED:
                color = GREEN;
                break;
            case GREEN:
                color = YELLOW;
                break;
            case YELLOW:
                color = RED;
                break;
        }
    }

    public String toString(){
        return "Color -> " + color;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(trafficLight);
            trafficLight.change();
        }
    }
}
