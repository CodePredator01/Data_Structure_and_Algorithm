/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 06-03-2021
 * Time: 02:17 PM
 * File: QueueADT.java
 * */

package queue.queueUsingLinkedList.myInterface;

public interface QueueADT {
    void enqueue(int data);
    void dequeue();
    int size();
    boolean isEmpty();
    int peek();
    void traverse();
}
