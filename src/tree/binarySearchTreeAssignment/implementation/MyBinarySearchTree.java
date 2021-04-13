package tree.binarySearchTreeAssignment.implementation;

import tree.binarySearchTreeAssignment.myInterface.BinarySearchTreeADT;
import tree.binarySearchTreeAssignment.myInterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class
    private Node root;

    public Node getRoot() {
        return root;
    }

    @Override
    public void insert(E data) {
        tree.binarySearch.insertion.Node<E> node = new tree.binarySearch.insertion.Node<>(data);
        // isEmpty()
        if (root == null) {
            root = (Node) node;
        } else {
            tree.binarySearch.insertion.Node<E> temp = (tree.binarySearch.insertion.Node<E>) root;
            tree.binarySearch.insertion.Node<E> previous = null;
            while (temp != null) {
                previous = temp;
                if (data.compareTo(temp.getData()) <= 0) {
                    temp = temp.getLeftChild();
                } else {
                    temp = temp.getRightChild();
                }
            }
            // previous is the node, whose child will be data
            if (data.compareTo(previous.getData()) <= 0) {
                previous.setRightChild(node);
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
