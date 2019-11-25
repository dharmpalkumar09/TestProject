package com.aujas.test.com;

class Test {
    protected int x, y;
    // protected int x, y;

    public  Test(){
        System.out.println("This is the default constructor ");
        //return -1;
    }
}
public class TrickyQuestions {
    public static void main(String[] args){
        int $ = 4;
        int $_ = 'a';

        System.out.println($_);
        System.out.println($);

        Test t = new Test();
        System.out.println(t.x + " "+ t.y);

        new TrickyQuestions().main();

    }

    public  void main(){
        System.out.println();
        method();
    }

    public   void method(){
        System.out.println(" without main");
    }
}
