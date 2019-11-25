package com.aujas;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class FailSafe {

    public static void main(String[] args) {

        HashMap<String,String> student = new HashMap<>();

        student.put("Ram","001");
        student.put("Lakshaman","002");
        student.put("Sita","003");
        student.put("Satrughan","004");
        student.put("Bharat","005");

        Set<Map.Entry<String,String>> entry= student.entrySet();

        for (Map.Entry entr : entry){

            System.out.println(entr.getKey());
            System.out.println(entr.getValue());
        }



        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Iterator<Integer> itr = integers.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            integers.remove(itr.next());
        }

        System.out.println("");


    }

}
