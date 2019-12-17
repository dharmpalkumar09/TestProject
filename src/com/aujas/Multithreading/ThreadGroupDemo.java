package com.aujas.Multithreading;

public class ThreadGroupDemo {

    public static void main(String[] args) {
        System.out.println("Thread group name : "+Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        System.out.println(Thread.currentThread().getThreadGroup().activeCount());
        System.out.println(Thread.currentThread().getThreadGroup().activeGroupCount());
        Thread.currentThread().getThreadGroup().list();

        //

        ThreadGroup threadGroup = new ThreadGroup("Consumer Group"); // Parent thread group for this thread group will be current running thread.
        // Main thrad will be parent thread group for the above one.

        ThreadGroup subgroup  =  new ThreadGroup(threadGroup,"subgroup");

        System.out.println(threadGroup.getParent().getName());
        System.out.println(subgroup.getParent().getName());

    }
}
