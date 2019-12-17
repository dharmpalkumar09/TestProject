package com.aujas.Multithreading;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo {

    public static void main(String[] args) {

        ExecutorService eService = Executors.newFixedThreadPool(20);

        ArrayList<Task> tasklist = new ArrayList<>(100);
        for (int i =0; i<100;i++){
            tasklist.add(new Task());
        }
        for (Task task:tasklist){
            System.out.println("inside for loop ");
            System.out.println("Return result is "+eService.submit(task)); // Return type of Executorservice.submit is FutureTask.
        }

            eService.shutdown();
    }
}

class Task implements Callable {
    @Override
    public String call(){
        System.out.println("Thread : "+ Thread.currentThread().getName() + " is executing this task");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Completed";
    }
}
