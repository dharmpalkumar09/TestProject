package com.aujas.Multithreading;

public class CounterDemo {

    public static void main(String[] args) {
        Counter counter = new Counter();

        /*for (int i=0;i<1000;i++){
            counter.increament();
        }

        for (int i=0;i<1000;i++){
            counter.decrement();
        }

        System.out.println(counter.value());
*/
        IncreamentingThread increamentingThread = new IncreamentingThread(counter);
        DecreamentingThread decreamentingThread = new DecreamentingThread(counter);

        increamentingThread.start();
        decreamentingThread.start();

        try {
            increamentingThread.join();
            decreamentingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.value());

    }
}

class IncreamentingThread extends  Thread{

    Counter counter;
    IncreamentingThread(Counter counter){
        this.counter = counter;
    }


    public void run(){
       // System.out.println("Onside IncreamentingThread ");
        for (int i=0;i<1000;i++){
            counter.increament();
        }
    }
}

class DecreamentingThread extends  Thread{

    Counter counter;
    DecreamentingThread(Counter counter){
        this.counter = counter;
    }


    public void run(){
        //System.out.println("Onside DecreamentingThread ");
        for (int i=0;i<1000;i++){
            counter.decrement();
        }
    }
}
class Counter{
    private int c = 0;

  synchronized   public void increament(){ // Implict Lock
        //System.out.println("Inc....");
        c++;
    }

   synchronized public void decrement(){ // Implicit Lock
        //System.out.println("Dec..... ");
        c--;
    }

    public int value(){
        return c;
    }
}
