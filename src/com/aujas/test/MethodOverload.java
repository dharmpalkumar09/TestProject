package com.aujas.test;

public class MethodOverload {

    public static void m1(int a){

        System.out.println("number of argument is same but have different parameter type. Type is Int");
    }

    public static void m1(double b){ // 1. int 2. long 3. float 4. double
        System.out.println("number of argument is same but have different parameter type. Type is Double");
    }
    public static void main(String[] args) {

        m1(4);
        m1(5.5);
        //if (firstexpression() || secondexpression()) System.out.println("First condition is false , checking for second condition");

    int a = 20+25 -30;
    }
    public static boolean firstexpression(){

        System.out.println("Inside first condition");
        return false;
    }

    public static boolean secondexpression(){

        System.out.println("Inside second condition");
        return true;
    }
}
