package com.aujas.LinkedList;

import sun.awt.image.ImageWatched;

public class LinkedList {


    static class Node{
        int data;
        Node nextNode;

        Node(int data){
            this.data = data;
            this.nextNode = null;

        }
    }

    Node head;

    public static LinkedList insert(LinkedList list, int data){
        if (list.head == null){
            Node node = new Node(data);
            list.head = node;
        }else{
            Node headNode = list.head;
            while(headNode.nextNode !=null)headNode = headNode.nextNode;

            Node newNode = new Node(data);
            headNode.nextNode = newNode;

        }
        return list;

    }

    public static void printnode(LinkedList list){
        if(list.head != null){
            Node firstNode = list.head;
            while (firstNode != null){
                System.out.println(firstNode.data);
                firstNode = firstNode.nextNode;

            }
        }
    }

    public static LinkedList reverseList(LinkedList list){

        if(list.head != null){
         Node head = list.head;
            Node prev = null;
            Node curr = head;
            Node next = null;
            while (curr !=null){
                next = curr.nextNode;
                curr.nextNode = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
            list.head = head;

        }
        return list;
    }

    public static int middleElement(LinkedList list){

        if (list.head != null){
            Node moveByOne = list.head;
            Node moveByTwo = list.head;
            while(moveByTwo.nextNode != null && moveByTwo != null){
                moveByOne = moveByOne.nextNode;
                moveByTwo = moveByTwo.nextNode.nextNode;
            }
            return moveByOne.data;
        }
        return -1;
    }

    public static boolean isListCircular(LinkedList list){

        if(list.head !=  null){
            Node slowMove = list.head;
            Node fastMove = list.head;

            while(slowMove != null && fastMove != null && fastMove.nextNode != null){
                slowMove = slowMove.nextNode;
                fastMove = fastMove.nextNode.nextNode;
                if (slowMove == fastMove) return true;
            }

        }
        return false;
    }

    public static void makeListCircular(LinkedList list){


    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);
        list = insert(list,7);
        list = insert(list,6);


        printnode(list);
        //reverseList(list);
        //System.out.println("After reverse");
        //printnode(list);
        System.out.println("Moddle element is "+middleElement(list));


    }
}
