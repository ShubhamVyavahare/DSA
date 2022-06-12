package linear.stack;

import java.util.Stack;

/**
 * Create a linear.stack and implement it using the inbuilt classes and methods
 * Access the elements of linear.stack using iterator method
 * Implement the methods - push, pop, empty/isEmpty, peek, search, size, sort
 * <p>
 * Output :
 * Original Stack element : [2, 4, 9, 5, 1]
 * Using pop() method --> Deleted element : 1 --> Remaining Stack : [2, 4, 9, 5]
 * Using peek() method --> Selected element : 1 --> Stack : [2, 4, 9, 5, 1]
 * Using empty() method --> Status : false --> Stack : [2, 4, 9, 5, 1]
 * Using search(9) method --> Index : 3 --> Stack : [2, 4, 9, 5, 1]
 * Using size() method --> stackSize : 5
 * Stack before sorting : [2, 4, 9, 5, 1]
 * Stack after sorting : [1, 2, 4, 5, 9]
 * Using forEach() method over the linear.stack
 * 1
 * 2
 * 4
 * 5
 * 9
 */
public class StackSolutionMain {
    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<>();

        s1.push(2);
        s1.push(4);
        s1.push(9);
        s1.push(5);
        s1.push(1);

        System.out.println("Original Stack element : " + s1);

        Integer deletedElement = s1.pop();
        System.out.println("Using pop() method --> Deleted element : " + deletedElement + " --> Remaining Stack : " + s1);

        s1.push(1);

        Integer selectedElement = s1.peek();
        System.out.println("Using peek() method --> Selected element : " + selectedElement + " --> Stack : " + s1);

        boolean status = s1.empty();
        System.out.println("Using empty() method --> Status : " + status + " --> Stack : " + s1);

        int indexFound = s1.search(9);
        System.out.println("Using search(9) method --> Index : " + indexFound + " --> Stack : " + s1);

        int stackSize = s1.size();
        System.out.println("Using size() method --> stackSize : " + stackSize);

        System.out.println("Stack before sorting : " + s1);
        s1.sort(Integer::compareTo);
        System.out.println("Stack after sorting : " + s1);

        System.out.println("Using forEach() method over the linear.stack");
        s1.forEach(System.out::println);

    }
}
