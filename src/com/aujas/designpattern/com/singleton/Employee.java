package com.aujas.designpattern.com.singleton;

public class Employee {
    String firstName;
    String lastName;
    int id;
    Email email;

    public Employee(String firstName,String lastName, Email mail){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = mail;
    }

    public void sendMail(){
        email.sendMail();
    }
}
