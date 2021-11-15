package Datastructures.KT;


public class CousinProblem {

    static Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
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

        Node person1 = root.left.right;
        Node person2 = root.left.left;

        if (isCousin(root, person1, person2)) {
            System.out.println("They are cousins");
        } else {
            System.out.println("They are not cousins");
        }

    }

    private static boolean isCousin(Node root, Node person1, Node person2) {

        if (checkLevel(root, person1, 1) == checkLevel(root, person2, 1)) {

         if(isSiblings(root, person1, person2)) {
             return false;
         }
         else {
             return true;
         }

        } else {
            return false;
        }
    }

    private static boolean isSiblings(Node root, Node person1, Node person2) {

        if(root == null) {
            return false;
        }
        if((root.left == person1 && root.right == person2)
        || (root.right == person1 && root.left == person2)
        || isSiblings(root.left, person1, person2)
        || isSiblings(root.right, person1, person2)) {
            return true;
        } else {
            return false;
        }
    }

    private static int checkLevel(Node root, Node currentPerson, int level) {

        if (root == null) {
            return 0;
        }
        if (root == currentPerson) {
            return level;
        }
        int newLevel = checkLevel(root.left, currentPerson, level + 1);

        if (newLevel != 0) {
            return newLevel;
        }
        newLevel = checkLevel(root.right, currentPerson, level + 1);
        return newLevel;
    }

}
