package com.aujas.conm.java.exceptioncheck;

public class ChildClass extends  Parentclass{


    public static void main(String[] args) {
        try{
            new ChildClass().M2();
            System.out.println("Statement after child method call");
        }catch (Exception ex){
            System.out.println("Inside main catch block");
            ex.printStackTrace();
        }
    }

}
