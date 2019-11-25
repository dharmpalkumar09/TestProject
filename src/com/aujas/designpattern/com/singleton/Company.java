package com.aujas.designpattern.com.singleton;

public class Company {
    public static void main(String[] args) {

        Email outlookMail = new OutlookMail();
        Employee employee1 = new Employee("Dharmpal","Kumar",outlookMail);
    }
}
