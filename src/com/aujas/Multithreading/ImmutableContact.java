package com.aujas.Multithreading;

final public class ImmutableContact {

    private final String name;
    private final String contact;

    public ImmutableContact(String name,String contact){
        this.name  = name;
        this.contact = contact;
    }
    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }
}
