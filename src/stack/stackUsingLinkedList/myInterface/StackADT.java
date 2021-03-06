/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 06-03-2021
 * Time: 12:12 PM
 * File: StackADT.java
 * */

package stack.stackUsingLinkedList.myInterface;

public interface StackADT {
    void push(int data);
    void peek();
    void pop();
    boolean isEmpty();
    int size();
    void traverse();
}
