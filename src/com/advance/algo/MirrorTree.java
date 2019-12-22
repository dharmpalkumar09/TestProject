package com.advance.algo;

public class MirrorTree {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eignt = new TreeNode(2);

        root.left = two;
        root.rignt = three;
        two.rignt = four;
        two.left = five;

        three.left = six;
        three.rignt = seven;
        System.out.println("Tree data is: ");
        printTree(root);
        mirrorTree(root);
        System.out.println("\n After mirror" );
        printTree(root);

    }

    public static void mirrorTree(TreeNode root){
        if (root == null)return;
        TreeNode temp = root.left;
        root.left = root.rignt;
        root.rignt = temp;
        if (root.left != null) mirrorTree(root.left);
        if (root.rignt != null) mirrorTree(root.rignt);


    }
    public static void printTree(TreeNode root){

        if (root == null) return;
        System.out.print(root.data +" ");
        if (root.left != null)printTree(root.left);
        if (root.rignt != null)printTree(root.rignt);

    }
}

class TreeNode{

    int data;
    TreeNode left;
    TreeNode rignt;

    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.rignt = null;
    }
}
