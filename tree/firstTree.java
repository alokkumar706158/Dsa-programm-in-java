import java.util.*;
class Node {

    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;

    }
}

public class firstTree {

    public static void main(String[] args) {

        //          3
        //        /   \
        //      4       2
        //     / \     / \
        //   -1  1   6   9  
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        display(a);
        System.out.println();
        System.out.println(size(a));        //for size
        System.out.println(sum(a));         //for sum
        System.out.println(max(a));          //for max
        System.out.println(levels(a));     //for levels
        levelOrder(a);   //for levelOrder

    }

    public static void display(Node root) {
        //traverse
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    //size
    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSize = size(root.left);
        int rightSize = size(root.right);
        return 1 + leftSize + rightSize;

    }
    //sum

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }

    //max
    public static int max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));

    }

    //levels
    public static int levels(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(levels(root.left), levels(root.right));

    }

    //for levelorder
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.size() > 0) {
            Node front = q.remove();
            System.out.print(front.val + " ");
            if (front.left != null) {
                q.add(front.left);
            }
            if (front.right != null) {
                q.add(front.right);
            }
        }
        System.out.println();
    }

}
