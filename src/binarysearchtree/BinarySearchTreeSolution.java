package binarysearchtree;

public class BinarySearchTreeSolution {
    Node root;

    void insertKey(char key) {
        root = insertIntoTree(root, key);
    }

    Node insertIntoTree(Node root, char key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertIntoTree(root.left, key);
        } else if (key > root.key) {
            root.right = insertIntoTree(root.right, key);
        }

        return root;
    }

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
