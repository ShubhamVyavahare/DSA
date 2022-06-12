package linkedlist;

/**
 * Implement Circular Linked List (Do not use java built in classes)
 * <p>
 * Output :
 * Elements inserted into the circular linked list, Circular Linked List --> 2 7 8
 * Deleting elements from circular linked list, Circular Linked List --> 7 8
 */
public class CircularLinkedListSolution {

    public static void main(String[] args) {

        CircularLinkedList l1 = new CircularLinkedList();
        l1.insertElements(2);
        l1.insertElements(7);
        l1.insertElements(8);

        System.out.print("Elements inserted into the circular linked list, Circular Linked List --> ");
        l1.displayElements();

        System.out.print("\nDeleting elements from circular linked list, Circular Linked List --> ");
        l1.deleteElements();
        l1.displayElements();
    }
}
