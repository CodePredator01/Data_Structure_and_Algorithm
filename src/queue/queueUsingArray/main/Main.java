/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 01-03-2021
 * Time: 10:52 AM
 * File: Main.java
 * */

package queue.queueUsingArray.main;

import queue.queueUsingArray.implementation.MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
    }
}
