package com.john_pank.chapter14.task21;

import java.util.Date;

/**
 * Filosofia_Java
 * Created by John Pank on 11.11.2016.
 */

interface Interface{
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface{
    int a;

    @Override
    public void doSomething(){
        System.out.println("doSomething");
        for (int i = 0; i<100000; i++){
            a=0;
            a=i;
            //System.out.println(i);
        }

    }

    @Override
    public void somethingElse(String arg){
        System.out.println("somethingElse " + arg);
        for (int i = 0; i<100000; i++){
            a=0;
            a=i;
            //System.out.println(i);
        }
    }
}

class SimpleProxy implements Interface{
    private Interface proxied;
    //Date date = new Date(System.currentTimeMillis());
    long timeStart;
    long timeEnd;

    public SimpleProxy(Interface proxied){
        this.proxied = proxied;
    }

    @Override
    public void doSomething(){
        timeStart = new Date().getTime();
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
        timeEnd = new Date().getTime();
        System.out.println("Time:" + (timeEnd-timeStart) + "ms");
        //System.out.println(timeStart);
        //System.out.println(timeEnd);
    }

    @Override
    public void somethingElse(String arg){
        timeStart = new Date().getTime();
        System.out.println("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
        timeEnd = new Date().getTime();
        System.out.println("Time:" + (timeEnd-timeStart) + "ms");
        //System.out.println(timeEnd-timeStart);
    }
}

public class SimpleProxyDemo {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bla-bla-bla");
    }
    public static void main(String[] args) {

        consumer(new RealObject());

        System.out.println("-------------");

        consumer(new SimpleProxy(new RealObject()));
    }
}
