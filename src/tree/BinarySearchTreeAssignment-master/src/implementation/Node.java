package implementation;

public class Node<E extends Comparable<E>> implements myinterface.Node<E> {
    //complete node class
    public int data;
    public Node left;ś
    public Node right;
    public int height;

    // constructor
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.height = 0;
    }
}
