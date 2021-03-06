/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 05-03-2021
 * Time: 10:20 PM
 * File: MyDoublyLinkedListImp.java
 * */

package linkedList.doublyLinkedList.implementation;

import linkedList.doublyLinkedList.interfaces.DoublyLinkedListADT;

public class MyDoublyLinkedListImp implements DoublyLinkedListADT {
    public Node head;
    public Node tail;

    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if (!isEmpty()) {
            head.previous = node;
        } else {
            tail = node;
        }
        node.next = head;
        head = node;
    }

    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        if (!isEmpty()) {
            tail.next = node;
            node.previous = tail;
            tail = node;
        } else {
            head = node;
        }
        node.next = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        int count = 0;
        Node temp = head;
        if (isEmpty()) {
            return count;
        } else {
            System.out.print("Size of doubly linked list : ");
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    @Override
    public int first() {
        if (isEmpty()) {
            return 0;
        } else {
            System.out.print("Data of first node : ");
            return head.data;
        }
    }

    @Override
    public int last() {
        if (isEmpty()) {
            return 0;
        } else {
            System.out.print("Data of last node : ");
            return tail.data;
        }
    }

    @Override
    public void traverseForward() {
        Node temp = head;
        if (isEmpty()) {
            System.out.println("Empty Linked List !");
        } else {
            System.out.print("Forward linked list : ");
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    @Override
    public void traverseBackward() {
        Node temp = tail;
        if (tail == null) {
            System.out.println("Empty Linked List !");
        } else {
            System.out.print("Backward linked list : ");
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.previous;
            }
            System.out.println("null");
        }
    }

    @Override
    public int removeFirst() {
        if (isEmpty()) {
            return 0;
        } else {
            System.out.print("Remove first node data: ");
            if (head.next == null) {
                Node temp = head;
                head = null;
                return temp.data;
            } else {
                Node temp = head;
                head = head.next;
                head.previous = null;
                return temp.data;
            }
        }
    }

    @Override
    public int removeLast() {
        Node temp = tail;
        if (isEmpty()){
            return 0;
        }else{
            System.out.print("Remove last node data : ");
            if (head.next == null){
                temp = head;
                head = null;
                return temp.data;
            }else{
                temp = tail;
                tail = tail.previous;
                tail.next = null;
                return temp.data;
            }
        }
    }
}
