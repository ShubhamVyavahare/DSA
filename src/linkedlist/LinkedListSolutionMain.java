package linkedlist;

import java.util.LinkedList;

/**
 * Create a LinkedList and implement it using concepts of inbuilt classes and methods
 * Implement functions like:
 * 1. Insert at beginning
 * 2. Insert at end of linked list
 * 3. Delete
 * 4. Display the contents of linked list
 * 5. Explore other methods - addAll, contains, size
 * <p>
 * Output :
 * Original Linked List : []
 * After adding elements --> Linked List : [3, 7, 10, 1, 4, 5]
 * Adding 6 at 1st index --> Linked List : [3, 6, 7, 10, 1, 4, 5]
 * Removing 2nd index --> Linked List : [3, 6, 10, 1, 4, 5]
 * Linked list size : 6
 * Is 4 contains in Linked List : true
 */
public class LinkedListSolutionMain {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        System.out.println("Original Linked List : " + l1);

        l1.add(3);
        l1.add(7);
        l1.add(10);
        l1.add(1);
        l1.add(4);
        l1.add(5);

        System.out.println("After adding elements --> Linked List : " + l1);

        l1.add(1, 6);
        System.out.println("Adding 6 at 1st index --> Linked List : " + l1);

        l1.remove(2);
        System.out.println("Removing 2nd index --> Linked List : " + l1);

        int size = l1.size();
        System.out.println("Linked list size : " + size);

        boolean contains = l1.contains(4);
        System.out.println("Is 4 contains in Linked List ? : " + contains);
    }
}
