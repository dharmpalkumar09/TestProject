package com.aujas.Multithreading;

// This is fail fast.

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentMidiDemo extends Thread{

    private static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        ConcurrentMidiDemo concurrentMidiDemo = new ConcurrentMidiDemo();
        concurrentMidiDemo.start();
        list.add("Dharmpal");
        list.add("Kumar");
        list.add("Suraj");
        list.add("Sharma");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            String str = itr.next();
            try {
                System.out.println("Main thread Iterator:> "+str);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        list.add("Vishnu");
       list.add("Dashavatara");
    }
}
