/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 04-03-2021
 * Time: 09:16 PM
 * File: SinglyLinkedListADT.java
 * */

package linkedList.singlyLinkedList.myInterface;

public interface SinglyLinkedListADT {
    void addFirst(int data);
    void addLast(int data);
    boolean isEmpty();
    int size();
    void traverse();
    int removeFirst();
    int removeLast();
    int first();
    int last();
    boolean search(int searchElement);
}
