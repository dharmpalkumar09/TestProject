package com.aujas.Binarytree;

public class HeapAlgo {

    static class Node{

        Node left;
        Node right;
        int data;
    }

    public static Node addNode(int data){
        Node tempNode = new Node();
        tempNode.left = null;
        tempNode.right = null;
        tempNode.data = data;
        return tempNode;
    }
    static int arrayIndex = 0;
    public static Node buildHeap(int[] data){

        System.out.println("arrayIndex: "+arrayIndex);
        if (data == null || data.length< arrayIndex*2+1 || data.length< arrayIndex*2+2) return null;
        Node node = addNode(data[arrayIndex]);
        if (data.length == 1) return node;
        if (data.length > arrayIndex*2+1)node.left = addNode(data[arrayIndex*2+1]);
        if (data.length > arrayIndex*2+2)node.right = addNode(data[arrayIndex*2+2]);
        arrayIndex++;
        buildHeap(data);
        return node;
    }

    public static void inorder(Node node){

        if (node == null) return;

        System.out.println(node.data);
        inorder(node.left);
        inorder(node.right);
    }
    public static void main(String[] args) {
        int[] data = {4,10,3,5,1};
        Node node = buildHeap(data);
        System.out.println("Build heap is ");
        inorder(node);
    }


}
