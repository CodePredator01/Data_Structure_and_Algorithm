/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 05-03-2021
 * Time: 10:18 PM
 * File: Main.java
 * */

package linkedList.doublyLinkedList.main;

import linkedList.doublyLinkedList.implementation.MyDoublyLinkedListImp;

public class Main {
    public static void main(String[] args) {
        MyDoublyLinkedListImp link = new MyDoublyLinkedListImp();
        link.addFirst(10);
        link.addFirst(20);
        link.addLast(30);
        link.traverseForward();
        link.traverseBackward();
        System.out.println(link.size());
        System.out.println(link.first());
        System.out.println(link.last());
        System.out.println(link.removeFirst());
        System.out.println(link.removeLast());
        System.out.println();
        System.out.print("Updated ");
        link.traverseForward();
    }
}
