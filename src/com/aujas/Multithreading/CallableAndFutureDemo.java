package com.aujas.Multithreading;

import java.util.concurrent.Callable;

public class CallableAndFutureDemo {

}

class Factorial implements Callable{

    private int num;
    Factorial(int num){

        this.num = num;
    }
    @Override
    public Long call() throws Exception{

        return null;
    }
}
