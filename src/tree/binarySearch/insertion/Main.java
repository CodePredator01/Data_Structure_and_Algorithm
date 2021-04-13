/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 22-03-2021
 * Time: 11:52 AM
 * File: Main.java
 * */

package tree.binarySearch.insertion;

public class Main {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
        bst.insert(30);
        bst.insert(50);
        bst.insert(60);
        bst.inOrderTraversal(bst.getRoot());

    }
}
