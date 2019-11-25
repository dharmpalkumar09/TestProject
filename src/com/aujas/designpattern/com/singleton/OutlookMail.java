package com.aujas.designpattern.com.singleton;

public class OutlookMail implements Email{

    @Override
    public void sendMail() {
        System.out.println( "send mail to outlook server" );
    }
}
