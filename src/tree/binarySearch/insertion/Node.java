/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 22-03-2021
 * Time: 10:31 AM
 * File: Node.java
 * */

package tree.binarySearch.insertion;

public class Node<E> {
    private E data;
    private Node<E> leftChild;
    private Node<E> rightChild;

    public Node(E data){
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<E> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<E> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<E> rightChild) {
        this.rightChild = rightChild;
    }

    /*
     * @Override
     * public int compareTo(Node<E> o) {
     * return this.data.compareTo(o.data);
     * }
     * */
}
