/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 06-03-2021
 * Time: 12:13 PM
 * File: StackUsingLinkedListImp.java
 * */

package stack.stackUsingLinkedList.implementation;

import stack.stackUsingLinkedList.myInterface.StackADT;

public class StackUsingLinkedListImp implements StackADT {
    public Node top;

    @Override
    public void traverse() {
        Node temp = top;
        if (isEmpty()) {
            System.out.println("Empty stack !");
        } else {
            System.out.print("top-->");
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    @Override
    public void push(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }

    }

    @Override
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow !");
        } else {
            System.out.println("Top value of stack : " + top.data);
        }
    }

    @Override
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow !");
        } else {
            System.out.println("Pop value of stack : " + top.data);
            top = top.next;
        }

    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        int count = 0;
        if (isEmpty()) {
            return 0;
        } else {
            Node temp = top;
            System.out.print("Size of stack : ");
            while (temp != null) {
                temp = temp.next;
                count++;
            }
        }
        return count;
    }
}
