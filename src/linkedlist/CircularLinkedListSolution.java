package linkedlist;

public class CircularLinkedListSolution {
    Node head, tail;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    void insertElements(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void displayElements() {
        Node n1 = head;

        if (tail == null && head == null)
            System.out.println("Circular Linked List is empty, nothing to display");
        else {
            do {
                System.out.print(n1.data + " ");
                n1 = n1.next;
            } while (n1 != head);
        }
    }

    void deleteElements() {
        if (tail != head) {
            head = head.next;
            tail.next = head;
        } else {
            head = tail = null;
        }
    }
}
