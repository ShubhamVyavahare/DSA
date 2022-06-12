package binarytree;

/**
 * Create a binary tree using classes and objects in java
 * Implement pre, post and inOrder traversal
 * <p>
 * Output :
 * Pre-order traversal of Binary Tree : A B D E C F
 * Post-order traversal of Binary Tree : D E B F C A
 * In-order traversal of Binary Tree : D B E A F C
 */

class Node {
    char key;
    Node left, right;

    public Node(char key) {
        this.key = key;
    }
}

class TreeTraversal {
    Node root;

    void preOrderTraversal(Node n) {
        if (n != null) {
            System.out.print(n.key + " ");
            preOrderTraversal(n.left);
            preOrderTraversal(n.right);
        }
    }

    void postOrderTraversal(Node n) {
        if (n != null) {
            postOrderTraversal(n.left);
            postOrderTraversal(n.right);
            System.out.print(n.key + " ");
        }
    }

    void inOrderTraversal(Node n) {
        if (n != null) {
            inOrderTraversal(n.left);
            System.out.print(n.key + " ");
            inOrderTraversal(n.right);
        }
    }
}

public class BinaryTreeSolution {

    public static void main(String[] args) {

        TreeTraversal t1 = new TreeTraversal();

        t1.root = new Node('A');
        t1.root.left = new Node('B');
        t1.root.right = new Node('C');
        t1.root.left.left = new Node('D');
        t1.root.left.right = new Node('E');
        t1.root.right.left = new Node('F');

        System.out.print("\nPre-order traversal of Binary Tree : ");
        t1.preOrderTraversal(t1.root);

        System.out.print("\nPost-order traversal of Binary Tree : ");
        t1.postOrderTraversal(t1.root);

        System.out.print("\nIn-order traversal of Binary Tree : ");
        t1.inOrderTraversal(t1.root);
    }
}
