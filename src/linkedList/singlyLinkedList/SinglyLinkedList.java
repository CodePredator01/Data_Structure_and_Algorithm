/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 03-03-2021
 * Time: 09:49 PM
 * File: SinglyLinkedList.java
 * */

package linkedList.singlyLinkedList;

public class SinglyLinkedList {
    private ListNode head;
    private int size;

    public static void main(String[] args) {
        SinglyLinkedList linkList = new SinglyLinkedList();
        linkList.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        // Now we will connect every node and form a Chain
        linkList.head.next = second; // 10-->20
        second.next = third; // 10-->20-->30
        third.next = fourth; // 10-->20-->30-->40-->null
        linkList.addFirst(4); // 4-->10-->20-->30-->40-->null
        linkList.addFirst(5); // 5-->4-->10-->20-->30-->40-->null
        linkList.addLast(8); // 5-->4-->10-->20-->30-->40-->8-->null
        linkList.addLast(16); // 5-->4-->10-->20-->30-->40-->8-->16-->null
        linkList.display();
        System.out.println("Number of Added Nodes : " + linkList.size);
        System.out.println("Size of SinglyLinked List : " + linkList.size());
    }

    public void display() {
        ListNode temp = head;
        System.out.print("Created Linked List : ");
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (isEmpty()) {
            head = node;
            size++;
        } else {
            node.next = head;
            head = node;
            size++;
        }
    }

    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (isEmpty()) {
            head = node;
            size++;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            size++;
        }
    }

    public int size() {
        ListNode temp = head;
        int count = 0;
        if (!isEmpty()) {
            while (temp != null) {
                count++;
                temp = temp.next;
            }
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }


    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
