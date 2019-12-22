package com.advance.algo;
/*
As we dont have head so what we can do is swap the data part of node till the node becomes null
 */
public class DeleteNodeWithoutHead {

    public static void main(String[] args) {


    }

    public static void deleteNode(Node node){

        if (node == null) return;;
        while (node.next!=null){
            int temp = node.data;
            node.data = node.next.data;
            node.next.data = temp;
            node = node.next;
        }
    }
}

class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}