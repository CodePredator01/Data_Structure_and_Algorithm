/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 01-03-2021
 * Time: 10:42 AM
 * File: MyQueue.java
 * */


// Last code is not right size and peek

package queue.queueUsingArray.implementation;

import queue.queueUsingArray.myInterface.QueueADT;

public class MyQueue implements QueueADT {
    public static final int MAX_VALUE = 1000;
    public int[] arr;
    int capacity;
    int front;
    int rear;
    int size = 0;

    public MyQueue(int capacity) {
        this.front = 0;
        this.rear = -1;
        this.arr = new int[capacity];
    }

    @Override
    public void enqueue(int element) {
        if (isEmpty()) {
            rear++;
            arr[rear] = element;

            size++;
        } else {
            System.out.println("Overflow !");
        }
    }

    @Override
    public void dequeue() {
        int response = 0;
        if (!isEmpty()) {
            response = arr[front];
            front++;
            System.out.println(response);

        }
    }

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size < MAX_VALUE - 1;
    }

    @Override
    public boolean isFull() {
        return size == MAX_VALUE;
    }

    @Override
    public int size() {
        return 0;
    }
}
