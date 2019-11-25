package com.aujas.designpattern.com.singleton;

public class UseLogger {
    public static void main(String[] args) {

        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();

        System.out.println(logger1.hashCode());
        System.out.println(logger2.hashCode());
    }
}
