/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 03-03-2021
 * Time: 04:24 PM
 * File: PriorityQueueImp.java
 * */

package queue.priorityQueue.implmentation;

import queue.priorityQueue.myInterface.PriorityQueueADT;

public class PriorityQueueImp<E extends Comparable<E>> implements PriorityQueueADT<E> {
    int arr[];
    int front;
    int rear;
    int size;

    @Override
    public E enqueue(E element) {
        return null;
    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    int[] brr;
    private void rearrange(){
        for (int i = rear; i > front; i--) {
            if (brr[i] > brr[i-1]){
                // swap
                int temp = brr[i];
                brr[i] = brr[i-1];
                brr[i-1] = temp;
            }else {
                break;
            }
        }
    }

    // rearrange generic
    E[] br;
    private void rearrangeGeneric(){
        for (int i = rear; i > front; i--) {
            if (br[i].compareTo(br[i-1]) >= 1){
                //swap
                E temp = br[i];
                br[i] = br[i-1];
                br[i-1] = temp;
            }else{
                break;
            }
        }
    }

}
