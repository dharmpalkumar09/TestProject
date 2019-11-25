package com.aujas.Binarytree;

public class ConstructBinaryTree {

    static int preIndex = 0;
    static class Node{

        Node left;
        Node right;
        int data;
    }

    static Node newNode(int data){

        Node temp = new Node();
        temp.left = null;
        temp.right = null;
        temp.data = data;

        return temp;
    }

    public static int search(int[] in,int instart,int inend,int data){

        for (int i = instart;i<= inend;i++){
            if (in[i] == data) return i;
        }
        return -1;
    }
public static Node buildTree(int[] in,int[] pre, int instart, int inend){

        if (instart > inend || preIndex == pre.length) return null;

   // System.out.println(" preIndex  "+preIndex);

        Node node = newNode(pre[preIndex++]);

        if (instart == inend) return node;

        int inIndex = search(in,instart,inend,node.data);
    System.out.println(" inIndex: "+inIndex);

        node.left = buildTree(in,pre,instart,inIndex-1);
        node.right = buildTree(in,pre,instart+1,inend);
        return node;
}

    public static void postorder(Node node){

        if (node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data);
        }
    }

    public static void main(String[] args) {

        int inOrder[] = {4, 2, 5, 1, 3};
        int preOrder[] = {1, 2, 4, 5, 3};
        int postOrder[] = {4, 5, 2, 3, 1};

        Node newtree = buildTree(inOrder,preOrder,0,inOrder.length-1);
        System.out.println(" Post order ");
        postorder(newtree);

    }
}
