package com.aujas.Multithreading;

public class DeadLockDemo {

    public static void main(String[] args) throws InterruptedException{
        Worker1.t2 = Thread.currentThread();

        Worker1 w1 = new Worker1();
        Thread t1 = new Thread(w1);
        t1.start();
        t1.join();

        System.out.println("This deadLock condition");
    }
}

class Worker1 implements Runnable{

    static Thread t2;

    public void run() {
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("This is inside run method : Worker1");
    }
}
