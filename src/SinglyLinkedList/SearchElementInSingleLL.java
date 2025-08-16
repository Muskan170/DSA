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

public class SearchElementInSingleLL {
    public static boolean searchElement(Node head, int ele) {
        if (head == null) {
            return false;
        }
        while(head != null) {
            if (head.data == ele) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);

        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        boolean res = searchElement(head, 23);
        System.out.println(res);
    }
}
