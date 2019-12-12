package com.aujas.Multithreading;

public class InterruptDemo {

    public static void main(String[] args) {

        ChildThread ct = new ChildThread();
        ct.start();
        ct.interrupt(); // If the thred is not in sleeping or waiting condition , Thread will behave as normal.

        System.out.println(ct.isInterrupted());



    }
}

class ChildThread extends Thread{

    public void run(){

        for(int i =0; i<10;i++){
            System.out.println("Child thread : "+ i);

        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

        }
