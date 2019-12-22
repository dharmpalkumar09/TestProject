package com.aujas.Multithreading;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeDemo extends Thread {
    static ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
    public static void main(String[] args) {

        FailSafeDemo failSafeThread = new FailSafeDemo();
        failSafeThread.start();

        map.put(0,"Dharmpal");
        map.put(2,"Kumar");
        map.put(3,"Suraj");
        map.put(4,"Sharma");


        Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
        while (itr.hasNext()){

            Map.Entry entry = itr.next();
            System.out.println("Key : "+entry.getKey() + " Value: "+entry.getValue());

            try {
                Thread.sleep(100); // millisecond
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
        map.put(9,"New Entry");
    }
}
