/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 03-03-2021
 * Time: 09:55 PM
 * File: MySinglyLinkedListImpl.java
 * */

package linkedList.singlyLinkedList.implementation;


import linkedList.singlyLinkedList.myInterface.SinglyLinkedListADT;

public class MySinglyLinkedListImpl implements SinglyLinkedListADT {
    public Node head;

    @Override
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (!isEmpty()) {
            newNode.next = head;
            head = newNode;
        } else {
            head = newNode;
        }
    }

    @Override
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (!isEmpty()) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    @Override
    public int size() {
        int count = 0;
        if (isEmpty()) {
            System.out.println("LinkedList is Empty !");
        } else {
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }


    @Override
    public void traverse() {
        Node temp = head;
        if (!isEmpty()) {
            System.out.print("Linked List : ");
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("null");
        } else {
            System.out.println("LinkedList is Empty !");
        }
    }

    @Override
    public int removeFirst() {
        int response = 0;
        response = head.data;
        head = head.next;
        return response;
    }

    @Override
    public int removeLast() {
        if (isEmpty() || head.next == null) {
            return head.data;
        }
        Node temp = head;
        Node privious = null;
        while (temp.next != null) {
            privious = temp;
            temp = temp.next;
        }
        privious.next = null; // break the chain
        return temp.data;
    }

    @Override
    public int first() {
        int response = 0;
        if (!isEmpty()) {
            response = head.data;
        }
        return response;
    }

    @Override
    public int last() {
        int response = 0;
        if (!isEmpty()) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            response = temp.data;
        }
        return response;
    }

    @Override
    public boolean search(int searchElement) {
        boolean response = false;
        if (isEmpty()){
            return response;
        }else{
            Node temp = head;
            while (temp != null){
                if (temp.data == searchElement){
                    response = true;
                    return response;
                }
                temp = temp.next;
            }
        }
        return response;
    }
}
