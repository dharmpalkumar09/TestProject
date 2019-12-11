package com.aujas.Multithreading;

// Extends Thread class
// by Implementing runnabale interface

public class CreatingThread {
    public static void main(String[] args) {
        worker1 w1 = new worker1();
        worker2 w2 = new worker2();
        w1.run();;
        w2.run();


        Runnable r1 = () -> {
            for(int i=0;i<10;i++) {
                System.out.println("This is worker 1:  " + i);
            }
        };

        Runnable r2 = () ->{
            for(int i=0;i<10;i++){
                System.out.println("This is worker 2:  "+i);
            }
        };
        r1.run();
        r2.run();



    }

}

class worker1 extends Thread{

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("This is worker 1:  "+i);
        }
    }
}

class worker2 extends Thread{


    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("This is worker 2:  "+i);
        }
    }
}

