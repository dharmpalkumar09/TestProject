package com.aujas.test;

import java.util.*;

class Student {
    String  name;
    int rollNumber;

    Student(String name,int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "[Name : "+this.name+" RollNumber "+this.rollNumber+"]";
    }
}
class container<T extends Number> {

    T value;
}
public class GenericDemo {
    public static void main(String[] args) {


        List<Student> list = new ArrayList<>(); // List is interface and ArrayList is calss
        list.add(new Student("Dharmpal",1));
        list.add(new Student("Shishupal",5));
        list.add(new Student("Deepak",3));


       /* Collection values = new ArrayList<>();
        values.add(2);
        values.add("ram");
        values.add(2.5f);

        Iterator itr = values.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());

        }
*/

        Comparator<Student> sortByRollNumber = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.rollNumber>o2.rollNumber) return 1;
                return -1;
            }
        };
       Comparator<Student> comp = new comparatorDemo();
        Collections.sort(list,sortByRollNumber);
        System.out.println(list);

        HashMap<String,String> map = new HashMap<>();
        map.put("Name","value");
        map.put("Rollnumber","INteger");

        for (Map.Entry<String,String> entry: map.entrySet()){

        }










    }
}
