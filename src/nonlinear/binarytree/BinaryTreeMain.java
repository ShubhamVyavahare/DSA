package nonlinear.binarytree;

/**
 * Create a binary tree using classes and objects in java
 * Implement pre, post and inOrder traversal
 * <p>
 * Output :
 * Pre-order traversal of Binary Tree : A B D E C F
 * Post-order traversal of Binary Tree : D E B F C A
 * In-order traversal of Binary Tree : D B E A F C
 */
public class BinaryTreeMain {

    public static void main(String[] args) {

        BinaryTreeSolution t1 = new BinaryTreeSolution();

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
