package Datastructures.CH;

public class BinarySearchTree {

    static Node root;

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node search(Node currentNode, int key) {

        if(currentNode == null || currentNode.data == key) {
            return currentNode;
        }
        if (key > currentNode.data) {
            return search(currentNode.right, key);
        } else {
            return search(currentNode.left, key);
        }

    }

    public static void main(String[] args) {

//        root = new Node(5);
//        root.left = new Node(3);
//        root.left.left = new Node(1);
//        root.left.left.right = new Node(2);
//        root.left.right = new Node(4);
//        root.right = new Node(8);
//        root.right.left = new Node(6);
//        root.right.left.right = new Node(7);

        int[] arr = {5, 1, 7, 4,2,9,8};
        for(int i = 0; i < arr.length; i++) {
            insertNode(arr[i]);
        }

        Node result = search(root, 3);
        if(result != null) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

    }

    private static void insertNode(int value) {


        root = insertIntoTree(root, value);
    }

    private static Node insertIntoTree(Node root, int value) {

        if(root == null) {
            root = new Node(value);
            return root;
        }
        if(value < root.data) {
            root.left = insertIntoTree(root.left, value);
        } else {
            root.right = insertIntoTree(root.right, value);
        }
        return root;
    }

}

