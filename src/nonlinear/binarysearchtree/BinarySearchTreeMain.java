package nonlinear.binarysearchtree;

/**
 * Create a binary search tree using classes and objects
 * Insert element into the BST
 * Delete element from BST
 * <p>
 * Output :
 * Pre-order traversal of Binary Search Tree : C B A I G M
 * Post-order traversal of Binary Search Tree : A B G M I C
 * In-order traversal of Binary Search Tree : A B C G I M
 */
public class BinarySearchTreeMain {

    public static void main(String[] args) {

        BinarySearchTreeSolution t1 = new BinarySearchTreeSolution();

        t1.insertKey('C');
        t1.insertKey('I');
        t1.insertKey('B');
        t1.insertKey('G');
        t1.insertKey('M');
        t1.insertKey('A');

        System.out.print("\nPre-order traversal of Binary Search Tree : ");
        t1.preOrderTraversal(t1.root);

        System.out.print("\nPost-order traversal of Binary Search Tree : ");
        t1.postOrderTraversal(t1.root);

        System.out.print("\nIn-order traversal of Binary Search Tree : ");
        t1.inOrderTraversal(t1.root);
    }
}
