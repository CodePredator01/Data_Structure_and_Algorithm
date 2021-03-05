/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 01-03-2021
 * Time: 10:35 AM
 * File: QueueADT.java
 * */

package queue.queueUsingArray.myInterface;

public interface QueueADT {
    void enqueue(int element);
    void dequeue();
    int peek();
    boolean isEmpty();
    boolean isFull();
    int size();
}
