/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 04-03-2021
 * Time: 09:46 PM
 * File: Main.java
 * */

package linkedList.singlyLinkedList.main;


import linkedList.singlyLinkedList.implementation.MySinglyLinkedListImpl;

public class Main {
    public static void main(String[] args) {
        MySinglyLinkedListImpl linkList = new MySinglyLinkedListImpl();
        linkList.addFirst(10);
        linkList.addFirst(20);
        linkList.addFirst(30);
        linkList.addFirst(40);
        linkList.addLast(100);
        linkList.addLast(500);
        linkList.addLast(50);
        linkList.traverse();
        System.out.println("Size of linked list : " + linkList.size());
        System.out.println("Data of first node : " + linkList.first());
        System.out.println("Data of last node : " + linkList.last());
        System.out.println("Removed data at first : " + linkList.removeFirst());
        System.out.println("Removed data at first : " + linkList.removeFirst());
        System.out.println("Removed data at last : " + linkList.removeLast());
        System.out.println("Remove data at last : " + linkList.removeLast());
        System.out.println();
        System.out.print("Updated ");
        linkList.traverse();
        System.out.println("Searched element is present or not : " + linkList.search(20));

    }
}
