package com.aujas.Multithreading;

public class StringImmutability {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat(" Dharmpal");
        System.out.println("Final string "+ s);
    }
}
