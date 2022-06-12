package linear.queue;

/**
 * Create a linear.queue and implement it using classes amd inbuilt methods
 * Implement the functions - enqueue, dequeue, isEmpty, size, display
 * <p>
 * Output :
 * Initially linear.queue is empty
 * Queue is empty, there is nothing to display
 * Queue is empty, there is nothing to delete
 * <p>
 * Inserting elements into the linear.queue using enqueue() method
 * Displaying Queue Elements : 2 4 8
 * <p>
 * Deleting elements from the linear.queue using dequeue() method
 * Displaying Queue Elements : 4 8
 */
public class QueueMain {
    public static void main(String[] args) {

        QueueUsingArraysSolution queueUsingArraysSolution = new QueueUsingArraysSolution(5);

        System.out.println("Initially linear.queue is empty");
        queueUsingArraysSolution.display();
        queueUsingArraysSolution.dequeue();

        System.out.println("\nInserting elements into the linear.queue using enqueue() method");
        queueUsingArraysSolution.enqueue(2);
        queueUsingArraysSolution.enqueue(4);
        queueUsingArraysSolution.enqueue(8);
        queueUsingArraysSolution.display();

        System.out.println("\n\nDeleting elements from the linear.queue using dequeue() method");
        queueUsingArraysSolution.dequeue();
        queueUsingArraysSolution.display();
    }
}
