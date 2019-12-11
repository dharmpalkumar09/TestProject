package com.aujas.conm.java.exceptioncheck;

public class Parentclass {

    public void m1() throws CustomException {

        int a = 10;
        if(a==10) throw new CustomException("Value of A is 10");

    }

    public void M2() throws CustomException {

        m1();

    }
}
