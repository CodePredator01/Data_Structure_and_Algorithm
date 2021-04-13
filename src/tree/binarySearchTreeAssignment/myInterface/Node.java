package tree.binarySearchTreeAssignment.myInterface;

public interface Node<E extends Comparable<E>> {
    boolean data();

    Node left();

    Node right();
    //marker interface

}
