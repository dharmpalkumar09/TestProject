package com.aujas.test.com.thread;

public class CreateNewThread extends Thread{

    public void run(){
        System.out.println("Inside run method");
    }
    public static void main(String[] args) {

        CreateNewThread createNewThread = new CreateNewThread();
        createNewThread.start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Annonymous class");
            }
        });

        t1.start();
    }
}
