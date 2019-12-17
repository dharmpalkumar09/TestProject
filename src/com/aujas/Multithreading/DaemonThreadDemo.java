package com.aujas.Multithreading;

public class DaemonThreadDemo {
    public static void main(String[] args) {

        Thread daemon = new Thread(new DeamonThread(),"Daemon Thread");
        daemon.setDaemon(true);
        daemon.start();
        System.out.println(" Main Thread completed ");
    }
}

class DeamonThread implements Runnable{

    @Override
    public void run() {
        try{
            while(true){
                System.out.println("Daemon thred is running");
            }
        }finally {

            System.out.println("Daemon Thred execution completed");
        }

    }
}
