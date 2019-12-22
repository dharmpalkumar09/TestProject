package com.aujas.Multithreading;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put(0,"Basic");
        concurrentHashMap.put(1,"Strong");
        // putifAbsent is method add new entry only if key not exist.

        concurrentHashMap.putIfAbsent(0,"basic");

    }
}
