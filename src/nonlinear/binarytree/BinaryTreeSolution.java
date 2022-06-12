package nonlinear.binarytree;

public class BinaryTreeSolution {
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
