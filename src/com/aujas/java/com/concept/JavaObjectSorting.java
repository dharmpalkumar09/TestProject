package com.aujas.java.com.concept;

import java.util.Arrays;

public class JavaObjectSorting {

    static class Employee implements Comparable<Employee>{
        @Override
        public int compareTo(Employee o) {

            return this.id - o.id;
        }

        private int id;
        private String name;
        private int age;
        private long salary;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public long getSalary() {
            return salary;
        }

        public Employee(int id, String name, int age, long salary) {
            this.id = id;
            this.name =name;
            this.age = age;
            this.salary = salary;

        }

    }

    public static void main(String[] args) {
        Employee[] emplist = new Employee[5];
        emplist[0] = new Employee(1,"Dharmpal",28,20000);
        emplist[0] = new Employee(0,"Manoj",25,40000);
        emplist[0] = new Employee(2,"Sunil",224,50000);
        emplist[0] = new Employee(3,"Suraj",24,30000);

        Arrays.sort(emplist);



    }


}
