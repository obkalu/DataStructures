package com.obinna.datastructures.singlylinkedlist;

/**
 * ListNode for a SinglyLinkedList.
 * Created by obi on 2017-05-17.
 */
public class SLListNode<E> {

    private SLListNode<E> next;
    private E value;

    // Constructors

    public SLListNode() {
    }

    public SLListNode(E value) {
        this.value = value;
    }

    public SLListNode(SLListNode<E> next, E value) {
        this.next = next;
        this.value = value;
    }

    public SLListNode<E> getNext() {
        return next;
    }

    public void setNext(SLListNode<E> next) {
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
