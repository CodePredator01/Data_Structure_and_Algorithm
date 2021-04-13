/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 22-03-2021
 * Time: 10:43 AM
 * File: MyBinarySearchTree.java
 * */

package tree.binarySearch.insertion;

public class MyBinarySearchTree<E extends Comparable> {
    private Node<E> root;

    public void insert(E data) {
        Node<E> node = new Node<>(data);
        // isEmpty()
        if (root == null) {
            root = node;
        } else {
            Node<E> temp = root;
            Node<E> previous = null;
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

    //recursive(two argument)
    public void insert(Node<E> node, Node<E> previous, E data) {
        //empty tree
        if (node == null) {
            if (previous == null){
                if (data.compareTo(previous.getData()) <= 0){
                    previous.setLeftChild(new Node<>(data));
                }else{
                    previous.setRightChild(new Node<>(data));
                }
                previous = new Node<>(data);
            }else{
                //root case
                previous = new Node<>(data);
            }
            node = new Node<>(data);
        } else if (data.compareTo(node.getData()) <= 0) {
            insert(node.getLeftChild(), node, data);
        } else {
            insert(node.getRightChild(), node, data);
        }
    }

    //traversal
    public void inOrderTraversal(Node<E> node){
        if(node == null){
            return;
        }else{
            inOrderTraversal(node.getLeftChild());
            System.out.println(node.getData());
            inOrderTraversal(node.getRightChild());
        }
    }
}
