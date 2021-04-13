package tree.binarySearchTreeAssignment.implementation;

import tree.binarySearchTreeAssignment.myInterface.BinarySearchTreeADT;
import tree.binarySearchTreeAssignment.myInterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class
    public Node root;

    @Override
    public void insert(E data) {
        tree.binarySearchTreeAssignment.implementation.Node<E> node = new tree.binarySearchTreeAssignment.implementation.Node<E>((Integer) data);
        // isEmpty()
        if (root == null) {
            root = (Node) node;
        } else {
            tree.binarySearchTreeAssignment.implementation.Node<E> temp = (tree.binarySearchTreeAssignment.implementation.Node<E>) root;
            tree.binarySearchTreeAssignment.implementation.Node<E> previous = null;
            while (temp != null) {
                previous = temp;
                if (data.compareTo(temp.data()) <= 0) {
                    temp = temp.left();
                } else {
                    temp = temp.right();
                }
            }
            // previous is the node, whose child will be data
            if (data.compareTo(previous.data()) <= 0) {
                previous.right(node);
            }
        }
    }

    @Override
    public boolean search(E searchElement) {
        return false;
    }

    @Override
    public void inOrder(Node<E> node) {

    }

    @Override
    public void preOrder(Node<E> node) {

    }

    @Override
    public void postOrder(Node<E> node) {

    }

    @Override
    public void reverseInOrder(Node<E> node) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        return 0;
    }

}
