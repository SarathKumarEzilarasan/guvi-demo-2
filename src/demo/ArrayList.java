package demo;

public class Stack {

    
    private Node head;
    private Node tail;
    private int size;

    public void findDelete() {
        Node pointer = head;
        int middle = size / 2;
        int i = 0;
        while (pointer.next != null && i < middle - 1) {
            pointer = pointer.next;
            i++;
        }
        Node newMiddle = pointer.next.next;
        newMiddle.previous = pointer.next;
    }

    public void push(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
        } else {
            head.next = newNode;
            newNode.previous = head;
        }
        tail = newNode;
        size++;
    }

    public int pop() {
        int tailData = tail.data;
        Node newTail = tail.previous;
        newTail.next = null;
        tail = newTail;
        return tailData;
    }
}


class Node {
    int data;
    Node next;
    Node previous;

    public Node(int data) {
        this.data = data;
    }
}