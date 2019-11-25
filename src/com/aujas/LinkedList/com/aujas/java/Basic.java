package com.aujas.LinkedList.com.aujas.java;

/*
Object
Class
Inheritance
Polymorphism
Abstraction
Encapsulation
 */
class parent{
    public parent(int a){

    }
    parent(){
        System.out.println("Parent constructor");
        }
    void printhello(Object str){
        System.out.println("Hello, This is parent calss   "+str.toString());
    }
}

class child extends parent{

    public child(){
        System.out.println();
    }
    void printhello(String str){
        System.out.println("Hello This is child class"+ str);
    }
}

public class Basic {
public static int returnexception(){
    int a = 10;
    try{
        a = a/0;
    }catch (Exception ex){
        System.out.println("exception occured");
        return 10;
    }finally{
        return 5;
    }

}

    public static void main(String[] args) {
        parent pr = new child();
       pr.printhello("dharmpal ");
        System.out.println(returnexception());


    }

}
