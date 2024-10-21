package com.venu.program.linkedlist.impl;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}

class LinkedListImpl {
    Node head;
    Node tail;
    int length;

    public LinkedListImpl() {

    }

    public LinkedListImpl(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length++;
    }


}

public class LinkedListImplDemo {

    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();

    }

}
