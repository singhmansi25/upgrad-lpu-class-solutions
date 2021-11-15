package Datastructures.KT;



public class SpiralTraversals {

    static Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static int calculateHeight(Node currentNode) {

        if (currentNode == null) {
            return 0;
        }
        int leftHeight = calculateHeight(currentNode.left);
        int rightHeight = calculateHeight(currentNode.right);

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    public static void main(String[] args) {

        root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.left.left = new Node(8);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.left.left = new Node(9);
        root.right.right = new Node(7);

        int height = calculateHeight(root);
        boolean flip = false;
        for(int i = 1; i <=height; i++) {
            printCurrentLevel(root, i, flip);
            flip = !flip;
        }

    }

    private static void printCurrentLevel(Node currentNode, int level, boolean flip) {

        if(currentNode == null) {
            return;
        }
        if(level == 1) {
            System.out.print(currentNode.data + " ");

        }else if(level > 1) {
            if(flip) {
                printCurrentLevel(currentNode.left, level-1, flip);
                printCurrentLevel(currentNode.right, level-1, flip);
            } else {
                printCurrentLevel(currentNode.right, level-1, flip);
                printCurrentLevel(currentNode.left, level-1, flip);
            }
        }
    }
}
