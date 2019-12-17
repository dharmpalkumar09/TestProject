package com.aujas.Multithreading;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        // Number of worker thred is 20.

        ArrayList<MyTask> list  = new  ArrayList<>(100);
        for (int i = 0;i<100;i++){
            list.add(new MyTask());
        }

        for (MyTask task : list){
            System.out.println("Inside Thread Pool");
            executorService.submit(task);
        }

        executorService.shutdown();
    }

}


class MyTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread : "+ Thread.currentThread().getName() + " is executing the task");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
