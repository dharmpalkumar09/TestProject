package com.aujas.test;

import java.util.Comparator;

public class comparatorDemo implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        if (o1.name.compareTo(o2.name)>1)return 1;
        return -1;
    }
}
