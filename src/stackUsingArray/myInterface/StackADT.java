/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 15-02-2021
 * Time: 11:00 AM
 * File: StackADT.java
 * */

package stackUsingArray.myInterface;

public interface StackADT {
    void push(int data);
    int pop();
    int peek();
    boolean isEmpty();
    int size();
}
