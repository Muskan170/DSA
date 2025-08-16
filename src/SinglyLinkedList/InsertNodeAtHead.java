package SinglyLinkedList;
import java.util.Arrays;
import java.util.List;

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
public class InsertNodeAtHead {
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node insertNodeAtHead(int val, Node head) {
        Node tmp = new Node(val);
        tmp.next = head;
        return tmp;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);
        int val = 100;

        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        head = insertNodeAtHead(val, head);

        printList(head);
    }
}
