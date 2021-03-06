/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 15-02-2021
 * Time: 11:43 AM
 * File: MyMain.java
 * */

package stack.stackUsingArray.main;

import stack.stackUsingArray.implementation.MyStack;

public class MyMain {
    public static void main(String[] args) {
        int maxCapacity = 5;
        MyStack stack = new MyStack(maxCapacity);
        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Element at top / peek : " + stack.peek());
        stack.push(50);
        stack.push(60);
        System.out.println("Number of elements in stack : " + stack.size());
        System.out.println();
        System.out.println("Searching Element 60 found : " + stack.search(60));
    }
}
