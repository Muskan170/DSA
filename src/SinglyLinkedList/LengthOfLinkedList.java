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

public class LengthOfLinkedList {
    public static int lengthOfList(Node head) {
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);

        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        int res = lengthOfList(head);

        System.out.println(res);
    }
}
