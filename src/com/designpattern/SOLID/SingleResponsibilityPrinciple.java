package com.designpattern.SOLID;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

// SRP : single class
public class SingleResponsibilityPrinciple {

    public static void main(String[] args) throws IOException {
        Journal journal = new Journal();
        journal.addEntry("I drived today");
        journal.addEntry("I ate today");

        System.out.println(journal);

        String filename = "journal.txt";
        new Persistance().saveToFile(filename,journal,false);
        Runtime.getRuntime().exec("C:\\Windows\\system32\\notepad.exe"+ filename);
    }
}


class Journal{

    private static int count = 0;
    private final List<String> entry = new ArrayList<>();

    public void addEntry(String text){
        entry.add(""+(++count)+": "+text);
    }

    public void removeEntry(int index){
        entry.remove(index);
    }

    public void save(String filename) throws FileNotFoundException {

        try(PrintStream out = new PrintStream(filename)){
            out.println(toString());
        }
    }

    @Override
    public String toString(){
        return String.join(System.lineSeparator(),entry);
    }
}

class Persistance{

    public void saveToFile(String filename,Journal journal,boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(filename).exists()){
        try(PrintStream out = new PrintStream(filename)){
            out.println(journal.toString());
        }
        }
    }

}
