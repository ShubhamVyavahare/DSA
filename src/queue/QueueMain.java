package queue;

/**
 * Create a queue and implement it using classes amd inbuilt methods
 * Implement the functions - enqueue, dequeue, isEmpty, size, display
 * <p>
 * Output :
 * Initially queue is empty
 * Queue is empty, there is nothing to display
 * Queue is empty, there is nothing to delete
 * <p>
 * Inserting elements into the queue using enqueue() method
 * Displaying Queue Elements : 2 4 8
 * <p>
 * Deleting elements from the queue using dequeue() method
 * Displaying Queue Elements : 4 8
 */
public class QueueMain {
    public static void main(String[] args) {

        QueueUsingArraysSolution queueUsingArraysSolution = new QueueUsingArraysSolution(5);

        System.out.println("Initially queue is empty");
        queueUsingArraysSolution.display();
        queueUsingArraysSolution.dequeue();

        System.out.println("\nInserting elements into the queue using enqueue() method");
        queueUsingArraysSolution.enqueue(2);
        queueUsingArraysSolution.enqueue(4);
        queueUsingArraysSolution.enqueue(8);
        queueUsingArraysSolution.display();

        System.out.println("\n\nDeleting elements from the queue using dequeue() method");
        queueUsingArraysSolution.dequeue();
        queueUsingArraysSolution.display();
    }
}
