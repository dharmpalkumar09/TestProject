package com.aujas.Multithreading;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {

    // There are two constructor for CopyOnWriteArraySet one wthout paramaterized
    // and another onw with paramatereised which holds Collection object.
    public static void main(String[] args) {
        CopyOnWriteArraySet<String>  set = new CopyOnWriteArraySet<>();
        ArrayList<String> list = new ArrayList<>();
        CopyOnWriteArraySet<String> set2nd = new CopyOnWriteArraySet<>(list);


        list.add("Basic");
        list.add("Strong");
        list.add("Strong");
        list.add("Basic");


    }
}
