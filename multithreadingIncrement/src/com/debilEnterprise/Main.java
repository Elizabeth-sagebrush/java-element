package com.debilEnterprise;

import java.util.concurrent.atomic.AtomicInteger;

class Increment {
    private static AtomicInteger conter = new AtomicInteger(0);
    public static int nextCounter(){
        return conter.incrementAndGet();
    }
}

class MyThread implements Runnable {
    public void run(){
        int result;
        for(int i=0; i<1000; i++){
            result = Increment.nextCounter();
            if(i==999){
                System.out.println(result);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i<10; i++){
            Thread t = new Thread(new MyThread());
            t.start();
            t.join();
        }
    }
}
