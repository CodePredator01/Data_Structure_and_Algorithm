/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 08-02-2021
 * Time: 11:00 AM
 * File: Node.java
 * */

package linkedList.doublyLinkedList.implementation;

public class Node {
    int data;
    Node next;
    Node previous;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

}
