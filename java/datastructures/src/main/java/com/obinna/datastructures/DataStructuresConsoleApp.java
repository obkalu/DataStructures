package com.obinna.datastructures;

import com.obinna.datastructures.list.linkedlist.doublylinkedlist.DLListNode;
import com.obinna.datastructures.list.linkedlist.doublylinkedlist.DoublyLinkedList;
import com.obinna.datastructures.list.linkedlist.singlylinkedlist.SLListNode;
import com.obinna.datastructures.list.linkedlist.singlylinkedlist.SinglyLinkedList;
import com.obinna.datastructures.list.arraylist.ArrayList;

/**
 * DataStructuresConsoleApp
 * A simple Java console app to demo/test the datastructure classes
 *
 * Created by obi on 2017-05-16.
 */
class DataStructuresConsoleApp {

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

        // Create an ArrayList of integers.
        // Test-case 1: Create an empty ArrayList
//        ArrayList<Integer> arrayList = new ArrayList<>();

        // Test-case 2: Create an ArrayList with initial capacity of 3
//        ArrayList<Integer> arrayList = new ArrayList<>(3);
//        arrayList.add(7);
//        arrayList.add(8);
//        arrayList.add(9);

        // Test-case 3: Create an ArrayList from a given feeder_array
        ArrayList<Integer> arrayList = new ArrayList<>(new Integer[]{4, 5, 6, 13, 0, 2, 97});

        // Print the doublyLinkedList
        doublyLinkedList.printList();
        // Now reverse the doublyLinkedList
        doublyLinkedList.reverse1();
        // Print the reversed doublyLinkedList
        doublyLinkedList.printList();
        // Now reverse the doublyLinkedList back again, using reverse2
        doublyLinkedList.reverse2();
        // Print the doublyLinkedList once again
        doublyLinkedList.printList();

        // Print the singlyLinkedList
        singlyLinkedList.printList();
        // Now reverse the singlyLinkedList
        singlyLinkedList.reverse();
        // Print the reversed singlyLinkedList
        singlyLinkedList.printList();
        // Now reverse the singlyLinkedList back again
        singlyLinkedList.reverse();
        // Print the singlyLinkedList once again
        singlyLinkedList.printList();

        // Print the arrayList
        arrayList.printList();
//        arrayList.add(10);
        arrayList.reverseInPlace();
        arrayList.printList();
    }
}
