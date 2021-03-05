/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 15-02-2021
 * Time: 11:04 AM
 * File: MyStack.java
 * */

package stackUsingArray.implementation;

import stackUsingArray.myInterface.StackADT;

public class MyStack implements StackADT {
    // MAX_CAPACITY
    private final int MAX_CAPACITY;
    // arr for starting elements in stack
    private int[] arr;
    // every stack has top
    private int top;

    // constructor
    public MyStack(int MAX_CAPACITY){
        this.MAX_CAPACITY = MAX_CAPACITY;
        // initialize arr
        arr = new int[MAX_CAPACITY];
        // top is -1 or 0
        top = -1;
    }

    // alt + shift + enter
    @Override
    public void push(int element) {
        if (isEmpty()) {
            top++;
            arr[top] = element;
            System.out.println("Element Add ");
        }else{
            System.out.println("Stack Overflow !");
        }
    }

    @Override
    public int pop() {
        int response = 0;
        if (top != -1) {
            response = arr[top];
            top--;
            return response;
        }else {
            System.out.println("Stack Underflow ");
        }
        return response;
    }

    @Override
    public int peek() {
        if (top != -1) {
            return arr[top];
        }
        System.out.println("Stack is Empty !");
        return 0; // considering 0 as invalid data
    }

    @Override
    public boolean isEmpty() {
        if (top < MAX_CAPACITY - 1) {
            return  true;
        }
        return false;
    }

    @Override
    public int size() {
        return top + 1;
    }

    public boolean search(int searchKey) {
        boolean response = false;
        for (int i = 0; i <= top; i++) {
            if (searchKey == arr[i]) {
                response = true;
                break;
            }
        }
        return response;
    }

    public void traverse() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

}
