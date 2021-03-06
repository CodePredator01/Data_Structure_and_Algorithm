/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 06-03-2021
 * Time: 02:21 PM
 * File: QueueUsingLinkedListImp.java
 * */

package queue.queueUsingLinkedList.implementation;

import queue.queueUsingLinkedList.myInterface.QueueADT;

public class QueueUsingLinkedListImp implements QueueADT {
    public Node front;
    public Node rear;

    @Override
    public void enqueue(int data) {
        Node node = new Node(data);
        if (!isEmpty()) {
            rear.next = node;
            rear = node;
        } else {
            front = rear = node;
        }
    }

    @Override
    public void dequeue() {
        Node temp = front;
        if (!isEmpty()) {
            if (front.next == null) {
                front = null;
            } else {
                front = front.next;
            }
        } else {
            System.out.println("Queue underflow !");
        }
    }

    @Override
    public int size() {
        int count = 0;
        if (!isEmpty()) {
            Node temp = front;
            System.out.print("Size of queue : ");
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        } else {
            return 0;
        }
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public int peek() {
        System.out.print("Peek value of queue : ");
        if (!isEmpty()) {
            return front.data;
        } else {
            return 0;
        }
    }

    @Override
    public void traverse() {
        Node temp = front;
        if (isEmpty()) {
            System.out.println("Empty queue !");
        } else {
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}
