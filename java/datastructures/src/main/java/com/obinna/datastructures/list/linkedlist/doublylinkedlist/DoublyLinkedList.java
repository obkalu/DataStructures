package com.obinna.datastructures.list.linkedlist.doublylinkedlist;

/**
 * Implements a DoublyLinkedList
 * Created by obi on 2017-05-16.
 */
//@SuppressWarnings("ALL")
public class DoublyLinkedList<E> {
    private DLListNode<E> first;
    private DLListNode<E> last;
    private int size;
    private boolean empty;

    public DoublyLinkedList() {
        this.first = this.last = null;
        this.size = 0;
        this.empty = true;
    }

    public DoublyLinkedList(DLListNode<E> first) {
        this.first = this.last = first;
        this.first.setNext(null);
        this.first.setPrev(null);
        this.size = 1;
        this.empty = false;
    }

    public DoublyLinkedList(DLListNode<E> first, DLListNode<E> last) {
        this.first = first;
        this.last = last;
        this.first.setNext(last);
        this.first.setPrev(null);
        this.last.setPrev(first);
        this.last.setNext(null);
        this.size = 2;
        this.empty = false;
    }

    public DLListNode<E> getFirst() {
        return first;
    }

    public void setFirst(DLListNode<E> first) {
        this.first = first;
    }

    public DLListNode<E> getLast() {
        return last;
    }

    public void setLast(DLListNode<E> last) {
        this.last = last;
    }

    public int getSize() {
        return this.size;
    }

//    public void setSize(int size) {
//        // Do nothing here
//        // So as to make the list's size immutable,
//        // to prevent its alteration from outside.
//        // Since the List maintains and keeps track of its own size internally
//    }

    public boolean isEmpty() {
        return this.empty;
    }

//    public void setEmpty(boolean empty) {
//        // Do nothing here
//        // So as to make the list's size immutable,
//        // to prevent its alteration from outside code
//    }

    // List operations methods

    /**
     * Adds a new element to the DoublyLinkedList
     *
     * @param newElement the new element to be added to the list
     */
    public void add(DLListNode<E> newElement) {
        if(this.empty) {
            this.first = this.last = newElement;
            this.first.setNext(null);
            this.first.setPrev(null);
            this.size = 1;
            this.empty = false;
        } else {
            // Adds the new element to the tail/end of the list
            this.last.setNext(newElement);
            // Makes the new element the last
            newElement.setNext(null);
            newElement.setPrev(this.last);
            // Update the last to be the new element
            this.last = newElement;
            // Increment the list's size
            this.size++;
        }
    }

    /**
     * Reverses the order of the elements in the DoublyLinkedList
     * so that the first element becomes the last, and the last element
     * becomes the first.
     * This version, 1, of the reverse method, proceeds by traversing the
     * DoublyLinkedList starting from the first to the last.
     */
    public void reverse1() {
        // Do nothing if the list is empty or has only 1 element
        if(this.size > 1) {
            DLListNode<E> currElement = this.first;
            while(currElement.getNext() != null) {
                DLListNode<E> tempNewPrev = currElement.getNext();
                DLListNode<E> tempNewNext = currElement.getPrev();
                if(currElement == this.first) {
                    currElement.setNext(null);
                    currElement.setPrev(tempNewPrev);
                    this.last = currElement;
                } else {
                    currElement.setNext(tempNewNext);
                    currElement.setPrev(tempNewPrev);
                }
                currElement = tempNewPrev;
            }
            currElement.setNext(currElement.getPrev());
            currElement.setPrev(null);
            this.first = currElement;
        }
    }

    /**
     * Reverses the order of the elements in the DoublyLinkedList
     * so that the first element becomes the last, and the last element
     * becomes the first.
     * This version, 2, of the reverse method, proceeds by traversing the
     * DoublyLinkedList starting from the last to the first.
     */
    public void reverse2() {
        if(this.size > 1) {
            DLListNode<E> currElement = this.last;
            while(currElement.getPrev() != null) {
                DLListNode<E> tempNewNext = currElement.getPrev();
                DLListNode<E> tempNewPrev = currElement.getNext();
                if(currElement == this.last) // make last become first
                {
                    currElement.setPrev(null);
                    currElement.setNext(tempNewNext);
                    this.first = currElement;
                } else {
                    currElement.setNext(tempNewNext);
                    currElement.setPrev(tempNewPrev);
                }
                currElement = tempNewNext;
            }
            currElement.setPrev(currElement.getNext());
            currElement.setNext(null);
            this.last = currElement;
        }
    }

    public void printList() {
        if(!this.empty) {
            DLListNode<E> currElement = this.first;
            while(currElement != null) {
                System.out.print(currElement.getValue().toString() + " ");
                currElement = currElement.getNext();
            }
            System.out.println();
        }
    }
}
