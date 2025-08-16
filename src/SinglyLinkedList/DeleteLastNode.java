package SinglyLinkedList;
class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class DeleteLastNode {
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node deleteLastNode(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node tmp = head;

        while(tmp.next != null && tmp.next.next != null) {
            tmp = tmp.next;
        }

        tmp.next = null;

        return head;
    }

    public static void main(String[] args) {
        // Initialize an array with integer values
        int[] arr = {2, 5, 8, 7};
        // Create the linked list with nodes initialized with array values
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        // Delete the tail of the linked list
        head = deleteLastNode(head);
        // Print the modified linked list
        printList(head);
    }
}
