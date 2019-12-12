package com.aujas.Multithreading;

public class JoinDemo {

    public static void main(String[] args) throws InterruptedException{

        Joinworker1 w1 = new Joinworker1();
        Thread t1 = new Thread(w1);

        Joinworker2 w2 = new Joinworker2();
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Let me club both the work");
    }
}

class Joinworker1 implements Runnable{
    @Override
    public void run(){

        try {
            Thread.sleep(50); // It will sleep other running thered for 50 millisecond
                                    // That means this run method will for next 50 milliseconds.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Worker 1: I have build my bock");
    }
}




class Joinworker2 implements Runnable{
    @Override
    public void run(){

        try {
            Thread.sleep(100); // It will sleep other running thered for 50 millisecond
            // That means this run method will for next 50 milliseconds.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Worker 2: I have build my bock");
    }
}