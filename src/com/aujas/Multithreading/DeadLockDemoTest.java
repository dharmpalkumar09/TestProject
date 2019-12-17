package com.aujas.Multithreading;

public class DeadLockDemoTest {

    Resource resource1 = new Resource();
    Resource resource2 = new Resource();


    public void method1(){
        synchronized (resource1){
            System.out.println("Lock acquire on resource1 by thresd: "+Thread.currentThread());
            synchronized (resource2){
                System.out.println("Lock acquired on resource2 by Thread:  "+ Thread.currentThread());
            }
        }

    }


    public void method2() {
        synchronized (resource2) {
            System.out.println("Lock acquire on resource1 by thresd: " + Thread.currentThread());
            synchronized (resource1) {
                System.out.println("Lock acquired on resource2 by Thread:  " + Thread.currentThread());
            }
        }
    }
        public static void main(String[] args) {
        DeadLockDemoTest deadLockDemoTest = new DeadLockDemoTest();

         Thread thread1 = new Thread(new T(deadLockDemoTest));
            Thread thread2 = new Thread(new T1(deadLockDemoTest));
            thread1.start();
            thread2.start();



    }

}

class Resource{}


class T implements Runnable{

    DeadLockDemoTest deadLockDemoTest;
    T(DeadLockDemoTest dead){
        this.deadLockDemoTest = dead;
    }
    @Override
    public void run() {
        deadLockDemoTest.method1();
    }
}


class T1 implements Runnable{

    DeadLockDemoTest deadLockDemoTest;

    public T1(DeadLockDemoTest deadLockDemoTest) {
        this.deadLockDemoTest = deadLockDemoTest;
    }

    @Override
    public void run() {
        deadLockDemoTest.method2();
    }
}