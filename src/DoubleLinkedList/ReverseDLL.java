package DoubleLinkedList;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node prev1) {
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}

public class ReverseDLL {

    private static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node reverseDoublyList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        Node tmp = null;

        while (current != null) {
            tmp = current.prev;
            current.prev = current.next;
            current.next = tmp;
            current = current.prev;
        }
        return tmp.prev;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};
        Node head = convertArr2DLL(arr);
        System.out.println("Doubly Linked List Initially:  ");
        print(head);
        System.out.println("Doubly Linked List After Reversing :");
        head = reverseDoublyList(head);
        print(head);

    }
}
