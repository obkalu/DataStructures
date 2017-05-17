package com.obinna.datastructures;

import com.obinna.datastructures.doublylinkedlist.DLListNode;
import com.obinna.datastructures.doublylinkedlist.DoublyLinkedList;

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

        // Print the list
        doublyLinkedList.printList();

        // Now reverse the list
        doublyLinkedList.reverse1();

        // Print the list
        doublyLinkedList.printList();

        // Now reverse the list back again, using reverse2
        doublyLinkedList.reverse2();

        // Print the list
        doublyLinkedList.printList();
    }
}
