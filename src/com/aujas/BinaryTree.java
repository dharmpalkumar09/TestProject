package com.aujas;

import java.util.*;

public class BinaryTree {

    static class Node{

        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }



    static Node root;

    public static void printInorder(Node root){

        if (root != null){
            printInorder(root.left);
            System.out.println(root.data);
            printInorder(root.right);
        }
    }

    public static void printPreorder(Node root){

        if (root != null){
            System.out.println(root.data);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    // Level Order traversal


    public static void levelorder(Node root){

        if (root !=null){
            //System.out.println(root.data);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (queue.size()>0){
                Node temp = queue.poll();
                System.out.println(temp.data+ " ");
                if (temp.left != null){queue.add(temp.left);}
                if (temp.right != null) {queue.add(temp.right);}

            }
        }
    }

    public static void printeachlevel(Node node){

        if (node != null){
            Queue<Node> queue = new LinkedList<>();
            queue.add(node);
            queue.add(null);
            int nullCount = 0;
            while (queue.size()>0 && nullCount<2 ){
                Node tempNode = queue.poll();
                if (tempNode !=null) {
                    System.out.print(tempNode.data+" ");
                    if (tempNode.left != null) queue.add(tempNode.left);
                    if (tempNode.right != null) queue.add(tempNode.right);
                    nullCount = 0;

                }
                else {
                    queue.add(null);
                    System.out.println();
                    nullCount++;
                }

            }
        }

    }


    public static void verticleOrder(Node node,int hd, TreeMap<Integer,Vector<Integer>> m){

        // 1. Find horizontal distance of each node .

        // Base case
        if (node == null) return;

        Vector<Integer> nodes = m.get(hd);
        if (nodes == null){
            nodes = new Vector<>();
            nodes.add(node.data);
        }else {
            nodes.add(node.data);
        }
        m.put(hd,nodes);
        verticleOrder(node.left,hd-1,m);
        verticleOrder(node.right,hd+1,m);
    }



    public static void mirrorTree(Node node){
        // Using level order traversal
        if (node == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (queue.size()>0){

            Node current = queue.peek();
            queue.remove();
            Node temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.left != null)queue.add(current.left);
            if (current.right !=null)queue.add(current.right);

        }
    }

    public static void reverseLevelOrderTraversal(Node root){
        if (root == null) return;
        Stack<List<Node>> stack = new Stack<>();
        List<Node> levelNodes = new ArrayList<>();
        levelNodes.add(root);
        Queue<Node> queueNodes = new LinkedList<>();
        queueNodes.add(root);
        queueNodes.add(null);
        stack.push(levelNodes);
        levelNodes = new ArrayList<>();
        int consecutiveNull = 0;

        while (consecutiveNull <2){

            Node temp = queueNodes.poll();
            if (temp != null){
                if (temp.left != null){
                    levelNodes.add(temp.left);
                    queueNodes.add(temp.left);
                }if (temp.right != null){
                    levelNodes.add(temp.right);
                    queueNodes.add(temp.right);
                }
            }else{
                queueNodes.add(null);
                System.out.println(" levelNodes "+ levelNodes);
                if (levelNodes.size()>0)stack.push(levelNodes);
                System.out.println(" stack: "+stack);
                levelNodes = new ArrayList<>();
                consecutiveNull++;

            }

        }

        System.out.println("Reverse Level order Traversal "+stack );
        while (stack.size()>0){
            levelNodes = stack.pop();
            for (int i=0;i<levelNodes.size();i++)System.out.print(levelNodes.get(i).data+" ");
            System.out.println();
        }


    }
    public static void heightOftree(Node roor){

    }

    public static void printleafNode(Node root,int edgeCount){

        if (root == null) return;
        if (root.left == null && root.right == null){
            System.out.println(root.data+ " Edge count "+ edgeCount);
        }
        printleafNode(root.left,edgeCount++);
        printleafNode(root.right,edgeCount++);
    }
    public static void main(String[] args) {
/*

        Node node =new Node(10);

        root = node;

        Node leftNode = new Node(11);

        root.left = leftNode;

        Node rightNode = new Node(12);

        root.right = rightNode;

        Node leftLeftNode = new Node(13);
        leftNode.left = leftLeftNode;

        Node leftRightNode = new Node(14);
        leftNode.right = leftRightNode;

*/

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        /*root.right.right = new Node(8);
        root.right.left.left = new Node(6);
        root.right.left.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);*/

        /*System.out.println("Tree nodes: ");
        System.out.println(" Inorder: ");
        printInorder(root);
        System.out.println(" Preorder: ");
        printPreorder(root);
        System.out.println("Level Order Traversal: ");
        levelorder(root);

        System.out.println("Each level node: ");
        printeachlevel(root);

        TreeMap<Integer,Vector<Integer>> m = new TreeMap<>();
        verticleOrder(root,0,m);

        //Set entryset = m.entrySet();

        for (Map.Entry entry: m.entrySet()){

            //System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        //mirrorTree(root);

        System.out.println("Tree after mirror : ");
        printeachlevel(root);

        reverseLevelOrderTraversal(root);*/

        System.out.println("Leaf Node is : ");
        printleafNode(root,0);
        System.out.println(" Tree height "+treeheight(root));

    }

    public static int treeheight(Node root){
        if (root == null)return 0;
        int lDepth = treeheight(root.left);
        int rDepth = treeheight(root.right);

        if (lDepth>rDepth) return lDepth+1;
        return rDepth+1;

    }

    public static int findheight(Node root){

        return 0;
    }
}
