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
        MyQueue queue = new MyQueue(5);
        queue.enqueue(6);
        queue.dequeue();
        queue.enqueue(3);
        queue.enqueue(99);
        queue.enqueue(56);
        queue.dequeue();
        queue.enqueue(43);
        queue.dequeue();
        queue.enqueue(89);
        queue.enqueue(77);
        queue.dequeue();
        queue.enqueue(32);
        queue.enqueue(232);
    }
}
