package com.aujas.test.com;

class parent
        {
            public parent(){
                System.out.println("Super class constructor ");
            }
            public void test(){
                System.out.println("Test methof inside super class");
            }

             void displayname(Object obj){
                System.out.println("Displaying name");
            }

        }

 class child extends parent{

    public void  parent(){

    }

     @Override
     void displayname(Object obj) {
         super.displayname(obj);
     }


     public void displayname(String str){
        System.out.println("displaying name in sub class");
    }
 }
public class UpcastingandDowuncasting {

    public static void objectcall(Object obj){
        System.out.println("Object receiver "+obj);
    }

    public static void objectcall(String str){
        System.out.println( "String receiver  "+str);
    }

    public static void main(String[] args) {
        //objectcall(new String("Dharmpal Kumar"));

        UpcastingandDowuncasting upcastingandDowuncasting =new UpcastingandDowuncasting();
        String str = new String("Dharmpal");
        objectcall(str);
    }

}
