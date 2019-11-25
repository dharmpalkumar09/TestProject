package com.aujas.test.com.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class guest implements Comparator<guest> {
    @Override
    public int compare(guest o1, guest o2) {
        if (o1.depart.compareTo(o2.depart) > 1) return 1;
        return -1;
    }

    String arrive;
    String depart;

    guest(String arrive ,String depart){
        this.arrive = arrive;
        this.depart = depart;
    }
    @Override
    public String toString() {
        return "Arrive : "+ arrive + " Depart : "+depart;
    }
}
public class MaximumGestAtTime {

    public static void main(String[] args) {
        List<guest> guestList = new ArrayList<>();
        guestList.add(new guest("10:50","11:00"));
        guestList.add(new guest("10:50","11:00"));
        guestList.add(new guest("10:50","11:00"));
        guestList.add(new guest("10:50","11:00"));

    }


}
