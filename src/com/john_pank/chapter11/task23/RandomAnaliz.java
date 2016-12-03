package com.john_pank.chapter11.task23;

/**
 * Filosofia_Java
 * Created by John Pank on 24.07.2016.
 */
import java.util.HashMap;
import java.util.Random;

public class RandomAnaliz{

    public HashMap<Integer,Integer> createMap(){
        HashMap<Integer,Integer> randomMap = new HashMap<Integer,Integer>();
        Random rnd = new Random();


        for(int i = 0; i<10; i++){
            randomMap.put(i,0);
        }


        for(int i = 0; i < 1000; i++){
            int key = rnd.nextInt(10);
            int qnt = randomMap.get(key);
            qnt++;
            randomMap.put(key,qnt);
        }
        return randomMap;
    }

    public int getIndexOfMax(HashMap<Integer,Integer> sourseMap){
        int maxI = 0;
        int max = 0;
        int qnt = 0;
        for(int i = 0; i<10; i++){
            qnt = sourseMap.get(i);
            if (qnt > max){
                max = qnt;
                maxI = i;
            }
        }
        return maxI;
    }

    public static void main(String args[]){
        RandomAnaliz ra = new RandomAnaliz();
        HashMap<Integer,Integer> sourseMap = new HashMap<Integer,Integer>();

        for(int i = 0; i<10; i++){
            sourseMap = ra.createMap();
            System.out.println(ra.getIndexOfMax(sourseMap));
        }
    }

}

