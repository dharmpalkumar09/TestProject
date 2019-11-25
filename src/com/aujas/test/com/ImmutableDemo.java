package com.aujas.test.com;

import java.util.HashMap;

final class immutabletest{
     final int rollno;
     final String Name;

     public immutabletest(int rollno, String name){

         this.rollno =rollno;
         this.Name = name;
     }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Roll No "+rollno +" Name "+Name;
    }
}



public class ImmutableDemo {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        System.out.println();
        String strNull = null;
        System.out.println(" Hash code for null string "+ strNull.hashCode());
        String str = "Dharmpal Kumar";

        System.out.println(str.hashCode());
        String newstr = new String("Dharmpal Kumar");

        System.out.println(newstr.hashCode());
        immutabletest immutabletest = new immutabletest(10, null);
        System.out.println(immutabletest.hashCode());
        System.out.println(immutabletest.toString());

        immutabletest immutabletest1 = new immutabletest(20,"Dharmpal");
        System.out.println(immutabletest1.hashCode());
        System.out.println(immutabletest1.toString());
    }
}
