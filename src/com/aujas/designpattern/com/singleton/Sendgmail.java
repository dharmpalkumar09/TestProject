package com.aujas.designpattern.com.singleton;

public class Sendgmail implements Email {

    @Override
    public void sendMail() {
        System.out.println( " send mail to gmail server" );
    }
}
