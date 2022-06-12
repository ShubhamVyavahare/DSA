package queue;

public class QueueUsingArraysSolution {

    int frontQueue, rearQueue;
    int capacityOfQueue;
    static int[] q1;

    public QueueUsingArraysSolution(int capacityOfQueue) {
        this.capacityOfQueue = capacityOfQueue;
        q1 = new int[this.capacityOfQueue];
    }

    public void enqueue(int value) {
        if (rearQueue == capacityOfQueue)
            System.out.println("Queue is already full, you cannot insert and element");
        else {
            q1[rearQueue] = value;
            rearQueue++;
        }
    }

    public void dequeue() {
        if (rearQueue == 0)
            System.out.println("Queue is empty, there is nothing to delete");
        else {
            for (int i = 0; i < rearQueue - 1; i++) {
                q1[i] = q1[i + 1];
            }
            rearQueue--;
        }
    }

    public void display() {
        if (rearQueue == 0)
            System.out.println("Queue is empty, there is nothing to display");
        else {
            System.out.print("Displaying Queue Elements : ");
            for (int i = 0; i < rearQueue; i++) {
                System.out.print(q1[i] + " ");
            }
        }
    }
}
