package com.aujas.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantDemo {

    public static void main(String[] args) {

        CounterClass c = new CounterClass();

        IncrementingThread increamentingThread = new IncrementingThread(c);
        DecrementingThread decreamentingThread = new DecrementingThread(c);

        increamentingThread.start();
        decreamentingThread.start();

        try {
            increamentingThread.join();
            decreamentingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" Counter value "+ c.counterValue());
    }

}

class IncrementingThread extends Thread{

    CounterClass c;

    IncrementingThread(CounterClass c){
        this.c = c;
    }

    @Override
    public void run() {
        c.increment();

    }
}



class DecrementingThread extends Thread{

    CounterClass c;
    DecrementingThread(CounterClass c){
        this.c = c;
    }

    @Override
    public void run() {
       c.decrement();
    }
}

class CounterClass{

    int counter = 0;
    Lock lock = new ReentrantLock();

    public void increment(){
        for (int i = 0; i<1000;i++) {
            lock.lock();
            this.counter++;
            lock.unlock();
        }
    }

    public void decrement(){
        for (int i = 0; i<1000;i++ )
        {
            if(lock.tryLock()) {
                this.counter--;
            }
            else{
                System.out.println("Perform lternative operation");
            }

        }

    }

    public int counterValue(){
        return counter;

    }
}