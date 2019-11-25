package com.aujas.test;

public class FibonacciSeries {

    public static int fibo(int i){

        if (i == 1 || i == 0) return 1;
        else{
            return fibo(i-1)+fibo(i-2);
        }
    }

    public static void main(String[] args) {
        int data = 5;
        int i=0;
        while (i<=data){System.out.println(fibo(i));i++;}


    }
}
// 1 1 2 3
// f(n) = f(n-1)+f(n-2)
//f(0) = 1
//f(1) = 1
// f(2) = f(1) + f(0)
// f(3) = f(1)+f(2)