package com.john_pank.chapter21.task30;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by JohnPank on 07.07.17
 */

class Transmitter implements Runnable{
    private PipedWriter out = new PipedWriter();
    Random rnd = new Random();
    public PipedWriter getPipedWriter(){ return out; }
    public void run(){
        try{
            for (int i = 0; i < 10; i++) {
                out.write(rnd.nextInt());
                TimeUnit.SECONDS.sleep(1);
            }
        }catch (IOException e){
            System.out.println("Transmitter error!");
        }catch (InterruptedException e){
            System.out.println("Transmitter interrupted!");
        }
    }
}

class Reseiver implements Runnable{
    private PipedReader in;
    public Reseiver(Transmitter transmitter) throws IOException {
        in = new PipedReader(transmitter.getPipedWriter());
    }
    public void run(){
        try {
            while (true)
                System.out.println(in.read());
        } catch (IOException e) {
            System.out.println("Reseiver error!");
        }
    }
}

public class PipedIO {
    public static void main(String[] args) throws IOException, InterruptedException {
        Transmitter tx = new Transmitter();
        Reseiver rx = new Reseiver(tx);
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(tx);
        exec.execute(rx);
        TimeUnit.SECONDS.sleep(11);
        exec.shutdownNow();
    }
}
