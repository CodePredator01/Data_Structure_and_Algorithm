/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 03-03-2021
 * Time: 04:22 PM
 * File: PriorityQueue.java
 * */

package queue.priorityQueue.myInterface;

public interface PriorityQueueADT<E extends Comparable <E>> {
    E enqueue(E element);
    E dequeue();
    E peek();
    boolean isEmpty();
    int size();
}
