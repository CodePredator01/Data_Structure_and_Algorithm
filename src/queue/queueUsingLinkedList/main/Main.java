/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 06-03-2021
 * Time: 02:24 PM
 * File: Main.java
 * */

package queue.queueUsingLinkedList.main;

import queue.queueUsingLinkedList.implementation.QueueUsingLinkedListImp;

public class Main {
    public static void main(String[] args) {
        QueueUsingLinkedListImp queue = new QueueUsingLinkedListImp();
        queue.enqueue(10);
        queue.enqueue(100);
        queue.enqueue(20);
        queue.traverse();
        queue.dequeue();
        queue.traverse(); // updated queue
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }
}
