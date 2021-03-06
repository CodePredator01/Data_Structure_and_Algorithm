/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 08-02-2021
 * Time: 10:56 AM
 * File: DoublyLinkedList.java
 * */

package linkedList.doublyLinkedList.interfaces;

public interface DoublyLinkedListADT {
    void addFirst(int data);
    void addLast(int data);
    boolean isEmpty();
    int size();
    int first();
    int last();
    void traverseForward();
    void traverseBackward();
    int removeFirst();
    int removeLast();
}
