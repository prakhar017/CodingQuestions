package mix;

import java.util.Stack;

public class Node {

    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }


}


class NodeMain {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Node head = convertArraytoLL(arr);
        printLL(head);

        Node newInsertedHead = insertAtHead(0, head);
        printLL(newInsertedHead);

        Node newInsertedAtLasthead = insertAtLast(6, newInsertedHead);
        printLL(newInsertedAtLasthead);

        Node newInsertedAtMiddleHead = insertAtMiddle(2222, 3, newInsertedAtLasthead);
        printLL(newInsertedAtMiddleHead);

        reverseLL(newInsertedAtMiddleHead);
    }

    private static void reverseLL(Node newInsertedAtMiddleHead) {

        Node temp = newInsertedAtMiddleHead;
        Stack<Integer> stack = new Stack<>();
        while (temp != null) {

            stack.push(temp.data);
            temp = temp.next;

        }

        temp = newInsertedAtMiddleHead;
        while (temp != null) {
            temp.data = stack.pop();
            temp = temp.next;

        }

        printLL(newInsertedAtMiddleHead);
    }

    private static Node insertAtMiddle(int v, int i, Node newInsertedAtLasthead) {
        Node temp = newInsertedAtLasthead;
        int ctr = 0;
        while (temp != null) {
            temp = temp.next;
            ctr++;
        }

        System.out.println(ctr);

        int pos = ctr - i;
        temp = newInsertedAtLasthead;

        for (int j = 1; j < pos - 1; j++)
            temp = temp.next;

        System.out.println(temp.data);

        Node middleNode = new Node(v);
        middleNode.next = temp.next;
        temp.next = middleNode;


        return newInsertedAtLasthead;
    }


    private static Node insertAtLast(int i, Node newInsertedHead) {
        Node temp = newInsertedHead;
        while (temp.next != null) {
            temp = temp.next;
        }

        Node lastNode = new Node(6);
        temp.next = lastNode;
        return newInsertedHead;
    }

    public static void printLL(Node newInsertedHead) {
        Node temp = newInsertedHead;
        while (temp != null) {

            if (temp.next == null) {
                System.out.print(temp.data);
            } else {
                System.out.print(temp.data + "-->");
            }
            temp = temp.next;

        }
        System.out.println("");
    }

    private static Node insertAtHead(int i, Node head) {
        Node temp = new Node(i, head);
        return temp;
    }

    private static Node convertArraytoLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }
}
