package tree.binarySearchTreeAssignment.implementation;

public class Node<E extends Comparable<E>> implements myinterface.Node<E> {
    //completed node class
    public int data;
    public Node left;
    public Node right;
    public int height;

    // constructor
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.height = 0;
    }

    public E data() {
        return null;
    }

    public Node<E> left() {
        return null;
    }

    public Node<E> right() {
        return null;
    }

    public Node<E> right(Node<E> node) {
        return null;
    }
}