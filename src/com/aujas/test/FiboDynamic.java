package com.aujas.test;

/*
Time complexity is exponential
 */
public class FiboDynamic {

    public static void main(String[] args) {

        System.out.println("Fibo of 5 is :"+nthfiborecursive(4));
        System.out.println("fib for 9 using inerative "+ nthfiboiterative(9));
    }

    private static int nthfiborecursive(int n){
        if (n<=1) return n;
        return nthfiborecursive(n-1)+nthfiborecursive(n-2);
    }

    private static int nthfiboiterative(int n){

        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i= 2;i<=n;i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println(" nth value is "+n);
        return fib[n];
    }
}
