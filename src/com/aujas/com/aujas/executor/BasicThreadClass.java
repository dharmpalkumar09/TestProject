package com.aujas.com.aujas.executor;

public class BasicThreadClass extends Thread{

    @Override
    public void run() {
        System.out.println("Inside Run method");
    }

    public static void main(String[] args) {

        BasicThreadClass t1 = new BasicThreadClass();
        t1.start();
        System.out.println(t1.getState());


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Annomyously Thread creation ");
            }
        });

        t2.start();
    }
}
