package com.aujas.Multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ThreadInterCommunication {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        producer producer = new producer(queue);
        consumer consumer = new consumer(queue);
        producer.start();
        consumer.start();


    }

}

class producer extends  Thread{

    Queue<Integer> q;

    producer(Queue<Integer> queue){
        this.q = queue;
    }
    public void run(){

        while (true) {
            synchronized (q){
                if (q.size() == 3) {
                    try {
                        System.out.println("Queue is full and waiting for consumer ");
                        q.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Random random = new Random();
                int i = random.nextInt();
                q.add(i);
                q.notify();
                System.out.println("Item produced "+i);
            }

        }


    }
}


class consumer extends Thread{

    Queue<Integer> q;
    consumer(Queue<Integer> queue){
        this.q = queue;
    }

    public void run(){

        while(true){

            synchronized (q){
                if (q.isEmpty()){
                    System.out.println("Queue is empty :  waiting for producer to produce");
                    try {
                        q.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Item is consumed "+q.remove() );
                q.notify();
            }

        }
    }
}
