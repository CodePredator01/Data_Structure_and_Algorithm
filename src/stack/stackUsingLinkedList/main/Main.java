/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 06-03-2021
 * Time: 12:13 PM
 * File: Main.java
 * */

package stack.stackUsingLinkedList.main;

import stack.stackUsingLinkedList.implementation.StackUsingLinkedListImp;

public class Main {
    public static void main(String[] args) {
        StackUsingLinkedListImp stack = new StackUsingLinkedListImp();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.traverse();
        stack.peek();
        stack.pop();
        stack.traverse();
        System.out.println(stack.size());
    }
}
