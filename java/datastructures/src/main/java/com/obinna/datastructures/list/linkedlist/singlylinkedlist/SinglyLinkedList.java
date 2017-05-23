package com.obinna.datastructures.list.linkedlist.singlylinkedlist;

/**
 * SinglyLinkedList
 *
 * Created by obi on 2017-05-17.
 */
@SuppressWarnings("ALL")
public class SinglyLinkedList<E> {

    private SLListNode<E> first;
    private SLListNode<E> last;
    private int size;
    private boolean empty;

    /**
     * Constructs an empty SinglyLinkedList
     */
    public SinglyLinkedList() {
        this.first = this.last = null;
        this.size = 0;
        this.empty = true;
    }

    /**
     * Constructs a SinglyLinkedList using a given first initial element
     *
     * @param first the first initial element
     */
    public SinglyLinkedList(SLListNode<E> first) {
        this.first = this.last = first;
        this.first.setNext(null);
        this.size = 1;
        this.empty = false;
    }

    public SLListNode<E> getFirst() {
        return first;
    }

    public void setFirst(SLListNode<E> first) {
        this.first = first;
    }

    public SLListNode<E> getLast() {
        return last;
    }

    public void setLast(SLListNode<E> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return empty;
    }

    //-- List operations  methods

    /**
     * Adds a new element to the SinglyLinkedList
     *
     * @param newElement the new element to be added to the list
     */
    public void add(SLListNode<E> newElement) {
        if(this.empty) {
            this.first = this.last = newElement;
            this.first.setNext(null);
            this.size = 1;
            this.empty = false;
        } else {
            // Adds the new element to the tail
            this.last.setNext(newElement);
            // Makes the new element the last
            newElement.setNext(null);
            this.last = newElement;
            // Increment the size
            this.size++;
        }
    }

    /**
     * Reverses the order of the elements in the SinglyLinkedList
     * so that the first element becomes the last, and the last element
     * becomes the first
     */
    public void reverse() {
        // Do nothing if the list is empty or has only 1 element
        if(this.size > 1) {
            SLListNode<E> currElement = this.first;
            SLListNode<E> prevElement = null;
            while (currElement != null) {
                SLListNode<E> temp = currElement.getNext();
                if(currElement == this.first) {
                    // Then make the first, last
                    currElement.setNext(null);
                    this.last = currElement;
                } else {
                    currElement.setNext(prevElement);
                }
                prevElement = currElement;
                currElement = temp;
            }
            this.first = prevElement;
        }
    }

    public void printList() {
        if (!this.empty) {
            SLListNode<E> currElement = this.first;
            while(currElement != null) {
                System.out.print(currElement.getValue().toString() + " ");
                currElement = currElement.getNext();
            }
            System.out.println();
        }
    }
}
