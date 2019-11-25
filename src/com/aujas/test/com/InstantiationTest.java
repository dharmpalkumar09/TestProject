package com.aujas.test.com;

class T1{
    T1(){
        System.out.println("inside T1 ");
    }
}

public class InstantiationTest {
    T1 t1 = new T1();

    InstantiationTest(){
        t1 = new T1();
    }

    public static void main(String[] args) {

        InstantiationTest instantiationTest = new InstantiationTest();
    }
}
