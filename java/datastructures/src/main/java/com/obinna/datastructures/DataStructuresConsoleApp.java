package com.obinna.datastructures;

import com.obinna.datastructures.doublylinkedlist.DLListNode;
import com.obinna.datastructures.doublylinkedlist.DoublyLinkedList;
import com.obinna.datastructures.singlylinkedlist.SLListNode;
import com.obinna.datastructures.singlylinkedlist.SinglyLinkedList;

/**
 * Created by obi on 2017-05-16.
 */
public class DataStructuresConsoleApp {

    public static void main(String[] args) {
        // Create a DoublyLinkedList of the integers: 1, 2, 3.
        DLListNode<Integer> one = new DLListNode<>(1);
        DLListNode<Integer> two = new DLListNode<>(2);
        DLListNode<Integer> three = new DLListNode<>(3);
        // Create an instance of DoublyLinkedList and populate it
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.add(one);
        doublyLinkedList.add(two);
        doublyLinkedList.add(three);

        // Create a SinglyLinkedList of the integers: 4, 5, 6.
        SLListNode<Integer> four = new SLListNode<>(4);
        SLListNode<Integer> five = new SLListNode<>(5);
        SLListNode<Integer> six = new SLListNode<>(6);
        // Create an instance of SinglyLinkedList and populate it
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add(four);
        singlyLinkedList.add(five);
        singlyLinkedList.add(six);

        // Print the doublyLinkedlist
        doublyLinkedList.printList();
        // Now reverse the doublyLinkedlist
        doublyLinkedList.reverse1();
        // Print the reversed doublyLinkedlist
        doublyLinkedList.printList();
        // Now reverse the doublyLinkedlist back again, using reverse2
        doublyLinkedList.reverse2();
        // Print the doublyLinkedlist once again
        doublyLinkedList.printList();

        // Print the singlyLinkedlist
        singlyLinkedList.printList();
        // Now reverse the singlyLinkedlist
        singlyLinkedList.reverse();
        // Print the reversed singlyLinkedlist
        singlyLinkedList.printList();
        // Now reverse the singlyLinkedlist back again
        singlyLinkedList.reverse();
        // Print the singlyLinkedlist once again
        singlyLinkedList.printList();
    }
}
